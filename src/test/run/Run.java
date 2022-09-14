package test.run;

import java.util.ArrayList;

import codeEncryption.oneWay.action.check.CheckMachingCode;
import codeEncryption.oneWay.codeObject.CodeEntity;
import codeEncryption.oneWay.main.CodeEncryptionOfOneWay;

public class Run {
	public static void main(String[] args) {
		String id = "bmm522";
		String pwd = "1234";
		ArrayList<CodeEntity> arr = new ArrayList<CodeEntity>();
		CheckMachingCode ma = new CheckMachingCode();
		CodeEncryptionOfOneWay cw = new CodeEncryptionOfOneWay(id, pwd);
		arr = cw.getEncryptingCode();
		
		System.out.println(arr.get(0).getIdCode()+", "
						 + arr.get(0).getSaltCode()+", "
				         + arr.get(0).getHashCode());
		
		if(ma.checkMachingCode(id, pwd, "q3PQaVhB26STXLaWSer74w==", "fc4fd4216086f578249f6fa096cd76bee051106826826742e7825d6c1651f262")) {
			System.out.println("일치");
		} else {
			System.out.println("불일치");
		}
		
	}
}
