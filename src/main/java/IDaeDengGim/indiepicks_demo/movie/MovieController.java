package IDaeDengGim.indiepicks_demo.movie;

import IDaeDengGim.indiepicks_demo.movie.Movie;
import IDaeDengGim.indiepicks_demo.movie.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

//    @GetMapping("/recommendedMovie")
//    public List<Movie> getRecommendedMovies(@RequestParam List<Long> tagIds) {
//        return movieService.getRecommendedMovies(tagIds);
//    }
}
