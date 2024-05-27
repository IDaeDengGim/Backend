package IDaeDengGim.indiepicks_demo;

import jakarta.persistence.*;
import lombok.ToString;

import java.util.List;

@Entity
@ToString
public class Movie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String title;

    private String url;

    private Integer year;

    private String genre;

    //@Convert(converter = StringListConverter.class)
    //@ElementCollection // 1:N 매핑으로 테이블 데이터 저장
    private String director; //나중에 N:N 매핑으로 바꿔줘야 함 !! -> 일단 List<String>말고 String으로 진행하는 걸로

    //@Convert(converter = StringListConverter.class)
    //@ElementCollection
    private String actor;

    private String company;

    private String time;

    private String grade;

    private Boolean color;

    @Convert(converter = StringListConverter.class)
    private List<String> tag;

    private String synopsys;

    private String intent;

    private String img; //url

    // 생성자
    //

    /*
    * Getter and Setter
    */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Boolean getColor() {
        return color;
    }

    public void setColor(Boolean color) {
        this.color = color;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    public String getSynopsys() {
        return synopsys;
    }

    public void setSynopsys(String synopsys) {
        this.synopsys = synopsys;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }
}
