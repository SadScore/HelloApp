package Module1;

public class OperatorSwitch {
    public static void main(String[] args) {
        int month = 16;
        String season = "";
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                if (month == 12) {
                    season += " декабрь";
                } else if (month == 1) {
                    season += " январь";
                } else if (month == 2) {
                    season += " февраль";
                }
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                if (month == 3) {
                    season += " март";
                } else if (month == 4) {
                    season += " апрель";
                } else if (month == 5) {
                    season += " май";
                }
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                if (month == 6) {
                    season += " июнь";
                } else if (month == 7) {
                    season += " июль";
                } else if (month == 8) {
                    season += " август";
                }
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                if (month == 9) {
                    season += " сентябрь";
                } else if (month == 10) {
                    season += " октябрь";
                } else if (month == 11) {
                    season += " ноябрь";
                }
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
        System.out.println(season);

    }
}
