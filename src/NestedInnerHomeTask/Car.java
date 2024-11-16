package NestedInnerHomeTask;


public class Car {
    String carBrand;
    int speed;
    int weight;

    public Car(String carBrand, int speed, int weight) {
        this.carBrand = carBrand;
        this.speed = speed;
        this.weight = weight;
    }

    public void toChooseTheCar() {
        Engine engine = new Engine();
        Transmission transmission = new Transmission();
        Speedometer speedometer = new Speedometer();
        System.out.println("Автомоболь " + carBrand + " завелся!");
        engine.toRun();
        transmission.toRun();
        speedometer.speedInfo();

    }

    private class Engine {
        public void toRun() {
            System.out.println("Двигатель " + carBrand + " работает - нормально!");
            class OilFilter {
                public void isClean(boolean clean) {


                    if (clean == true) {
                        System.out.println("Масляный фильтр чистый!");
                    } else {
                        System.out.println("Масляный фильт нуждается в замене!");
                    }
                }
            }
            OilFilter oilFilter = new OilFilter();
            oilFilter.isClean(false); // Пониманию что корявенько.
        }


    }

    private class Transmission {
        public void toRun() {
            System.out.println("Трансмиссия работает - нормально!");
            class Gears {
                public void doesTurnCorrect() {
                    System.out.println("Переключение передач - корректно!");
                }
            }
            Gears gears = new Gears();
            gears.doesTurnCorrect();
        }


    }

    private class Speedometer {
        public void speedInfo() {
            System.out.println("Автоболь весом: " + weight + " кг. Едет со скоростью: " + speed + " км/ч");
            class Arrow {
                public void showSpeed() {
                    System.out.println("Стрелака спидометра показывает скорость: " + speed + " км/ч");
                }
            }
            Arrow arrow = new Arrow();
            arrow.showSpeed();
        }
    }
}
