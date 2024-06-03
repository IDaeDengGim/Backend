package IDaeDengGim.indiepicks_demo.movie;

import IDaeDengGim.indiepicks_demo.movie.Movie;
import IDaeDengGim.indiepicks_demo.movie.MovieService;
import IDaeDengGim.indiepicks_demo.tag.TagDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

//    @GetMapping("/movie")
//    public ResponseEntity<List<MovieDTO>> randomMovies(){
//        try{
//            List<MovieDTO> movies = movieService.getRandomMovies(10);
//            return new ResponseEntity<>(movies, HttpStatus.OK);
//        } catch(Exception e){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

    @GetMapping("/movie")
    public ResponseEntity<List<MovieDTO>> pickedMovies(){
        try{
            List<MovieDTO> movies = movieService.getMovies();
            return new ResponseEntity<>(movies, HttpStatus.OK);
        } catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
