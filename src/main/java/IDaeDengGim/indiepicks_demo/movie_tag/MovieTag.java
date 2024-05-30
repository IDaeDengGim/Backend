package IDaeDengGim.indiepicks_demo.movie_tag;

import IDaeDengGim.indiepicks_demo.tag.Tag;
import IDaeDengGim.indiepicks_demo.movie.Movie;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "movie_tag")
public class MovieTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "tag_id", referencedColumnName = "id")
    private Tag tag;

    // Constructor
    public MovieTag(Movie movie, Tag tag) {
        this.movie = movie;
        this.tag = tag;
    }

    public MovieTag() {

    }
}
