package jdo.encryption;

import sun.misc.BASE64Encoder;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Encrypter {
	private static Encrypter ourInstance = new Encrypter();

	public static Encrypter getInstance() {
		return ourInstance;
	}

	public static String encryptThis( String stringToEncrypt) {
		return Encrypter.getInstance().encryptTheData(stringToEncrypt);
	}

	private SecretKey secretKey;
	private SecureRandom prng = new SecureRandom();

	private Cipher aesCipherForEncryption;


	/**
	 * Change this as desired for the security level you want
	 */
	private final int AES_KEYLENGTH = 128;

	private byte[] iv = new byte[AES_KEYLENGTH / 8];  // Save the IV bytes or send it in plaintext with the encrypted data so you can decrypt the data later

	private Encrypter() {
		try {
			generateAnAESKey();
			generateAnInitializationVector();
			createACipher();
			initializeTheCipherForEncryption();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidAlgorithmParameterException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		}
	}

	private void initializeTheCipherForEncryption() throws InvalidAlgorithmParameterException, InvalidKeyException {
		aesCipherForEncryption.init(Cipher.ENCRYPT_MODE, secretKey,
				new IvParameterSpec(iv));
	}

	private void createACipher() throws NoSuchPaddingException, NoSuchAlgorithmException {
		// Must specify the mode explicitly as most JCE providers default to ECB mode!!
		aesCipherForEncryption = Cipher.getInstance("AES/CBC/PKCS7PADDING");
	}

	private void generateAnInitializationVector() {
		prng.nextBytes(iv);
	}

	private void generateAnAESKey() throws NoSuchAlgorithmException {
		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		keyGen.init(128);
		secretKey = keyGen.generateKey();
	}

	public String encryptTheData(String strDataToEncrypt) {
		byte[] byteDataToEncrypt = strDataToEncrypt.getBytes();
		byte[] byteCipherText = new byte[0];
		try {
			byteCipherText = aesCipherForEncryption.doFinal(byteDataToEncrypt);
			return new BASE64Encoder().encode(byteCipherText);
		} catch (IllegalBlockSizeException e) {
			throw new RuntimeException(e);
		} catch (BadPaddingException e) {
			throw new RuntimeException(e);
		}

	}

}
