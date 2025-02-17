package com.service.blog.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")  // MongoDB collection name
@Data
public class Users {

    @Id
    private String id;  // MongoDB automatically assigns an ID
    private String username;
    private String email;
    private String password;  // You would want to store hashed passwords
    private String role;  // Role like "USER", "ADMIN"
    private boolean active = true;  // Default active status
    private String createdAt;  // Date when the user registered (optional)

    // Constructors, getters, setters can be generated using Lombok (@Data annotation)
}
