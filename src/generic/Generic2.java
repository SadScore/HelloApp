package generic;

public class Generic2 {
    static <T, V extends T> boolean isItInclude (T value, V[] array){
        boolean check = true;
        for (int i = 0; i <array.length; i++){
            if (value.equals(array[i])){
                check = true;
                break;
            } else {
                check = false;
            }
        }
        return check;
    }
}
