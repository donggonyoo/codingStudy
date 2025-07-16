package generic;

import java.util.ArrayList;
import java.util.List;

public class WildEx {
    public static void main(String[] args) {
       List<Object> list = new ArrayList<>();
        //wild1(list); Object 와 Number는 다른관계
        wild2(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        wild1(list1);
        //wild2(list1); Integer는 String의 부모가아님


        ArrayList<String> list2 = new ArrayList<>();
        //wild1(list2);  String 와 Number는 다른관계
        wild2(list2);
    }

    //?가 Number의 자식 (Integer ,Float , Double 만 들어올수있음)
    private static void wild1(List<? extends  Number > animals) {
        System.out.println("접근성공");
    }
    //?가 String의 부모 (String , Object)
    private static void wild2(List<?  super  String > animals) {
        System.out.println("접근성공");
    }

}
