package problem1;
import java.util.ArrayList;
import java.util.List;

/*
 * 1. 아래 링크의 Json 파일에 정의되어 있는 Bread 객체를 디자인 패턴 (팩토리 메소드)을 이용하여 생성하고, 이 객체들을 리스트에 삽입합니다.
 *    리스트 내 Bread 객체를 순환하며 각 Bread 속성을 출력 하십시오
 */

public class ProduceBread {
    public static void main(String[] args) {
        String[] breadType = {"cream","sugar","butter"};
        List<Bread> breadList = new ArrayList<>();
        List<Recipe> recipes = new ArrayList<>();

        // 팩토리 패턴을 이용해서 breadType별로 값 셋팅
        recipes.add(BreadFactory.getRecipe(breadType[0],"100","100", "200"));
        recipes.add(BreadFactory.getRecipe(breadType[1],"100","50","200"));
        recipes.add(BreadFactory.getRecipe(breadType[2],"100","100","50"));

        // 반복문으로 bread 객체를 만들어서 breadType, recipes 값 셋팅
        for (int i = 0; i < recipes.size(); i++) {
            Bread breads = new Bread(breadType[i], recipes.get(i));
            breadList.add(breads);
        }

        // 최종 출력
        System.out.println(breadList);

    }
}
