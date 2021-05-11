//package com.example.app.myControllers;
//
//import com.example.app.entity.Contact;
//import com.example.app.entity.User;
//import com.example.app.repository.userReopository;
//import com.example.app.service.contactService;
//import com.example.app.util.Message;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/contact")
//public class contactController {
//    Logger logger = LoggerFactory.getLogger(userController.class);
//    @Autowired
//    contactService contactService;
//    @Autowired
//    userReopository userReopository;
//
//    @GetMapping("/user-contacts/{user_id}")
//    public List<Contact> home(@PathVariable Long user_id) {
//        return this.contactService.getUserContacts(user_id);
//    }
//
//    @GetMapping("/get-contacts")
//    public List<Contact> getContacts() {
//        return this.contactService.getContacts();
//    }
//
//    @GetMapping("/get-contact/{id}")
//    public Contact getContact(@PathVariable Long id) {
//        Contact  contact=null;
//        try {
//           contact=this.contactService.getContact(id);
//        } catch (Exception e) {
//            this.logger.error("" + e.getMessage());
//        }
//        return contact;
//    }
//
//    @DeleteMapping("/delete-contact/{id}")
//    public void delete(@PathVariable Long id) {
//        this.contactService.delete(id);
//    }
//
//    @PutMapping("/update-contact/")
//    public Contact update(@PathVariable Long id, @RequestBody Contact contact) {
//        return this.contactService.update(contact, id);
//    }
//
//    @PostMapping("/save-contact/{user_id}")
//    public ResponseEntity<Message> saveContact(@RequestBody Contact contact, @PathVariable Long user_id) {
//        this.logger.info("saveContact method started");
//        Message message = new Message();
//        ResponseEntity<Message> responseEntity = null;
//        try {
//            contact.setUser(this.userReopository.findById(user_id).get());
//            this.contactService.save(contact);
//            this.logger.info("contact saved" + contact.getUser());
//            message.setMessage("contact " + contact.toString() + " has been saved!!!");
//            responseEntity = new ResponseEntity<Message>(message, HttpStatus.OK);
//        } catch (Exception e) {
//            this.logger.error(e.getMessage());
//            message.setMessage("OOOPPPs........!!! " + e.getMessage());
//            responseEntity = new ResponseEntity<Message>(message, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//        this.logger.error("saveContact ended");
//        return responseEntity;
//    }
//}
