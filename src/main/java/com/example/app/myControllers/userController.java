package com.example.app.myControllers;

import com.example.app.entity.User;
import com.example.app.service.userService;
import com.example.app.util.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {
    Logger logger = LoggerFactory.getLogger(userController.class);
    @Autowired
    userService userService;

    @PostMapping("/save-user")
    public ResponseEntity<Message> saveUser(@RequestBody User user) {
        this.logger.info("saveUser method started");
        Message message = new Message();
        ResponseEntity<Message> responseEntity = null;
        try {
            this.userService.save(user);
            this.logger.info("user saved");
            message.setMessage("user " + user.getName() + " has been saved!!!");
            responseEntity = new ResponseEntity<Message>(message, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            this.logger.error(e.getMessage());
            message.setMessage("OOOPPPs........!!! " + e.getMessage());
            responseEntity = new ResponseEntity<Message>(message, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        this.logger.error("saveUser ended");
        return responseEntity;
    }

    @GetMapping("/get-users/{page}")
    public ResponseEntity getUsers(@PathVariable int page) {

        ResponseEntity responseEntity = null;
        this.logger.info("getUsers method started");
        try {
            Page<User> users = this.userService.getUsers(PageRequest.of(page, 5));
            responseEntity = new ResponseEntity(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

        this.logger.info("getUsers ended");
        return responseEntity;
    }

    @DeleteMapping("/delete-user/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id) {
        this.logger.info("deleteUser method started");
        ResponseEntity responseEntity = null;
        try {
            this.userService.deleteUser(id);
            responseEntity = new ResponseEntity("record deleted!!!", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        this.logger.info("deleteUser ended");
        return responseEntity;
    }
    @PutMapping("/update-user/{id}")
    public ResponseEntity<Message> updateUser(@RequestBody User user,@PathVariable Long id) {
        this.logger.info("updateUser method started");
        Message message = new Message();
        ResponseEntity<Message> responseEntity = null;
        try {
            this.userService.updateUser(user,id);
            this.logger.info("user edited");
            message.setMessage("user " + user.getName() + " has been updated!!!");
            responseEntity = new ResponseEntity<Message>(message, HttpStatus.OK);
        } catch (Exception e) {
            this.logger.error(e.getMessage());
            message.setMessage("OOOPPPs........!!! " + e.getMessage());
            responseEntity = new ResponseEntity<Message>(message, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        this.logger.info("updateUser ended");
        return responseEntity;
    }
    @GetMapping("/get-user/{id}")
    public ResponseEntity getUser(@PathVariable Long id) {
        this.logger.info("getUser method started");
        ResponseEntity responseEntity = null;
        try {
            User user = this.userService.getUser(id);
            responseEntity = new ResponseEntity(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        this.logger.info("getUser ended");
        return responseEntity;
    }
}
