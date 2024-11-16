package EnumClassWork;

public class Product {
    String name;
    String weight;
    Type type;

    public Product(String name, String weight, Type type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", type='" + type.getType() + '\'' +
                '}';
    }

    enum Type {
        FRUIT("Фрукт"),
        VEGETABLE("Овощи"),
        MEAT("Мясо"),
        FISH("Рыба");
        private String type;
        Type(String type){
            this.type = type;
        }
        public String getType (){
            return type;
        }
    }
}
