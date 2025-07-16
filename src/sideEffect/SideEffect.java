package sideEffect;

public class SideEffect {

    private int num;

    public void setNum(int num) {
        this.num = num;
    }
    public int getNum(){
        return num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "SideEffect{" +
                "num=" + num +
                '}';
    }
}
