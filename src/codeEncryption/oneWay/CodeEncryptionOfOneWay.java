package codeEncryption.oneWay;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class CodeEncryptionOfOneWay {
	private static String code;
	private static String salt;
	public static void main(String[] args) {
		String codeex = "1234";
		System.out.println(codeWithSaltEncryption());
		System.out.println(codeEncryptionString(codeex));
		System.out.println(getSalt());
	}
	public CodeEncryptionOfOneWay() {
		
	}
	
	public CodeEncryptionOfOneWay(String code) {
		this.code = code;
		this.salt = getSalt();
	}
	
	public static String codeWithSaltEncryption() {
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
			md.update(getSalt().getBytes());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return String.format("%064x", new BigInteger(1, md.digest()));
	}
	
	private static boolean compareEncrypingCode(String checkCode) {
		String checkString = salt+checkCode;
		String compareCode = "";
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(checkString.getBytes());
			compareCode = String.format("%64x", new BigInteger(1, md.digest()));
		} catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return checkEncrypingCode(compareCode);
	}
	
	private static boolean checkEncrypingCode(String compareCode) {
		if(compareCode.equals(codeWithSaltEncryption())) {
			return true;
		} 
		return false;
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
	private static String getSalt(String code) {
		byte[] randomByte = makeRandomByteArr();
		String salt = new String(Base64.getEncoder().encode(randomByte));
		return salt;
	}
	
	public static String getSalt() {
		return makeSalt(code);
	}
	

}
