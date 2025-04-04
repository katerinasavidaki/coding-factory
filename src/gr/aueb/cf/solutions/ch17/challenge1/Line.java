package gr.aueb.cf.solutions.ch17.challenge1;

import java.util.Objects;

public class Line extends AbstractShape {
    private double length;

    public Line() {

    }

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line line)) return false;
        return Double.compare(getLength(), line.getLength()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getLength());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }
}
