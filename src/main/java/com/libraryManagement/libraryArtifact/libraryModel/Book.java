package com.libraryManagement.libraryArtifact.libraryModel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
 private Author authorName;
 /*public Book(Author author) {

  this.authorName = author;
 }*/
 private String isbn;
 private String title;
 private String subject;
 private String publisher;
 private String language;
 private int noOfPages;
}
