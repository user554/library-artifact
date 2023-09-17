package com.libraryManagement.libraryArtifact.bookEnumPacakage;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public enum BookStatus {
    Available,
    Reserved,
    Loaned,
    Lost
}
