package codeEncryption.oneWay.main;

import java.util.ArrayList;

import codeEncryption.oneWay.action.CheckMachingCode;
import codeEncryption.oneWay.action.hash.HashCode;
import codeEncryption.oneWay.action.salt.Salt;
import codeEncryption.oneWay.codeObject.CodeEntity;

public class CodeEncryptionOfOneWay {
	private String idCode;
	private String pwdCode;
	private CodeEntity cObj = new CodeEntity();
	private Salt ms = new Salt();
	private HashCode hc = new HashCode();
	private CheckMachingCode ma = new CheckMachingCode();
	
	public CodeEncryptionOfOneWay(String idCode, String pwdCode) {
		this.idCode = idCode;
		this.pwdCode = pwdCode;
	}
	
	public ArrayList<CodeEntity> getEncryptingCode() {
		return getArrayListOfCodeEncryptionOfOneWay();
	}

	private ArrayList<CodeEntity> getArrayListOfCodeEncryptionOfOneWay() {
		ArrayList<CodeEntity> ce = new ArrayList<CodeEntity>();
		ce.add(actionOfEncryptingCode(idCode, pwdCode));
		return ce;
	}
	
	public CodeEntity actionOfEncryptingCode(String idCode, String pwdCode) {
		cObj.setIdCode(idCode);
		cObj.setSaltCode(ms.actionOfMakeSalt());
		cObj.setHashCode(hc.actionOfMakeHash(ms.getSalt(), pwdCode));
		return cObj;
	}
	
	
}
