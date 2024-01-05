package problem1;

/*
 * Recipe 추상클래스를 상속 받아서 공통된 값을 셋팅하고, Sugar 클래스에 필요한 요소를 추가해서 셋팅
 */

public class Sugar extends Recipe{
    private String flour;
    private String water;
    private String sugar;

    public Sugar(String flour, String water, String sugar) {
        this.flour = flour;
        this.water = water;
        this.sugar = sugar;
    }

    @Override
    public String flour() {
        return this.flour;
    }

    @Override
    public String water() {
        return this.water;
    }

    public String sugar() {
        return this.sugar;
    }

    @Override
    public String toString() {
        return super.toString() + ", sugar : " + sugar + "}";
    }
}
