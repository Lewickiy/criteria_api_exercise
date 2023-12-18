package com.lewickiy.criteria_api_exercise.service;

import com.lewickiy.criteria_api_exercise.entity.Movie;
import com.lewickiy.criteria_api_exercise.repository.MovieRepository;
import com.lewickiy.criteria_api_exercise.service.serviceInterface.MovieIntService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class MovieService implements MovieIntService {
    private final MovieRepository movieRepository;

    @Override
    public Optional<Movie> findById(Long id) {
        return movieRepository.findById(id); //TODO get or throw without Optional
    }

    @Override
    public List<Movie> findAll() {
        return null;
    }
}
