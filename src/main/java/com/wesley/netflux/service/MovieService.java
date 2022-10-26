package com.wesley.netflux.service;

import com.wesley.netflux.domain.Movie;
import com.wesley.netflux.domain.MovieEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieService {

    Mono<Movie> getMoveById(String id);

    Flux<Movie> getAllMovies();

    Flux<MovieEvent> streamMovieEvents(String id);
}
