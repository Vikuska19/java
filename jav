package org.example;

abstract class Animalss {

    public Animalss(String name, int age) {
    }

    public void speak() {

    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}

class Animal1 {
    private String name;
    private int age;

    public Animal1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        // Default implementation for speaking
    }

    public void run(int distance) {
        System.out.println(name + " Бежал " + distance + " В.");
    }

    public void swim(int distance) {
        System.out.println(name + " Бежал " + distance + " В.");
    }
}

class Dogss extends Animal {
    @Override
    public void run(int distance) {

    }

    @Override
    public void swim(int distance) {

    }

    public Dogss(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Wooff!");
    }
}

abstract class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("May!");
    }
}
class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        // Default implementation for speaking
    }

    public void run(int distance) {
        System.out.println(name + " Пробежал " + distance + " В.");
    }

    public void swim(int distance) {
        System.out.println(name + " Проплыл " + distance + " В.");
    }
}

class Dogs extends Animal {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Dogs(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void run(int distance) {
        char name = 0;
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " Пробежал " + distance + " В.");
        } else {
            System.out.println(name + " Не может пробежать такое расстояние.");
        }
    }

    @Override
    public void swim(int distance) {
        boolean name = false;
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println(name + " Проплыл " + distance + " В.");
        } else {
            System.out.println(name + " Не может проплыть такое расстояние.");
        }
    }
}

class Cats extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;

    public Cats(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public void run(int distance) {
        boolean name = false;
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " Пробежал " + distance + " В.");
        } else {
            System.out.println(name + " Не может пробежать такое расстояние.");
        }
    }

    @Override
    public void swim(int distance) {
        char name = 0;
        System.out.println(name + " Не умеет плавать.");
    }
}
class Animal {
    private static int animalCount = 0;
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void speak() {
        // Default implementation for speaking
    }

    public void run(int distance) {
        System.out.println(name + " Пробежал " + distance + " В.");
    }

    public void swim(int distance) {
        System.out.println(name + " Проплыл " + distance + " В.");
    }
}

class Dog extends Animal {
    private static int dogCount = 0;
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name, int age) {
        super(name, age);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void run(int distance) {
        boolean name = false;
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " Пробежал " + distance + " В.");
        } else {
            System.out.println(name + " Не может пробежать большое расстояние.");
        }
    }

    @Override
    public void swim(int distance) {
        boolean name = false;
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println(name + " Проплыл " + distance + " В.");
        } else {
            System.out.println(name + " Не может много плыть .");
        }
    }
}

class Cattt extends Animal {
    private static int catCount = 0;
    private static final int MAX_RUN_DISTANCE = 200;
    private boolean name;

    public Cattt(String name, int age) {
        super(name, age);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void speak() {
        System.out.println("Mayy!");
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " Пробежал " + distance + " В.");
        } else {
            System.out.println(name + " Не может много пробежать.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " Не плавает.");
    }
}
