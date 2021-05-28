package enumLesson;

import java.util.Arrays;

public enum Cars {
    LEXUS(1200, 150000, "Lexus"),
    MERSEDESS(1100, 130000, "Mersedess"),
    BMW(1000, 100000, "Bmw"),
    RENO(950, 90000, "Reno");

    int horsePower;
    int price;
    String name;

    public static String returnValues(String name) {
        Cars[] values = Cars.values();
        String selectCarFromList = "Виберіть машину зі списку: " + Arrays.toString(values);
        for (Cars car : values) {
            if (car.name.equals(name)) {
                return String.valueOf(car);
            }
        }
        return selectCarFromList;
    }

    Cars(int horsePower, int price, String name) {
        this.name = name;
        this.horsePower = horsePower;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", horsePower=" + horsePower +
                ", price=" + price +
                '}';
    }
}
