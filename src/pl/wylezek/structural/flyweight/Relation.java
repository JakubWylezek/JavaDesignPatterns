package pl.wylezek.structural.flyweight;

public final class Relation {
    final private String description;

    public Relation(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
