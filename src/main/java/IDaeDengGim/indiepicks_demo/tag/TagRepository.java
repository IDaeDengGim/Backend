package IDaeDengGim.indiepicks_demo.tag;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
    @Query(value ="SELECT * FROM tag ORDER BY RAND() LIMIT :limit",nativeQuery = true)
    List<Tag> findRandomTags(@Param("limit")int limit);

    @Query("SELECT t.name FROM Tag t WHERE t.id = :id")
    String findNameById(@Param("id") Long id);
}
