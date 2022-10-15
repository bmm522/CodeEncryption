package com.codeEncryption.oneWay.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeEncryptionController {
	
	@PostMapping("/code-encryption")
	public void actionTest() {
		System.out.println("통신성공");
	}


}	
