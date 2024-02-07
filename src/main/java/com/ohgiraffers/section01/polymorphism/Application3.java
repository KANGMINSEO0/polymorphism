package com.ohgiraffers.section01.polymorphism;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용하여 매개변수에 활용할 수 있다. */
        Application3 application3 = new Application3();

        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        application3.feed(animal1);
        application3.feed(animal2);

        Rabbit animal3 = new Rabbit();
        Tiger animal4 = new Tiger();

        application3.feed((Animal) animal3);
        application3.feed((Animal) animal4);

        application3.feed(animal3);
        application3.feed(animal4);
        
        application3.feed(new Rabbit());
        application3.feed(new Tiger());

    }
    public void feed(Animal animal) {
        animal.eat();
    }
}
