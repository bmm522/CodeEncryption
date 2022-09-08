package codeEncryption.oneWay;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class CodeEncryptionOfOneWay {
	private String code;
	private String salt;
	
	public CodeEncryptionOfOneWay() {
		
	}
	
	public CodeEncryptionOfOneWay(String code) {
		this.code = code;
	}
	
	public static String codeWithSaltEncryption(String code) {
		return codeWithSaltEncryptionString(code);
	}
	
	private static String codeEncryptionString(String code) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(code.getBytes());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return String.format("%064x", new BigInteger(1, md.digest()));
	}
	
	private static String codeWithSaltEncryptionString(String code) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(makeSalt(code).getBytes());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return String.format("%064x", new BigInteger(1, md.digest()));
	}

	private static byte[] makeRandomByteArr() {
		SecureRandom random = null;
		byte[] randomByte = null;
		try {
			random = SecureRandom.getInstance("SHA1PRNG");
			randomByte = new byte[16];
			random.nextBytes(randomByte);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return randomByte;
	}
	
	@SuppressWarnings("unused")
	private static String makeSalt(String code) {
		byte[] randomByte = makeRandomByteArr();
		String salt = new String(Base64.getEncoder().encode(randomByte));
		return salt+code;
	}
	
	public static String getSalt(String code) {
		return makeSalt(code);
	}
	

}
