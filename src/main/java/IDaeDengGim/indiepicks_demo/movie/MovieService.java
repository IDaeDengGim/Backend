package IDaeDengGim.indiepicks_demo.movie;

import IDaeDengGim.indiepicks_demo.movie_tag.MovieTagRepository;
import IDaeDengGim.indiepicks_demo.tag.Tag;
import IDaeDengGim.indiepicks_demo.movie_tag.MovieTag;
import IDaeDengGim.indiepicks_demo.tag.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;
    private final MovieTagRepository movieTagRepository;
    private final TagRepository tagRepository;

    // 모든 영화 가져오기
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    // 특정 영화 가져오기
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id)
                .orElse(null);
    }

    // 태그 id를 받아서 가져오기
    public List<Movie> getRecommendedMovies(List<Long> tagIds) {
        // 태그 ID 목록에 해당하는 모든 movie_tag를 가져옴
        List<MovieTag> movieTags = movieTagRepository.findByTagIdIn(tagIds);

        // 영화 태그에서 영화 ID 목록 추출
        List<Long> movieIds = movieTags.stream()
                .map(movieTag -> movieTag.getMovie().getId())
                .distinct()
                .collect(Collectors.toList());

        // 영화 ID를 바탕으로 목록 조회
        return movieRepository.findAllById(movieIds);
    }
}

