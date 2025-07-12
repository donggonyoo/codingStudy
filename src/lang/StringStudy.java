package lang;

public class StringStudy {
    public static void main(String[] args) {
        String hi = new String("하이");
        String hi2 = new String("하이");
        System.out.println(System.identityHashCode(hi));
        System.out.println(System.identityHashCode(hi2));
        //new String으로 생성한 String객체의비교
        System.out.println(hi==hi2);//false (주소가 같나?)
        System.out.println(hi.equals(hi2));//true (논리적으로같나?)


        System.out.println("@@문자열리터럴 사용@@");
        String hi3 = "하이";
        String hi4 = "하이";
        System.out.println(System.identityHashCode(hi3));
        System.out.println(System.identityHashCode(hi4));
        //문자열리터럴 생성한 String객체의비교
        System.out.println(hi3==hi4);
        System.out.println(hi3.equals(hi4));

        //String은 사이드이펙트(같은값을 참조하는변수의 문자열이 모두바뀌어버리는문제)를
        //방지하기위해 불변객체로설정됨

        String a = "hello";
        String b = "hello";
        a.concat("java");
        //만일 a의값이 가변객체였다면 b도 바뀌어버릴거임
        System.out.println(a);
    }
}
