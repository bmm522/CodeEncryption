package codeEncryption.oneWay.action;

import codeEncryption.oneWay.action.hash.HashCode;
import codeEncryption.oneWay.action.salt.Salt;
import codeEncryption.oneWay.codeObject.CodeEntity;

public class CheckMachingCode {
	private CodeEntity cObj = new CodeEntity();
	private Salt ms = new Salt();
	private HashCode hc = new HashCode();
	
	public CodeEntity actionOfEncryptingCode(String idCode, String pwdCode) {
		cObj.setIdCode(idCode);
		cObj.setSaltCode(ms.actionOfMakeSalt());
		cObj.setHashCode(hc.actionOfMakeHash(ms.getSalt(), pwdCode));
		return cObj;
	}
	
	public boolean checkMachingCode(String idCode, String pwdCode, String salt, String hashCode) {
		return hc.checkMachingHashCode(idCode, pwdCode, salt, hashCode);
	}
}
