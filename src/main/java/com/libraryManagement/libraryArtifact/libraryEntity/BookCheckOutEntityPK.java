package com.libraryManagement.libraryArtifact.libraryEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;


@Embeddable
@Getter
@Setter
public class BookCheckOutEntityPK implements Serializable {
    @Column(name = "BOOK_BARCODE")
    private String bookBarCode;
    @Column(name = "BORRWOR_ACCOUNT_ID")
    private Long borrowerAccountId;
    @Column(name = "BORROWED_DATE")
    private LocalDateTime borrowedDate;
}
