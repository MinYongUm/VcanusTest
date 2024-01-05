/*
 * 5. 0 은 땅, 1 은 물로 표현되는 디지털 연못이 있고 다음과 같이 표현이 됩니다. 연못 물 깊이의 총합을 구하시오.
 *
 * 배열 엘리먼트의 값을 변경하는데 엘리먼트의 좌, 우, 상, 하 모두가 자신보다 같거나 크면 현재값을 1 증가시킵니다.(조건)
 */

public class Problem5 {

    public static void main(String[] args) {

        // 2차 배열로 초기 digitalPond 값 셋팅
        int[][] digitalPond = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        // 초기값 출력
        System.out.println("<디지털연못 초기값>");
        for (int i = 0; i < digitalPond.length; i++) {
            for (int j = 0; j < digitalPond[i].length; j++) {
                System.out.print(digitalPond[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------");
        System.out.println("----------------------------");

        totalPondDepthFind(digitalPond);

        // 결과값 출력
        System.out.println("<디지털연못 깊이 결과>");
        for (int i = 0; i < digitalPond.length; i++) {
            for (int j = 0; j < digitalPond[i].length; j++) {
                System.out.print(digitalPond[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 순차적으로 digitalPond 값을 찾는 Logic
    public static void totalPondDepthFind(int[][] digitalPond) {
        boolean changed;

        do {
            changed = false;

            for (int i = 0; i < digitalPond.length; i++) {
                for (int j = 0; j < digitalPond[i].length; j++) {
                    if (pondDepthIncrease(digitalPond, i, j)) {
                        digitalPond[i][j]++;
                        changed = true;
                    }
                }
            }
        } while (changed);
    }

    // digitalPond 깊이 증가 Logic
    public static boolean pondDepthIncrease(int[][] digitalPond, int row, int col) {
        // pond[i][j]의 현재 값
        int currentValue = digitalPond[row][col];
        // pond[i][j]의 기준으로 왼쪽 값
        int left = col > 0 ? digitalPond[row][col - 1] : 0;
        // pond[i][j]의 기준으로 오른쪽 값
        int right = col < digitalPond[row].length - 1 ? digitalPond[row][col + 1] : 0;
        // pond[i][j]의 기준으로 위쪽 값
        int top = row > 0 ? digitalPond[row - 1][col] : 0;
        // pond[i][j]의 기준으로 아래쪽 값
        int bottom = row < digitalPond.length - 1 ? digitalPond[row + 1][col] : 0;

        // 최소값 구하기 = 좌, 우, 상, 하 모두가 자신보다 같거나 크면 현재값을 1 증가시키는 조건 때문에 만든 변수
        int minNeighbor = Math.min(left, Math.min(right, Math.min(top, bottom)));

        // 현재값이 0보다 크거나, 현재값이 최소값보다 작거나 같으면 해당 값을 리턴해서 pond[i][j]의 값을 증가
        return currentValue > 0 && currentValue <= minNeighbor;
    }
}