package cts.com.training.contactservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact, Integer> {

}

