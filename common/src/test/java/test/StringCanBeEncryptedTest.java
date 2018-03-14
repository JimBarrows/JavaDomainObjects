package test;

import test.utils.GwtTemplate;

import static jdo.encryption.Encrypter.encrypt;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;
import static org.junit.Assert.assertTrue;

public class StringCanBeEncryptedTest extends GwtTemplate {

	private String stringToEncrypt;
	private String encryptedString;

	@Override
	public void givenTheFollowing() {

		stringToEncrypt = "This should be an encrypted string";
	}

	@Override
	public void whenTheFollowing() {

		encryptedString = encrypt(stringToEncrypt);

	}

	@Override
	public void thenTheFollowing() {
		assertTrue(isNotEmpty(encryptedString));
	}
}
