package com.codeEncryption.oneWay.service;

import java.util.ArrayList;

import com.codeEncryption.oneWay.codeObject.CodeEntity;

public interface CodeEncryptionService {

	ArrayList<CodeEntity> getSaltAndHashCode(String asString, String asString2);

}
