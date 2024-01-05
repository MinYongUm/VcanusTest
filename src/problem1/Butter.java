package problem1;

/*
 * Recipe 추상클래스를 상속 받아서 공통된 값을 셋팅하고, Butter 클래스에 필요한 요소를 추가해서 셋팅
 */

public class Butter extends Recipe{
    private String flour;
    private String water;
    private String butter;

    public Butter(String flour, String water, String butter) {
        this.flour = flour;
        this.water = water;
        this.butter = butter;
    }

    @Override
    public String flour() {
        return this.flour;
    }

    @Override
    public String water() {
        return this.water;
    }

    public String butter() {
        return this.butter;
    }

    @Override
    public String toString() {
        return super.toString() + ", butter : " + butter + "}";
    }
}
