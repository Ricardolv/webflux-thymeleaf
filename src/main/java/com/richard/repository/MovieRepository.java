package com.richard.repository;

import com.richard.model.Movie;
import reactor.core.publisher.Flux;

public interface MovieRepository {

    Flux<Movie> findAll();
}
