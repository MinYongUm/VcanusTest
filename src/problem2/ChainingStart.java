package problem2;

/*
 * 2. 아래처럼 “.”으로 함수를 계속 추가할 수 있는 구조(체이닝 메소드)를 이용하여 add, substract 함수를 구현하고 그 결과를 출력하십시오.
 */

public class ChainingStart {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result = calculator.add(4).add(5).subtract(3).out();

        System.out.println("결과값 : " + result);
    }
}
