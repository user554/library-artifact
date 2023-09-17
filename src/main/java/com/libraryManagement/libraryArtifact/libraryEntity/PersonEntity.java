package com.libraryManagement.libraryArtifact.libraryEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "LIB_PERSON")
public class PersonEntity {
    @Id
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PHONE_NO")
    private String phoneNumber;

    @Column(name = "ADDRESS_ID")
    private Long addressId;

    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ADDRESS_ID")
    private AddressEntity addressEntity;*/
}
