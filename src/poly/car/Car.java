package poly.car;

public class Car {
    protected String name;
    protected String color;
    protected int speed;

    public Car(String name, String color, int speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    public void move(){
        System.out.println(name+"("+color+")의 속도 : "+speed);
    }
    
    public void superMethod(){
        System.out.println("부모의메서드");
    }
}
