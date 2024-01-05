/*
 * 3. 재귀함수를 이용하여 Factorial 을 구하는 함수를 구하시오.
 */

public class Problem3 {

    public static void main(String[] args) {

        int result = factorial(4);

        System.out.println("결과값 : " + result);
    }

    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return factorial(n - 1) * n;
    }

}
