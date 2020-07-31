package com.libraryManagement.libraryArtifact.libraryController;

import com.libraryManagement.libraryArtifact.libraryException.LibraryException;
import com.libraryManagement.libraryArtifact.libraryModel.*;
import com.libraryManagement.libraryArtifact.libraryService.BookHistoryByAccount_Id_Service;
import com.libraryManagement.libraryArtifact.libraryService.BookHistoryByBarCodeService;
import com.libraryManagement.libraryArtifact.libraryService.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private BookService bookService;
    private BookHistoryByAccount_Id_Service bookHistoryByAccountIdService;
private BookHistoryByBarCodeService bookHistoryByBarCodeService;
    public BookController(BookService bookService, BookHistoryByAccount_Id_Service bookHistoryByAccountIdService, BookHistoryByBarCodeService bookHistoryByBarCodeService) {
        this.bookService = bookService;
        this.bookHistoryByAccountIdService = bookHistoryByAccountIdService;
        this.bookHistoryByBarCodeService = bookHistoryByBarCodeService;
    }

    @PostMapping(value = "/bookDetails")
    public String addNewBooks(@RequestBody BookItemModel bookItemModel) {
        return bookService.addNewBookItem(bookItemModel);
    }

    @GetMapping(value = "/searchByTitle/{bookTitle}")
    public List<FindByTitle> searchByTitle(@PathVariable(name = "bookTitle") String bookTitle) throws LibraryException {
        return bookService.findBooksByTitle(bookTitle);
    }
    @PostMapping(value = "/bookHistoryByAccount_Id")
    public List<AccountBooksHistory> bookHistoryByAccount_Id(@RequestBody BookHistoryByAccount_Id_Model bookHistoryByAccountIdModel) throws LibraryException {
        return bookHistoryByAccountIdService.bookHistoryByAccount_Id_Method(bookHistoryByAccountIdModel);
    }
    @PostMapping(value = "/bookHistoryByBarCode")
    public List<BookHistoryByBarCodeReturnModel> bookHistoryByBarCodeReturnModelList(@RequestBody BookHistoryByBarCodeModel bookHistoryByBarCodeModel) throws LibraryException {
        return bookHistoryByBarCodeService.bookHistoryByBarCodeMethod(bookHistoryByBarCodeModel);
    }

}
