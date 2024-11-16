package MapHashMapTreeMapHomeTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Создайте HashMap c ключами Integer, значениями – String.
 * Напишите метод, который возвращает набор ключей, содержащихся в этой карте
 */
public class Task1 {
    public static  <K,V> void whereIsMyKeys (HashMap<K,V> nameOfMap) {
        ArrayList<Integer> myKeys = new ArrayList<>();
        for (Map.Entry<K, V> entry: nameOfMap.entrySet()){
            myKeys.add((Integer) entry.getKey());

        }
        System.out.println("Набор ключей " + myKeys);

    }
    public static void main(String[] args) {
        HashMap<Integer, String> nameDoor = new HashMap<>();
        nameDoor.put(29, "Ponch!k");
        nameDoor.put(31, "Kolo&");
        nameDoor.put(87, "Marmel$");
        nameDoor.put(11, "Ololoshka");
        whereIsMyKeys(nameDoor);
        // или
        System.out.println("Тоже набор ключей " +  nameDoor.keySet());
    }
}

