public class Car3 {

    String model;
    double engineVol;
    String color;
    int year;
    String country;

    public Car3(String model, double engineVol, String color, int year, String country) {

        if(model == null){

            this.model = "default";
        } else {

            this.model = model;

        }

        if(year <= 0){

            this.year = 2000;
        } else {

            this.year = year;

        }

        if(engineVol < 0){

            this.engineVol = 1.5;
        } else {

            this.engineVol = engineVol;

        }

        if(color == null){

            this.color = "Белый";
        } else {

            this.color = color;

        }

        if(country == null){

            this.country = "default";
        } else {

            this.country = country;

        }


    }

    void requestInformation3() {

        System.out.println(model + ", " + year + " год выпуска, " + country + ", " + color + " цвет кузова. Объем двигателя " + engineVol + " литра(-ов).");

    }

}
