package com.scp.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "book")
public class Book {
    private int bookId;
    private String bookName;
    private String isbn;
    private String publisherName;
    private String author;
    private double price;

}
