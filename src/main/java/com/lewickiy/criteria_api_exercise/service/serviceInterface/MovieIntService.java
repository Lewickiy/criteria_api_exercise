package com.lewickiy.criteria_api_exercise.service.serviceInterface;

import com.lewickiy.criteria_api_exercise.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieIntService {
    Optional<Movie> findById(Long id);
    List<Movie> findAll();


}
