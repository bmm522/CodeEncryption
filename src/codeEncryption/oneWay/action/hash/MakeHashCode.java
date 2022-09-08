package codeEncryption.oneWay.action.hash;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MakeHashCode {
	private String hash = "";
	
	public String actionOfMakeHash(String salt, String pwdCode) {
		return gethash(salt, pwdCode);
	}

	private String gethash(String salt, String pwdCode) {
		return actionOfEncryption(plusStr(salt,pwdCode));
	}

	private String actionOfEncryption(String plusStr) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(plusStr.getBytes());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return String.format("%064x", new BigInteger(1, md.digest()));
		
	}

	private String plusStr(String salt, String pwdCode) {
		return salt+pwdCode;
		
	}

}
