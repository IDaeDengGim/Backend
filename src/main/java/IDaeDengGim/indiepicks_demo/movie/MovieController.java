package IDaeDengGim.indiepicks_demo.movie;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MovieController {
    private final MovieRepository movieRepository;

}
