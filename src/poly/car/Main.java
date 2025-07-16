package poly.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("차","yellow",90);

        //부모타입변수는 자식객체를 참조가능
        Car car2 = new Avante("아반떼","white",70); 
        
        //K8 k8  = new Car(); 자식타입변수는 부모객체를 절대로 참조할수없음
        K8 car3 = new K8("K8","black",120);

        car.move();

        car2.move();
        //car2.childrenMethod(); 부모가 자식을 참조는 가능하지만 자식의메서드는 사용할수없음

        car3.move();
        car3.superMethod(); //오버라이딩하지않아도 부모의메서드 사용가능함

    }
}
