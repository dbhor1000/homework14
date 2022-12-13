public class Car {

    String model;
    double engineVol;
    String color;
    int year;
    String country;

    void requestInformation() {

        System.out.println(model + ", " + year + " год выпуска, " + country + ", " + color + " цвет кузова. Объем двигателя " + engineVol + " литра(-ов).");

    }

}
