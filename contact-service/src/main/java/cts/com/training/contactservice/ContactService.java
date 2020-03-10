package cts.com.training.contactservice;

import java.util.List;

public interface ContactService {
public String addContact(Contact contact);
	
	
	public List<Contact> getAllContact();
	
	public Contact getOne(int id);
}
