package IDaeDengGim.indiepicks_demo.genre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GenreRepository extends JpaRepository<Genre, Long> {
    @Query("SELECT g.name FROM Genre g WHERE g.id = :id")
    String findNameById(@Param("id") Long id);
}
