package codeEncryption.oneWay.main;

import java.util.ArrayList;

import codeEncryption.oneWay.action.CheckMachingCode;
import codeEncryption.oneWay.codeObject.CodeEntity;

public class CodeEncryptionOfOneWay {
	private String idCode;
	private String pwdCode;
	private CheckMachingCode ma = new CheckMachingCode();
	public CodeEncryptionOfOneWay(String idCode, String pwdCode) {
		this.idCode = idCode;
		this.pwdCode = pwdCode;
	}
	
	public ArrayList<CodeEntity> getEncryptingCode() {
		return getArrayListOfCodeEncryptionOfOneWay();
	}

	private ArrayList<CodeEntity> getArrayListOfCodeEncryptionOfOneWay() {
		ArrayList<CodeEntity> co = new ArrayList<CodeEntity>();
		co.add(ma.actionOfEncryptingCode(idCode, pwdCode));
		return co;
	}
	
	
}
