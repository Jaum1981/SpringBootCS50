package com.dailycodework.dream_shops.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image {

    @Id
    @GeneratedValue
    private Integer id;
    private String fileName;
    private String fileType;

    @Lob
    private Blob imageBlob; //Binary Large Object???
    private String downloadURL;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
