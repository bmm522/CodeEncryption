package codeEncryption.oneWay.action;

import codeEncryption.oneWay.action.hash.HashCode;

public class CheckMachingCode {
//	private CodeEntity cObj = new CodeEntity();
//	private Salt ms = new Salt();
	private HashCode hc = new HashCode();
	
	
	public boolean checkMachingCode(String idCode, String pwdCode, String salt, String hashCode) {
		return hc.checkMachingHashCode(idCode, pwdCode, salt, hashCode);
	}
}
