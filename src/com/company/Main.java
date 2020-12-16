package com.company;

public class Main {

    private boolean flag = true;

    class Car {
        private String name;
        void toDo() {
            System.out.println("Test");
        }
    }

    public class InnerClass {
        void toDo() {
            boolean f = Main.this.flag;
            System.out.println("toDo!");
        }
    }



    static void go() {
        class Airplane {
            void fly() {
                System.out.println("Fly...");
            }
        }

        Airplane airbus = new Airplane();
        airbus.fly();

    }
    
    static class Train {
        void move() {
            System.out.println("Moving...");
        }
    }

    public static void main(String[] args) {

        Main.Train train = new Train();
        train.move();


       // Main.go();

        Main main = new Main();
        InnerClass inner = main.new InnerClass();
        inner.toDo();

        InnerClass inner2 = new Main().new InnerClass();
        inner2.toDo();










        // Calculable calculator = new Calculable();

        Calculable summ = new Calculable() {
            @Override
            public void calc(int a, int b) {
                System.out.println(a+b);
            }

            @Override
            public void calc2() {

            }
        };
        summ.calc(3,5);

        Calculator mult = new Calculator();
        mult.calc(4,5);

    }
}
