package com.libraryManagement.libraryArtifact.libraryModel;

import com.libraryManagement.libraryArtifact.bookEnumPacakage.AccountStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
public class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;
    private String password;
    private String accountType;

   /* accountTYpe
    accoutn status*/
}
