package com.libraryManagement.libraryArtifact.libraryModel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginModel {
    private String email;
    private String password;
    private String phoneNumber;
}
