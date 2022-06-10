package com.sts.contactService.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.sts.contactService.entity.Contacts;

@Service
public class ContactService {

List<Contacts> contactList=List.of(new Contacts(1,"hshsb",1),new Contacts(1,"hshsb",1));

public List<Contacts> getContacts(int uid){
  return this.contactList.stream().filter(contact -> contact.getCid()==uid).collect(Collectors.toList());
}
}
