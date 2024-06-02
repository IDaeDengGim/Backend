package IDaeDengGim.indiepicks_demo.movie;

import IDaeDengGim.indiepicks_demo.genre.GenreRepository;
import IDaeDengGim.indiepicks_demo.tag.TagRepository;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
public class MovieDTO {

    private Long id;
    private String title;
    private String url;
    private String year;
    private String g; // 기본 제공 장르
    private String director;
    private String actor;
    private String company;
    private String time;
    private String grade;
    private String color;
    private String synopsys;
    private String intent;
    private String img;
    private Set<String> tags;
    private Set<String> genres;

    public MovieDTO(){
    }


    public MovieDTO(Movie movie, TagRepository tagRepository, GenreRepository genreRepository) {
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.url = movie.getUrl();
        this.year = movie.getYear();
        this.g = movie.getG();
        this.director = movie.getDirector();
        this.actor = movie.getActor();
        this.company = movie.getCompany();
        this.time = movie.getTime();
        this.grade = movie.getGrade();
        this.color = movie.getColor();
        this.tags = movie.getTag().stream().map(tag -> tagRepository.findNameById(tag.getId())).collect(Collectors.toSet());
        this.genres = movie.getGenre().stream().map(genre -> genreRepository.findNameById(genre.getId())).collect(Collectors.toSet());
        this.synopsys = movie.getSynopsys();
        this.intent = movie.getIntent();
        this.img = movie.getImg();
    }
}
