package problem1;

/*
 * Recipe 추상클래스에 공통된 값 셋팅
 */

public abstract class Recipe {
    public abstract String flour();
    public abstract String water();

    @Override
    public String toString() {
        return "{flour : " + this.flour() + ", water : " + this.water();
    }
}
