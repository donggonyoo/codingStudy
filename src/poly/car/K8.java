package poly.car;

public class K8  extends Car{

    public K8(String name, String color, int speed) {
        super(name, color, speed);
    }

    @Override
    public void move(){
        System.out.println(super.name+"는"+super.speed+"로 달려");
    }
    public void ChildrenMethod(){
        System.out.println("자식K8의메소드");
    }
}
