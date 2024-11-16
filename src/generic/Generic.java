package generic;

public class Generic <T, V> {
    T objectT; // объявление объекта типа Т
    V objectV;
    // Передать конструктору ссылку на объект типа Т
    public Generic(T objectT, V objectV){
        this.objectT = objectT;
        this.objectV = objectV;

    }
    // Вернуть objectV.
    public  T getObjectT(){
        return objectT;
    }
    public  V getObjectV(){
        return objectV;
    }
    // Показать тип Т
    public void showType(){
        System.out.println("Типом Т является " + objectT.getClass().getName());
        System.out.println("Типом V является " + objectV.getClass().getName());
    }
}
