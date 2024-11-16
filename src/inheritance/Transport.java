package inheritance;

public class Transport {
    String name;
    int weight;

    public Transport(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void drive (){
        System.out.println("Транспорт начал движение!");
    }
    public void stop (){
        System.out.println("Траноспрт остановился!");
    }
}
