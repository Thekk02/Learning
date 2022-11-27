package TheBasics.day6;

/**
 * 多态测试
 */
public class useAnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Cat c = new Cat();
        Dog d = new Dog();
        ao.useAnimal(c);
        ao.useAnimal(d);
    }
    }
