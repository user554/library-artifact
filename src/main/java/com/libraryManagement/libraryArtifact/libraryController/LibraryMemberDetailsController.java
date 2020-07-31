package com.libraryManagement.libraryArtifact.libraryController;

import com.libraryManagement.libraryArtifact.libraryException.LibraryException;
import com.libraryManagement.libraryArtifact.libraryModel.*;
import com.libraryManagement.libraryArtifact.libraryService.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class LibraryMemberDetailsController {
    private AccountService accountService;

    public LibraryMemberDetailsController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping(value = "/addNewMember")
    public NewAccountResponse addNewMember(@RequestBody Person person) throws LibraryException {
        Account account = new Account();
        account.setAccountType(person.getAccountType());
        account.setPassword(person.getPassword());
        return accountService.addUser(person, person.getAddress(), account);
    }


}

