package com.ani.mapping.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class IdentityDoc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long docId;
    private String type;
    private Boolean isActive;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;
}

