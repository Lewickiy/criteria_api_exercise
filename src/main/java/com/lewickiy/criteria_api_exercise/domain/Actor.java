package com.lewickiy.criteria_api_exercise.domain;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "#{class.simpleName}")
public class Actor {
    public static final String NAME = Actor.class.getSimpleName().toLowerCase();
    private static final String COLLECTION_TABLE_NAME = new String(NAME + "_" + Profession.NAME);
    @Id
    private Integer id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @ElementCollection
    @CollectionTable(name = "COLLECTION_TABLE_NAME")
    private Set<Profession> profession;
}
