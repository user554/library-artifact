package com.libraryManagement.libraryArtifact.libraryEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "LIBRARYMANAGMENT")
public class LibraryMemberEntity {
    @Column(name = "MEMBERNAME")
    private String memberName;
    @Column(name = "AGE")
    private String age;
    @Column(name = "FATHER")
    private String fatherName;
    @Column(name = "MOTHER")
    private String motherName;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "ROLLNO")
    private String rollNo;
    @Column(name = "MOBILENO")
    private String mobile;
    @Column(name = "COURSE")
    private String course;

    @Column(name = "IDNUMBER")
    @Id
    private Long idNumber;

}
