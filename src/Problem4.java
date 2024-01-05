/*
 * 4. 3번에서 구현한 함수에서 입력값이 큰 경우 Stack Overflow 가 발생합니다. 이 경우 해결 할 수 있는 방법을 구하시오.
 *    ex) factorial(1,000,000)
 *
 * stack overflow 발생 이유 - 반복적으로 자기 자신을 호출하면서 실행을 하지만 일정 수준에서 호출에 대한 마무리를 못하고,
 *                          반복 호출이 지속되면 stack memory 한계에 도달해서 발생
 * Java는 꼬리재귀가 최적화 지원이 안돼서, 반복문 사용을 권장.
 *
 */

public class Problem4 {

    public static void main(String[] args) {

        int resultOld = factorialV1(4);

        long resultNew = factorialV2(100);

        System.out.println(resultOld);
        System.out.println(resultNew);
    }

    public static int factorialV1(int n){
        if(n <= 1){
            return 1;
        }
        return factorialV1(n - 1) * n;
    }

    public static long factorialV2(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


}
