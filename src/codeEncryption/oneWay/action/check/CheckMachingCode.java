package codeEncryption.oneWay.action.check;

import codeEncryption.oneWay.action.hash.HashCode;

public class CheckMachingCode {
//	private CodeEntity cObj = new CodeEntity();
//	private Salt ms = new Salt();
	private HashCode hc = new HashCode();
	
	
	public boolean checkMachingCode(String pwdCode, String salt, String hashCode) {
		return checkMachingHashCode(pwdCode, salt, hashCode);
	}
	
	private boolean checkMachingHashCode(String pwdCode, String salt, String hashCode) {
		if(hc.actionOfEncryption(hc.plusStr(salt, pwdCode)).equals(hashCode)){
			return true;
		}
		return false;
	}
	
	
}
