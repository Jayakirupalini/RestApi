package com.example.day4post.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String furnitureCategory;
    private String furnitureDescription;
    private String furnitureColor;
    private int quantity;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getFurnitureCategory()
    {
        return furnitureCategory;
    }

    public void setFurnitureCategory(String furnitureCategory)
    {
        this.furnitureCategory=furnitureCategory;
    }

    public String getFurnitureDescription()
    {
        return furnitureDescription;
    }

    public void setFurnitureDescription(String furnitureDescription)
    {
        this.furnitureDescription=furnitureDescription;
    }
    public String getFurnitureColor()
    {
        return furnitureColor;
    }

    public void setFurnitureColor(String furnitureColor)
    {
        this.furnitureColor=furnitureColor;
    }
    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
    public User(int id, String firstName, String lastName, String email, String password, String furnitureCategory, String furnitureDescription, String furnitureColor, int quantity) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.furnitureCategory=furnitureCategory;
        this.furnitureDescription=furnitureDescription;
        this.furnitureColor=furnitureColor;
        this.quantity=quantity;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public User() {
    }

}
