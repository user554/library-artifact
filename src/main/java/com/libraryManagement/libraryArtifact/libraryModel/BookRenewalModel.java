package com.libraryManagement.libraryArtifact.libraryModel;

import lombok.*;
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookRenewalModel {
    private Long accountId;
    private String barCode;

}
