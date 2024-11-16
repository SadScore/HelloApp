package MapHashMapTreeMapHomeTask;

import java.util.HashMap;
import java.util.Map;
/**
 * Создайте HashMap c ключами Integer, значениями – String.
 * Напишите метод, который возвращает ассоциативный массив,
 * состоящий из элементов исходного map, при условии, что туда войдут элементы с длиной строки более 3.
 */
public class Task2 {
    public static Map<Integer, String >  sortMapByLengthOfName(Map<Integer, String> name){

       Map<Integer, String> newHashMap = new HashMap<>();
        for (Map.Entry<Integer, String > newNames : name.entrySet() ){
            if (newNames.getValue().length() > 3) {
                newHashMap.put(newNames.getKey(), newNames.getValue());
            }
        }
        return newHashMap;
    }
    public static void main(String[] args) {
        HashMap<Integer, String> nameOfPetNames = new HashMap<>();
        nameOfPetNames.put(10,"Koliz");
        nameOfPetNames.put(11,"Pop");
        nameOfPetNames.put(12,"Polunoch");
        nameOfPetNames.put(13,"Moz");
        nameOfPetNames.put(14,"Loped");
        System.out.println(nameOfPetNames);
        System.out.println(sortMapByLengthOfName(nameOfPetNames));

    }

}
