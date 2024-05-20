package org.jsp.ecommerceapp.dao;

import java.util.Optional;

import org.jsp.ecommerceapp.model.Merchant;
import org.jsp.ecommerceapp.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MerchantDao
{
	@Autowired
	private MerchantRepository merchantrepository;
	
	public Merchant saveMerchant(Merchant merchant)
	{
		return merchantrepository.save(merchant);
	}
	
	public Optional<Merchant> findById(int id)
	{
		return merchantrepository.findById(id);
	}
	
	public Optional<Merchant> verifyMerchantById(int id, String password)
	{
		return merchantrepository.verifyById(id, password);
	}
	
	public Optional<Merchant> verifyMerchantByEmail(String email,String password)
	{
		return merchantrepository.verifyByEmail(email,password);
		
	}

	public Optional<Merchant> verifyMerchantByPhone(long phone, String password) {
		return merchantrepository.verifyByPhone(phone, password);
	}
	
	public Optional<Merchant> findByToken(String token)
	{
		return merchantrepository.findByToken(token);
	}
}
