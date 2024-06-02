package IDaeDengGim.indiepicks_demo.movie;

import IDaeDengGim.indiepicks_demo.genre.Genre;
import IDaeDengGim.indiepicks_demo.tag.Tag;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String url;
    private String year;

    // 삭제 여부 추후 결정(기본 제공 장르)
    private String g;

    private String director;
    private String actor;
    private String company;
    private String time;
    private String grade;
    private String color;

    @ManyToMany
    @JoinTable(
            name = "movie_tag",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tag = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "movie_genre",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private Set<Genre> genre = new HashSet<>();

    @Column(columnDefinition = "TEXT")
    private String synopsys;

    @Column(columnDefinition = "TEXT")
    private String intent;

    @Column(columnDefinition = "TEXT")
    private String img;
}
