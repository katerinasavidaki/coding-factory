package gr.aueb.cf.solutions.ch16.challenge2;

public class AbstractShape implements IShape {

    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
