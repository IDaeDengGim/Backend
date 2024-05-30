package IDaeDengGim.indiepicks_demo.tag;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findByName(String name);

    @Query(value = "SELECT * FROM TAG ORDER BY RAND() LIMIT 20",nativeQuery=true)
    List<Tag> findRandomTags();
}
