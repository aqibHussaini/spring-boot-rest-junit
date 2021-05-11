//package com.example.app.entity;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//import org.hibernate.engine.profile.Fetch;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Entity
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    @Column(name = "name",length = 255,unique = true)
//    private String name;
//    @Column(name = "picture",length = 255)
//    private String picture;
//    @Column(name = "email",length = 255,unique = true)
//    private String email;
//    @Column(name = "password",length = 255)
//    private String password;
//    @CreationTimestamp
//    @Column(name = "created_at")
//    private LocalDateTime created_at;
//    @UpdateTimestamp
//    @Column(name = "updated_at")
//    private LocalDateTime updated_at;
//    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    @JsonBackReference
//    private List<Contact> contacts;
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", picture='" + picture + '\'' +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", created_at=" + created_at +
//                ", updated_at=" + updated_at +
//                ", contacts=" + contacts +
//                '}';
//    }
//
//    public User(String name, String role, String email, String password, LocalDateTime created_at, LocalDateTime updated_at, List<Contact> contacts) {
//        this.name = name;
//        this.picture = role;
//        this.email = email;
//        this.password = password;
//        this.created_at = created_at;
//        this.updated_at = updated_at;
//        this.contacts = contacts;
//    }
//
//    public String getPicture() {
//        return picture;
//    }
//
//    public void setPicture(String picture) {
//        this.picture = picture;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public LocalDateTime getCreated_at() {
//        return created_at;
//    }
//
//    public void setCreated_at(LocalDateTime created_at) {
//        this.created_at = created_at;
//    }
//
//    public LocalDateTime getUpdated_at() {
//        return updated_at;
//    }
//
//    public void setUpdated_at(LocalDateTime updated_at) {
//        this.updated_at = updated_at;
//    }
//
//    public List<Contact> getContacts() {
//        return contacts;
//    }
//
//    public void setContacts(List<Contact> contacts) {
//        this.contacts = contacts;
//    }
//
//    public User() {
//    }
//
//    public User(String name, String email, String password, LocalDateTime created_at, LocalDateTime updated_at, List<Contact> contacts) {
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.created_at = created_at;
//        this.updated_at = updated_at;
//        this.contacts = contacts;
//    }
//
//    public User(Long id, String name, String email, String password, LocalDateTime created_at, LocalDateTime updated_at, List<Contact> contacts) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.created_at = created_at;
//        this.updated_at = updated_at;
//        this.contacts = contacts;
//    }
//}
