package cts.com.training.contactservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	ContactRepo contactrepo;
	

	@Override
	public String addContact(Contact contact) {
		Contact contact1 = new Contact();
		BeanUtils.copyProperties(contact, contact);
		contact1 = contactrepo.save(contact1);
		if (contact1 != null) {
			return "{\"res\":\"1\"}";
		} else {
			return "{\"res\":\"0\"}";
		}
	}


	public List<Contact> getAllContact() {
		return contactrepo.findAll();
				
	}

	@Override
	public Contact getOne(int id) {
		Optional<Contact> comp = contactrepo.findById(id);
		Contact contact = comp.get();
		return contact;
	}

	

}

