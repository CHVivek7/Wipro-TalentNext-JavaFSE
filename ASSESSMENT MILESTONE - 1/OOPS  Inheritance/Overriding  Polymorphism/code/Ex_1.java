class Fruit {
    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println("The " + name + " tastes " + taste + ".");
    }
}

class Apple extends Fruit {
    Apple(String size) {
        super("Apple", "sweet", size);
    }

    @Override
    void eat() {
        System.out.println("The " + name + " is " + taste + " and crunchy.");
    }
}

class Orange extends Fruit {
    Orange(String size) {
        super("Orange", "citrusy", size);
    }

    @Override
    void eat() {
        System.out.println("The " + name + " is " + taste + " and juicy.");
    }
}

public class Ex_1 {
    public static void main(String[] args) {
        Apple apple = new Apple("medium");
        Orange orange = new Orange("large");
        apple.eat();
        orange.eat();
    }
}
