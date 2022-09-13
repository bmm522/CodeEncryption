package codeEncryption.oneWay.action;

import codeEncryption.oneWay.action.hash.HashCode;

public class CheckMachingCode {
//	private CodeEntity cObj = new CodeEntity();
//	private Salt ms = new Salt();
	private HashCode hc = new HashCode();
	
	
	public boolean checkMachingCode(String idCode, String pwdCode, String salt, String hashCode) {
		return checkMachingHashCode(idCode, pwdCode, salt, hashCode);
	}
	
	public boolean checkMachingHashCode(String idCode, String pwdCode, String salt, String hashCode) {
		if(hc.actionOfEncryption(hc.plusStr(salt, pwdCode)).equals(hashCode)){
			return true;
		}
		return false;
	}
	
	
}
