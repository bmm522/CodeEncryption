package codeEncryption.oneWay.main;

import java.util.ArrayList;

import codeEncryption.oneWay.codeObject.CodeObject;

public class CodeEncryptionOfOneWay {
	private String idCode;
	private String pwdCode;
	
	public CodeEncryptionOfOneWay(String idCode, String pwdCode) {
		this.idCode = idCode;
		this.pwdCode = pwdCode;
	}
	
	public ArrayList<CodeObject> getEncryptingCode() {
		ArrayList<CodeObject> co = new ArrayList<CodeObject>();
		return co;
	}
	
	
}
