package com.crm.crm.loader;

import com.crm.crm.model.Contact;
import com.crm.crm.repository.ContactRepoistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ContactLoader implements CommandLineRunner {

    private final  ContactRepoistory repoistory;

    @Autowired
    public ContactLoader(ContactRepoistory repoistory){
        this.repoistory = repoistory;
    }

    @Override
    public void run(String... args) throws Exception {
        this.repoistory.save(new Contact("yakoub" , "ould bouchiba" , "yakoubouldbouchiba@gmail.com"));
    }
}
