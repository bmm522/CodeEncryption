package com.codeEncryption.oneWay.action.check;

import com.codeEncryption.oneWay.action.hash.HashCode;

public class CheckMatchingCode {

	private HashCode hc = new HashCode();
	
	
	public boolean checkMatchingCode(String pwdCode, String salt, String hashCode) {
		return checkMatchingHashCode(pwdCode, salt, hashCode);
	}
	
	private boolean checkMatchingHashCode(String pwdCode, String salt, String hashCode) {
		if(hc.actionOfEncryption(hc.plusStr(salt, pwdCode)).equals(hashCode)){
			return true;
		}
		return false;
	}
	
	
}
