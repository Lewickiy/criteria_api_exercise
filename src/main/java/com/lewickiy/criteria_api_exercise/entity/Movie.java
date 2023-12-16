package com.lewickiy.criteria_api_exercise.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "movie", uniqueConstraints = {
        @UniqueConstraint(
                name = "movie_id_unique",
                columnNames = "movie_id"
)})
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "movie_id_generator"
    )
    @SequenceGenerator(name = "movie_id_generator",
            sequenceName = "movie_sequence_id",
            allocationSize = 1
    )
    @Column(name = "movie_id")
    @Setter
    private Long id;
    @Setter
    @Column(name = "name", nullable = false)
    private String name;
    @Setter
    @Column(name = "genre")
    private Genre genre;
    @Setter
    @Column(name = "premiere_date")
    private LocalDate premiere_date;
    @ManyToOne
    @JoinColumn(name="actor_id", nullable = false)
    private Actor director;

    @ManyToMany
    @JoinTable(
            name = "movie_actor",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    Set<Actor> actors;

    @Setter
    @Column(name = "rating")
    private Integer rating;

    public Movie(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    public void setDirector(Actor director) {
        if (director.getProfession().contains(Profession.DIRECTOR)) {
            this.director = director;
        } else {
            director.getProfession().add(Profession.DIRECTOR);
        }
    }

    public void setActors(Set<Actor> actors) {
        this.actors.addAll(actors);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(id, movie.id) &&
                Objects.equals(name, movie.name) &&
                Objects.equals(premiere_date, movie.premiere_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, premiere_date);
    }
}
