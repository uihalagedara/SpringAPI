package com.springapi.demo.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name="User")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name="ID")
    @GeneratedValue
    private int id;

    @Column(name="FirstName")
    private String fname;

    @Column(name="LastName")
    private String lname;

    @Column(name="Age")
    private int age;

    @Column(name="NIC")
    private String nic;

    public User(UserModel userModel) {
        this.age=userModel.age;
        this.id=userModel.id;
        this.fname=userModel.fname;
        this.lname=userModel.lname;
        this.nic=userModel.nic;
    }
}
