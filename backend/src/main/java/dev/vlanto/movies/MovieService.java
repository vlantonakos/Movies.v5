package dev.vlanto.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }
    
    public Optional<Movie> singleMovie(String imdbId) {
    	return movieRepository.findMovieByImdbId(imdbId);
    }
}
