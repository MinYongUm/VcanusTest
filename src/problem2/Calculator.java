package problem2;

/*
 * 체이닝 메서드를 사용하기 위한 클래스 Calculator
 * 체이닝 메서드의 주 핵심은 Calculator 객체를 return this 하고, 셋팅된 값을 반환 하는 것
 */

public class Calculator {
    private int add;
    private int subtract;
    private int out;
    private int result;

    // 덧하기 연산 메소드
    public Calculator add(int add){
        this.add = add;
        result += add;
        return this;
    }

    // 빼기 연산 메소드
    public Calculator subtract(int subtract){
        this.subtract = subtract;
        result -= subtract;
        return this;
    }

    // 연산 결과에 대한 메소드
    public int out(){
        return result;
    }

}
