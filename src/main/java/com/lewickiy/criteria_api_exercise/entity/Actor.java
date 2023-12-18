package com.lewickiy.criteria_api_exercise.entity;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "actor", uniqueConstraints = {
        @UniqueConstraint(
                name = "actor_id_unique",
                columnNames = "actor_id")
})
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "actor_id_generator"
    )
    @SequenceGenerator(name = "actor_id_generator",
            sequenceName = "actor_sequence_id",
            allocationSize = 1
    )
    @Column(name = "actor_id")
    private Long id;

    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @ElementCollection
    @CollectionTable(name = "actor_professions")
    private Set<Profession> profession;

    @ManyToMany(mappedBy = "actors")
    Set<Movie> likes;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(id, actor.id) &&
                Objects.equals(firstName, actor.firstName) &&
                Objects.equals(lastName, actor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }
}
