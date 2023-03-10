package com.crm.crm.controller;


import com.crm.crm.model.Contact;
import com.crm.crm.repository.ContactRepoistory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.Collection;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactsController {
    private ContactRepoistory contactRepoistory;


    public ContactsController(ContactRepoistory contactRepoistory) {
        this.contactRepoistory = contactRepoistory;
    }

    @GetMapping("/contacts")
    Collection<Contact> contacts(){
        return (Collection<Contact>) contactRepoistory.findAll();
    }


    @PostMapping("/contacts")
    ResponseEntity<Contact> createContent(@Validated @RequestBody Contact contact) throws URISyntaxException {
        Contact resContact = contactRepoistory.save(contact);
        return  ResponseEntity.ok().body(resContact);
    }


}
