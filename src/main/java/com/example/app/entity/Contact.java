package com.example.app.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name",length = 255)
    private String name;
    @Column(name = "picture",length = 255)
    private String picture;
    @Column(length = 255)
    private String relation;
    @Column(name = "contact",length = 15)
    private String contact_number;
    @Column(length = 255)
    private String email;
    @Column(length = 255)
    private String facebook_link;
    @Column(length = 255)
    private String instagram_link;
    private String address;
    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime created_at;
    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updated_at;
    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JsonManagedReference
    private User user;

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", relation='" + relation + '\'' +
                ", contact_number='" + contact_number + '\'' +
                ", email='" + email + '\'' +
                ", facebook_link='" + facebook_link + '\'' +
                ", instagram_link='" + instagram_link + '\'' +
                ", address='" + address + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook_link() {
        return facebook_link;
    }

    public void setFacebook_link(String facebook_link) {
        this.facebook_link = facebook_link;
    }

    public String getInstagram_link() {
        return instagram_link;
    }

    public void setInstagram_link(String instagram_link) {
        this.instagram_link = instagram_link;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Contact() {
    }

    public Contact(String name, String relation, String contact_number, String email, String facebook_link, String instagram_link, String address, LocalDateTime created_at, LocalDateTime updated_at, User user) {
        this.name = name;
        this.relation = relation;
        this.contact_number = contact_number;
        this.email = email;
        this.facebook_link = facebook_link;
        this.instagram_link = instagram_link;
        this.address = address;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.user = user;
    }

    public Contact(String name, String picture, String relation, String contact_number, String email, String facebook_link, String instagram_link, String address, LocalDateTime created_at, LocalDateTime updated_at, User user) {
        this.name = name;
        this.picture = picture;
        this.relation = relation;
        this.contact_number = contact_number;
        this.email = email;
        this.facebook_link = facebook_link;
        this.instagram_link = instagram_link;
        this.address = address;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.user = user;
    }
    public Contact(Long id, String name, String relation, String contact_number, String email, String facebook_link, String instagram_link, String address, LocalDateTime created_at, LocalDateTime updated_at, User user) {
        this.id = id;
        this.name = name;
        this.relation = relation;
        this.contact_number = contact_number;
        this.email = email;
        this.facebook_link = facebook_link;
        this.instagram_link = instagram_link;
        this.address = address;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.user = user;
    }
}
