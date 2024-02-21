package com.example.demospringdatarest.demo.entity.repository;

import com.example.demospringdatarest.demo.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "contact", collectionResourceRel ="contacts")
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
