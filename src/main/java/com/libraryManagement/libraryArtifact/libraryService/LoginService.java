package com.libraryManagement.libraryArtifact.libraryService;

import com.libraryManagement.libraryArtifact.bookEnumPacakage.AccountStatus;
import com.libraryManagement.libraryArtifact.bookEnumPacakage.LibraryErrorMessages;
import com.libraryManagement.libraryArtifact.libraryEntity.LibraryAccountEntity;
import com.libraryManagement.libraryArtifact.libraryEntity.PersonEntity;
import com.libraryManagement.libraryArtifact.libraryException.LibraryException;
import com.libraryManagement.libraryArtifact.libraryModel.Account;
import com.libraryManagement.libraryArtifact.libraryModel.Person;
import com.libraryManagement.libraryArtifact.libraryModel.UserLoginModel;
import com.libraryManagement.libraryArtifact.libraryRepository.AccountRepository;
import com.libraryManagement.libraryArtifact.libraryRepository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class LoginService {
    private AccountRepository accountRepository;
    private PersonRepository personRepository;

    public LoginService(AccountRepository accountRepository, PersonRepository personRepository) {
        this.accountRepository = accountRepository;
        this.personRepository = personRepository;
    }

    public List<Person> userLogin(String mobileNumber) {
        Optional<PersonEntity> personEntity = personRepository.findByPhoneNumber(mobileNumber);
        List<Person> personArrayList = new ArrayList<>();
        if (personEntity.isPresent()) {
            System.out.println("you are the user by email and password");
        } else {
            System.out.println("your not a member in else block");
        }

        return personArrayList;
    }

    public Account login(UserLoginModel userLoginModel) throws LibraryException {
        if (userLoginModel.getEmail() != null && userLoginModel.getPassword() != null) {
            log.info("Trying to login using email and password");
            Optional<LibraryAccountEntity> userAccount = accountRepository.findByPersonEmailAndPassword(userLoginModel.getEmail(), userLoginModel.getPassword());
            if (userAccount.isPresent()) {
                log.info("Found user");
                LibraryAccountEntity libraryAccountEntity = userAccount.get();
                Account account = new Account();
                account.setId(libraryAccountEntity.getAccountId());
                account.setStatus(AccountStatus.valueOf(libraryAccountEntity.getAccountStatus()));
                account.setAccountType(libraryAccountEntity.getAccountType());
                return account;
            } else {
                LibraryException libraryException = new LibraryException(LibraryErrorMessages.INVALID_EMAIL_PSWD);
                log.error("Exception occurred-", libraryException);
                throw libraryException;
            }
        } else if (userLoginModel.getPhoneNumber() != null && userLoginModel.getPassword() != null) {
            log.info("Tyring to login using phone number and password");
            Optional<LibraryAccountEntity> userAccount = accountRepository.findByPhoneNumberAndPassword(userLoginModel.getPhoneNumber(), userLoginModel.getPassword());
            if (userAccount.isPresent()) {
                log.info("Found user");
                LibraryAccountEntity libraryAccountEntity = userAccount.get();
                Account account = new Account();
                account.setId(libraryAccountEntity.getAccountId());
                account.setStatus(AccountStatus.valueOf(libraryAccountEntity.getAccountStatus()));
                account.setAccountType(libraryAccountEntity.getAccountType());
                return account;
            } else {
                log.error("Invalid phone-number and password");
                throw new LibraryException(LibraryErrorMessages.INVALID_PHONE_NUM_PSWD);
            }
        } else {
            log.info("Please provide either email/phone number and password to login");
            throw new LibraryException(LibraryErrorMessages.INVALID_CREDENTIALS);
        }
    }
}
