package com.codeEncryption.oneWay.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.codeEncryption.oneWay.codeObject.CodeEntity;
import com.codeEncryption.oneWay.main.CodeEncryptionOfOneWay;

@Service
public class CodeEncryptionServiceImpl implements CodeEncryptionService{

	@Override
	public ArrayList<CodeEntity> getSaltAndHashCode(String id, String pwd) {
		CodeEncryptionOfOneWay codeEncryptionOfOneWay = new CodeEncryptionOfOneWay(id, pwd);
		return  codeEncryptionOfOneWay.getEncryptingCode();
		}

}
