package com.crm.crm.repository;

import com.crm.crm.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepoistory  extends CrudRepository<Contact , Long> {
}
