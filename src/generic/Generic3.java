package generic;

public class Generic3 {
    private double value;
    public <T extends Number> Generic3(T arg){
        this.value = arg.doubleValue();
    }
    public void showValue(){
        System.out.println("Value: " + value);
    }
}
