package sideEffect;

public class SideEffectEx1 {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        System.out.println("@@ 기본형의 계산법 @@");
        System.out.println(num1+num2);

        //참조형의 계산
        SideEffect s1 = new SideEffect();
        s1.setNum(1);
        SideEffect s2 = new SideEffect();
        s2.setNum(2);

        //System.out.println(s1+s2); 컴파일오류발생 (주소를 더하는건불가능)
        System.out.println("@@ 참조형의 계산법 @@");
        System.out.println(s1.getNum()+s2.getNum());
    }
}
