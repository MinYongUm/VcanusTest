package problem1;

/*
 * Recipe 추상클래스를 상속 받아서 공통된 값을 셋팅하고, Cream 클래스에 필요한 요소를 추가해서 셋팅
 */

public class Cream extends Recipe{
    private String type;
    private String flour;
    private String water;

    private String cream;

    public Cream(String flour, String water, String cream) {
        this.flour = flour;
        this.water = water;
        this.cream = cream;
    }

    @Override
    public String flour() {
        return this.flour;
    }

    @Override
    public String water() {
        return this.water;
    }

    public String cream() {
        return this.cream;
    }

    @Override
    public String toString() {
        return super.toString() + ", cream : " + cream + "}";
    }
}
