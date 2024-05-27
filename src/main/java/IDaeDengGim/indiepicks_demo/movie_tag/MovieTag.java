package IDaeDengGim.indiepicks_demo.movie_tag;

import IDaeDengGim.indiepicks_demo.tag.Tag;
import IDaeDengGim.indiepicks_demo.movie.Movie;
import jakarta.persistence.*;

@Entity
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

    //Getter and Setter
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
