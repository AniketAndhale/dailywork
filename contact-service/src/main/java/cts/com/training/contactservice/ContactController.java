package cts.com.training.contactservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ContactController {
	@Autowired
 ContactRepo contactrepo;
 @Autowired
 ContactService contactService;
 
 
 @RequestMapping(value = "/contact", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Contact> findAll() {
		return contactrepo.findAll();
	}
	@RequestMapping(value = "/contact/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Contact findOne(@PathVariable int id) {
		Optional<Contact> contact = contactrepo.findById(id);
		Contact comp = contact.get();
		return comp;
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public String save(@RequestBody Contact contact1) {
		String comp=contactService.addContact(contact1);
		return comp;
	}

		
	}
	

