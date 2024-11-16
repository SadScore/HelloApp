package generic;

public class States <T extends Number> {
    T[] numbers;

    public States (T[] numbers){
        this.numbers = numbers;

    }
    public double getAverage(){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i].doubleValue(); //
        }
        return sum/ numbers.length;
    }

    public boolean sameAverage (States <?> object){ //шаблоны аргумента ставим ВОПРОС
        if (getAverage() == object.getAverage()){
            return true;
        }
        return false;
    }
}
