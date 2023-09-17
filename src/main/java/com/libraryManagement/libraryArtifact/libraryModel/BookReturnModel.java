package com.libraryManagement.libraryArtifact.libraryModel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookReturnModel {
    private Long accountId;
    private String barCode;
}
