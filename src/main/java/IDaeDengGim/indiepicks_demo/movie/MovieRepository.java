package IDaeDengGim.indiepicks_demo.movie;

import IDaeDengGim.indiepicks_demo.tag.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query(value ="SELECT * FROM movie ORDER BY RAND() LIMIT :limit",nativeQuery = true)
    List<Movie> findRandomMovies(@Param("limit")int limit);
}
