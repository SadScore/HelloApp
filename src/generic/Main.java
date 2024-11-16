package generic;

public class Main {
    public static void main(String[] args) {
//        Generic<Integer, String > regions = new Generic<>(63, "Samara");
//        regions.showType();
//        System.out.println(regions.getObjectT());
//        System.out.println(regions.getObjectV());
//
//        Generic<String , String > regionsTwo = new Generic<>("Samara", "Russia");
//        regionsTwo.showType();
//        System.out.println(regionsTwo.getObjectT());
//        System.out.println(regionsTwo.getObjectV());

//        Integer[] numbers = {1,2,3,4,5};
//        States<Integer> stateOne = new States<>(numbers);
//        System.out.println(stateOne.getAverage());
//
//        Double[] numbersTwo = {2.1,3.5, 5.1, 10.2};
//        States<Double> stateTwo = new States<>(numbersTwo);
//        System.out.println(stateTwo.getAverage());
//
//        if (stateOne.sameAverage(stateTwo)){
//            System.out.println("Среднее значения равны");
//        }else {
//            System.out.println("Средние значения отличаются");
//        }
//        Integer[] integers = {1,2,3,4,5};
//        System.out.println(Generic2.isItInclude(3, integers));
//
//        String [] strings = {"one", "two", "three"};
//        System.out.println(Generic2.isItInclude(3, strings));
        Generic3 generic3 = new Generic3(4);
        generic3.showValue();

        Generic3 generic1 = new Generic3(5.1);
        generic1.showValue();









    }

}
