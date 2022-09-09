package codeEncryption.oneWay.action;

import codeEncryption.oneWay.action.hash.HashCode;
import codeEncryption.oneWay.action.salt.Salt;
import codeEncryption.oneWay.codeObject.CodeObject;

public class MainAction {
	private CodeObject cObj = new CodeObject();
	private Salt ms = new Salt();
	private HashCode hc = new HashCode();
	
	public CodeObject actionOfEncryptingCode(String idCode, String pwdCode) {
		cObj.setIdCode(idCode);
		cObj.setSaltCode(ms.actionOfMakeSalt());
		cObj.setHashCode(hc.actionOfMakeHash(ms.getSalt(), pwdCode));
		return cObj;
	}
	
	public boolean checkMachingCode(String idCode, String pwdCode, String salt, String hashCode) {
		return hc.checkMachingHashCode(idCode, pwdCode, salt, hashCode);
	}
}
