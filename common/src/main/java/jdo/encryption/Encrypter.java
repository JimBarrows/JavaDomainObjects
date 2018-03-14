package jdo.encryption;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import static org.apache.commons.lang3.StringUtils.isEmpty;

public class Encrypter {

	private static String INITIALIZATION_VECTOR = isEmpty(System.getenv("jdo.encryption.Encrypter.INITIALIZATION_VECTOR")) ? "Handle-Above-Shu" : System.getenv("jdo.encryption.Encrypter.INITIALIZATION_VECTOR");
	private static String ENCRYPTION_KEY = isEmpty(System.getenv("jdo.encryption.Encrypter.ENCRYPTION_KEY")) ? "Discovery-Scorn-Wife-OarCountry7" : System.getenv("jdo.encryption.Encrypter.ENCRYPTION_KEY");

	public static String encrypt(String plainText) {
		try {
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
			SecretKeySpec key = new SecretKeySpec(ENCRYPTION_KEY.getBytes("UTF-8"), "AES");
			cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(INITIALIZATION_VECTOR.getBytes("UTF-8")));
			return new String(cipher.doFinal(plainText.getBytes("UTF-8")));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static String decrypt(String cipherText) {
		try {
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
			SecretKeySpec key = new SecretKeySpec(ENCRYPTION_KEY.getBytes("UTF-8"), "AES");
			cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(INITIALIZATION_VECTOR.getBytes("UTF-8")));
			return new String(cipher.doFinal(cipherText.getBytes()), "UTF-8");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
