package com.codeEncryption.oneWay.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codeEncryption.oneWay.Service.CodeEncryptionService;
import com.codeEncryption.oneWay.codeObject.CodeEntity;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

@CrossOrigin(origins="http://127.0.0.1:5501/", allowedHeaders="http://127.0.0.1:5501/")
@RestController
public class CodeEncryptionController {
	
	@Autowired
	CodeEncryptionService codeEncryptionService;
	
	@PostMapping("/code-encryption")
	@ResponseBody
	public  Map<String, object> getSaltAndHashCode(@RequestBody String data) {
		HashMap<String,Object> codeEncryptionMap = new HashMap<String,Object>();
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(data);
		ArrayList<CodeEntity> codeEntity = new ArrayList<CodeEntity>();
		codeEntity = codeEncryptionService.getSaltAndHashCode(element.getAsJsonObject().get("userId").getAsString(),
																							 element.getAsJsonObject().get("userId").getAsString());
		
		codeEncryptionMap.put("id", codeEntity.get(0).getIdCode());
		codeEncryptionMap.put("salt", codeEntity.get(0).getSaltCode());
		codeEncryptionMap.put("hashCode", codeEntity.get(0).getHashCode());
		
		return codeEncryptionMap;
		
		
	}


}	
