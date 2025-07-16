package poly.car;

public class Avante  extends Car{


    public Avante(String name, String color, int speed) {
        super(name, color, speed);
    }

    @Override
    public void move() {
        System.out.println(super.name+"는" + super.color+"색 입니다");
    }
    public void ChildrenMethod(){
        System.out.println("자식아반떼의메소드");
    }
}
