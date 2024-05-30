package IDaeDengGim.indiepicks_demo.movie;

import IDaeDengGim.indiepicks_demo.tag.Tag;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class MovieDTO {

    private Long id;
    private String title;
    private String url;
    private String year;
    private String genre;
    private String director;
    private String actor;
    private String company;
    private String time;
    private String grade;
    private String color;
    private String synopsys;
    private String intent;
    private String img;
    //private Set<Tag> tags;

    public MovieDTO(Movie movie) {
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.url = movie.getUrl();
        this.year = movie.getYear();
        this.genre = movie.getGenre();
        this.director = movie.getDirector();
        this.actor = movie.getActor();
        this.company = movie.getCompany();
        this.time = movie.getTime();
        this.grade = movie.getGrade();
        this.color = movie.getColor();
        this.synopsys = movie.getSynopsys();
        this.intent = movie.getIntent();
        this.img = movie.getImg();
        //this.tags = movie.getTags();
    }
}
