package problem1;

/*
 * 팩토리 패턴 - 여러 개의 서브 클래스를 가진 추상 클래스가 있을 때 인풋에 따라 하나의 서브 클래스의 인스턴스를 리턴해주는 방식
 * 팩토리 패턴의 이점 - 서브 클래스의 인스턴스화를 제거하여 서로 간의 종속성을 낮추고, 결합도를 느슨하게 하며, 확장을 쉽게 합니다.
 *                   서브 클래스에서 수정 혹은 삭제가 일어나더라도 클라이언트는 알 수 없기 때문에 코드를 변경할 필요가 없습니다.
 *
 * BreadFactory class에 Recipe 객체를 호출할 수 있는 메서드를 만들고, type별로 서브클래스를 리턴
 */

public class BreadFactory {
    public static Recipe getRecipe(String type, String flour, String water, String common){

        if("Cream".equalsIgnoreCase(type)){
            return new Cream(flour,water,common);

        }else if ("Sugar".equalsIgnoreCase(type)){
            return new Sugar(flour,water,common);

        }else if ("Butter".equalsIgnoreCase(type)){
            return new Butter(flour,water,common);
        }
        return null;
    }
}
