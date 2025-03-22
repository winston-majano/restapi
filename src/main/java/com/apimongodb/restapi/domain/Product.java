package com.apimongodb.restapi.domain;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "Product")
public class Product {
    @Id
    @NonNull
    private int id;
    private String imagePath;
    private String title;
    private String description;


    public Product(int id, String imagePath, String title, String description) {
        this.id = id;
        this.imagePath = imagePath;
        this.title = title;
        this.description = description;
    }
}
