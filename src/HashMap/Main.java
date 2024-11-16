package HashMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> regions = new TreeMap<>();
        regions.put(63, "Я");
        regions.put(77, "А");
        regions.put(56, "Л");
        regions.put(2, "Ж");
        System.out.println(regions);

        ArrayList<String> names = new ArrayList<>();
        for (Map.Entry<Integer, String> entry: regions.entrySet()){
            names.add(entry.getValue());
        }
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
        for (String name : names){
            for (Map.Entry<Integer, String> entry : regions.entrySet()){
                if (entry.getValue().equals(name)){
                    sortedMap.put(entry.getKey(), name);
                }
            }
        }
        System.out.println(sortedMap);



//        regions2.remove(2);


//        regions2.put (63, regions2.get(63) + " Тольятти"); // Добовляем элемент по ключу
//        System.out.println("Новый элемент " + regions2.get(63));
//        for (Map.Entry region: regions2.entrySet()) { // С помощью цикла for выводоим элементы!
//            System.out.println(region.getKey() + " " + region.getValue());
//
//        }

    }
}
