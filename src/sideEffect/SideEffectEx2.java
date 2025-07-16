package sideEffect;

import java.util.ArrayList;
import java.util.List;

public class SideEffectEx2 {

    public static void main(String[] args) {

        int a = 1;
        int b= a;  //변수의 a값을 b에 복사
        b = 3; //b의값을 바꿔도 a에 영향X
        System.out.println("a : "+a);
        System.out.println("b : "+b);


        SideEffect s1 = new SideEffect();
        s1.setNum(5);//초기 SideEffect의 num = 5

        SideEffect s2 =s1; //얕은복사 (참조값이 같음 )
        s2.setNum(10); //여기서 set을 통해 num=10으로 바꿈

        System.out.println("s1의참조값 : "+s1);
        System.out.println("s2의참조값 : "+s2);

        System.out.println(s1.getNum());
        System.out.println(s2.getNum());


        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list2 = list;
        list.add(99);
        System.out.println(list2);

    }


}
