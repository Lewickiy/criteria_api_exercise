package com.lewickiy.criteria_api_exercise.repository;

import com.lewickiy.criteria_api_exercise.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface MovieRepository extends JpaRepository<MovieRepository, Long>, JpaSpecificationExecutor<MovieRepository> {
    //TODO
    Optional<Movie> findById(Long id);
}
