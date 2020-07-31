package com.libraryManagement.libraryArtifact.libraryRepository;

import com.libraryManagement.libraryArtifact.libraryEntity.BookCheckOutEntity;
import com.libraryManagement.libraryArtifact.libraryEntity.BookCheckOutEntityPK;
import com.libraryManagement.libraryArtifact.libraryEntity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Repository
public interface BookCheckOutRepository extends JpaRepository<BookCheckOutEntity, BookCheckOutEntityPK>{
    Optional <BookCheckOutEntity>findByBookBarCodeAndBorrowerAccountIdAndReturnedDateIsNull(String barCode, Long borrowerAccountId);
    Optional<BookCheckOutEntity>findByBookBarCodeAndBorrowerAccountId(String barCode, String accountId);
    List<BookCheckOutEntity> findByBorrowerAccountId(Long account_Id);
    List<BookCheckOutEntity>findByBookBarCode(String barCode);
}
