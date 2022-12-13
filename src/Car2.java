public class Car2 {

    String model;
    double engineVol;
    String color;
    int year;
    String country;

    public Car2(String model, double engineVol, String color, int year, String country) {
        this.model = model;
        this.engineVol = engineVol;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    void requestInformation2() {

        System.out.println(model + ", " + year + " год выпуска, " + country + ", " + color + " цвет кузова. Объем двигателя " + engineVol + " литра(-ов).");

    }

}
