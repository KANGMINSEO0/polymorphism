package com.ohgiraffers.section01.polymorphism;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용하여 객체 배열 만들어 인스턴스를 연속 처리할 수 있다. */
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }

        /* 각 클래스별 고유한 메소드를 동작시키게 하기 위해서는
        * down-casting을 명시적으로 해줘야 하는데
        * ClassCastException을 방지하기 위해서 instanceof 연산자를 이용해야 한다.
        * */
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Rabbit) {
                ((Rabbit) animals[i]).jump();
            } else if (animals[i] instanceof Tiger) {
                ((Tiger)animals[i]).bite();
            } else {
                System.out.println("호랑이나 토끼가 아닙니다.");
            }
        }
    }
}
