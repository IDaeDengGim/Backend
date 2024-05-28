package IDaeDengGim.indiepicks_demo.movie_tag;

import IDaeDengGim.indiepicks_demo.movie.Movie;
import IDaeDengGim.indiepicks_demo.tag.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieTagRepository extends JpaRepository<MovieTag, Long> {
    List<MovieTag> findByTagIdIn(List<Long> tagIds);
    List<MovieTag> findByTagId(Long tag_Id);
}
