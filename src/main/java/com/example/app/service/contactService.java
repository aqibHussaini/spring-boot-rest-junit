//package com.example.app.service;
//import com.example.app.entity.Contact;
//import com.example.app.entity.User;
//import com.example.app.repository.contactRepository;
//import com.example.app.repository.userReopository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class contactService {
//    @Autowired
//    contactRepository contactRepository;
//    @Autowired
//    userReopository userReopository;
//    public Contact save(Contact contact)
//    {
//        return  this.contactRepository.save(contact);
//    }
//    public List<Contact> getContacts()
//    {
//        return  this.contactRepository.findAll();
//    }
//    public Contact update(Contact contact,Long id)
//    {
//        Contact obj=this.contactRepository.findById(id).get();
//        obj.setName(contact.getName());
//        obj.setRelation(contact.getRelation());
//        obj.setPicture(contact.getPicture());
//        obj.setInstagram_link(contact.getInstagram_link());
//        obj.setFacebook_link(contact.getFacebook_link());
//        obj.setAddress(contact.getAddress());
//        obj.setEmail(contact.getEmail());
//        obj.setUser(contact.getUser());
//        return  this.contactRepository.save(obj);
//    }
//    public List<Contact> getUserContacts(Long user_id)
//    {
//        return  this.contactRepository.findByUser(this.userReopository.findById(user_id).get());
//    }
//    public Contact getContact(Long id)
//    {
//        return  this.contactRepository.findById(id).get();
//    }
//    public void delete(Long id)
//    {
//          this.contactRepository.deleteById(id);
//    }
//}
