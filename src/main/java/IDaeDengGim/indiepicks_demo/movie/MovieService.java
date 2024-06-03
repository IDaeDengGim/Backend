package IDaeDengGim.indiepicks_demo.movie;

import IDaeDengGim.indiepicks_demo.genre.GenreRepository;
import IDaeDengGim.indiepicks_demo.tag.Tag;
import IDaeDengGim.indiepicks_demo.tag.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;
    private final TagRepository tagRepository;

    private final GenreRepository genreRepository;

    // 랜덤하게 영화 10개 가져오기
    public List<MovieDTO> getRandomMovies(int limit) {
        List<Movie> randomMovies = movieRepository.findRandomMovies(limit);
        return randomMovies.stream()
                .map(movie -> new MovieDTO(movie, tagRepository, genreRepository))
                .collect(Collectors.toList());
    }

    // 고정 영화 10개 가져오기 (1~10)
    public List<MovieDTO> getMovies() {
        List<Movie> randomMovies = movieRepository.findMovies();
        return randomMovies.stream()
                .map(movie -> new MovieDTO(movie, tagRepository, genreRepository))
                .collect(Collectors.toList());
    }
}

