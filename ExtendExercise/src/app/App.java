package app;

class Animal {
    protected int age;
    protected int weight;

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void canRun() {
        System.out.println("可以跑动！");
    }

    public void canEat() {
        System.out.println("可以吃东西！");
    }
}

class Felidae extends Animal {
    public Felidae(int age, int weight) {
        super(age, weight);
    }

    public void canMeow() {
        System.out.println("喵喵叫~");
    }
}

class Tigger extends Felidae {
    public Tigger(int age, int weight) {
        super(age, weight);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Tigger tigger = new Tigger(2, 20);
        tigger.canMeow();
    }
}