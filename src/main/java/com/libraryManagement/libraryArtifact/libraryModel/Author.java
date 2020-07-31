package com.libraryManagement.libraryArtifact.libraryModel;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Getter;

@Getter
//@Setter
public class Author {
    private String authorName;
    private String description;
    public String getName(){

        return authorName;
    }
}
