package sideEffect;

public class RefEx {
    public static void main(String[] args) {
        SideEffect s1 = new SideEffect();
        s1.setNum(1);
        SideEffect s2 = new SideEffect();
        s2.setNum(1);

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
