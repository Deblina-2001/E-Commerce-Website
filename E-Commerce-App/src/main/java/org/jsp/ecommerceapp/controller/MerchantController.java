package org.jsp.ecommerceapp.controller;

import org.jsp.ecommerceapp.dto.ResponseStructure;
import org.jsp.ecommerceapp.model.Merchant;
import org.jsp.ecommerceapp.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/merchants")
@CrossOrigin
public class MerchantController 
{
	@Autowired
	private MerchantService merchantservice;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<ResponseStructure<Merchant>>saveMerchant(@RequestBody Merchant merchant,HttpServletRequest request) 
	{
		return merchantservice.saveMerchant(merchant,request);
	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<Merchant>> updateMerchant(@RequestBody Merchant merchant) 
	{
		return merchantservice.updateMerchant(merchant);
	}
	
	@PostMapping("/verify-by-email")
	public ResponseEntity<ResponseStructure<Merchant>> verifyByEmail(@RequestParam String email,@RequestParam String password) {
		return merchantservice.verifyByEmail(email, password);
	}
	
	@PostMapping("/verify-by-phone")
	public ResponseEntity<ResponseStructure<Merchant>> verifyByPhone(@RequestParam long phone,@RequestParam String password) {
		return merchantservice.verifyByPhone(phone, password);
	}
	
	@GetMapping("/activate")
	public ResponseEntity<ResponseStructure<String>>active(@RequestParam String token)
	{
		return merchantservice.active(token);
	}

}
