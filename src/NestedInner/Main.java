package NestedInner;

public class Main {
    public static void main(String[] args) {
        /**
         * nessted
         * inner
         */
        Human human = new Human();
        human.name = "Alex";
        human.toLive();
        Human.Clothes dressed = new Human.Clothes();
        dressed.toPutOnClothes();



    }
}
