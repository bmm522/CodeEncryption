package codeEncryption.oneWay.action;

import codeEncryption.oneWay.action.hash.MakeHashCode;
import codeEncryption.oneWay.action.salt.MakeSalt;
import codeEncryption.oneWay.codeObject.CodeObject;

public class MainAction {
	private CodeObject cObj = new CodeObject();
	private MakeSalt ms = new MakeSalt();
	private MakeHashCode hc = new MakeHashCode();
	
	public CodeObject actionOfEncryptingCode(String idCode, String pwdCode) {
		cObj.setIdCode(idCode);
		cObj.setSaltCode(ms.actionOfMakeSalt());
		cObj.setHashCode(hc.actionOfMakeHash(ms.getSalt(), pwdCode));
		return cObj;
	}
}
