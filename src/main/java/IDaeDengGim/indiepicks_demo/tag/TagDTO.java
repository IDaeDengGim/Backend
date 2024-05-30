package IDaeDengGim.indiepicks_demo.tag;

public class TagDTO {
    private Long id;
    private String name;

    public TagDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setTagName(String name) {
        this.name = name;
    }
}
