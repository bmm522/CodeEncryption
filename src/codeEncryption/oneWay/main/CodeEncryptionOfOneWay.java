package codeEncryption.oneWay.main;

import java.util.ArrayList;

import codeEncryption.oneWay.action.CheckMachingCode;
import codeEncryption.oneWay.codeObject.CodeObject;

public class CodeEncryptionOfOneWay {
	private String idCode;
	private String pwdCode;
	private CheckMachingCode ma = new CheckMachingCode();
	public CodeEncryptionOfOneWay(String idCode, String pwdCode) {
		this.idCode = idCode;
		this.pwdCode = pwdCode;
	}
	
	public ArrayList<CodeObject> getEncryptingCode() {
		return getArrayListOfCodeEncryptionOfOneWay();
	}

	private ArrayList<CodeObject> getArrayListOfCodeEncryptionOfOneWay() {
		ArrayList<CodeObject> co = new ArrayList<CodeObject>();
		co.add(ma.actionOfEncryptingCode(idCode, pwdCode));
		return co;
	}
	
	
}
