package com.libraryManagement.libraryArtifact.libraryEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "BOOKRENEWALTABLE")
public class BookRenewalEntity {
    @Column(name = "ACCOUNT_ID")
    @Id
    private Long account_Id;
    @Column(name = "BOOKBARCODE")
    private String barCode;
    @Column(name = "RENEWALDATE")
    private LocalDateTime renewalDate;
    @Column(name = "NEXTRENEWALDATE")
    private LocalDateTime nextRenewalDate;
}
