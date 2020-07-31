package com.libraryManagement.libraryArtifact.libraryModel;

import com.libraryManagement.libraryArtifact.libraryModel.BookDetails;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
public class BookCheckOutModel {

    private Long accountId;
    private List <BookDetails> selectedBooksList;


}
