package problem1;

public class Bread {
    private String breadType;
    private Recipe recipe;

    public Bread(String breadType, Recipe recipe) {
        this.breadType = breadType;
        this.recipe = recipe;
    }

    @Override
    public String toString() {
        return "{breadType : " + breadType  + ",\n recipe : " + recipe + "\n}";
    }
}
