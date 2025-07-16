package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        Generic1<Integer> i  = new Generic1<>();
        i.setX(1);
        //i.setX("ㅎㅎ");
        Generic1<String> s = new Generic1<>();
        //s.setX(1);
        s.setX("ㅎㅎ");
        System.out.println(i.getX());
        System.out.println(s.getX());

    }
}
