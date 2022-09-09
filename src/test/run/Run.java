package test.run;

import java.util.ArrayList;

import codeEncryption.oneWay.codeObject.CodeObject;
import codeEncryption.oneWay.main.CodeEncryptionOfOneWay;

public class Run {
	public static void main(String[] args) {
		String id = "bmm522";
		String pwd = "1234";
		ArrayList<CodeObject> arr = new ArrayList<CodeObject>();
		CodeEncryptionOfOneWay cw = new CodeEncryptionOfOneWay(id, pwd);
		arr = cw.getEncryptingCode();
		
		System.out.println(arr.get(0).getIdCode()+", "
						 + arr.get(0).getSaltCode()+", "
				         + arr.get(0).getHashCode());
	}
}
