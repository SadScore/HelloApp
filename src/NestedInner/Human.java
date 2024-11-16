package NestedInner;

import java.util.Scanner;
import java.util.SortedMap;

public class Human {
    String name;
    private int age;
    public void toLive(){
        Head head = new Head();
        Hands hands = new Hands();
        Legs legs = new Legs();
        System.out.println("Человек по имени " + name +  " жизнеспособный!");
        head.toThink();
        hands.toWork();
        legs.toGo();
        System.out.println("Введите биологический возраст сердца!");
        Heart heart = new Heart(new Scanner(System.in).nextInt());
        System.out.println("Возрат человека: " + age);

    }

    private class Head {
        public void toThink(){
            System.out.println("Голова " + name + " думает!");

            class Brain {
                final int EFFICIENCY = 10;
                public void theBrainWorks (){
                    System.out.println("Работаета мозга оценивается на " + EFFICIENCY);
                }
            }
            Brain brain = new Brain();
            brain.theBrainWorks();
        }
    }
    private class Heart{
        Heart(int heartAge){
            age = heartAge;
        }
    }
    private class  Hands {
        public void toWork (){
            System.out.println("Руки работают!");
        }
    }
    private class  Legs {
        public void toGo(){
            System.out.println("Ноги ходят!");
        }
    }

    public static class Clothes {
        public void toPutOnClothes(){
            System.out.println("Носит опрятную одежду");
        }
    }







}
