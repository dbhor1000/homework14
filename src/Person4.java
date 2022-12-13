public class Person4 {

    int year;
    String name;

    String city;
    String occupation;

    public Person4(int year, String name, String city, String occupation) {

        if (year < 0) {

            this.year = 0;

        } else {

            this.year = year;
        }

        if (name == null) {

            this.name = "<Информация не указана>";

        } else {

            this.name = name;
        }

        if (city == null) {

            this.city = "<Информация не указана>";

        } else {

            this.city = city;
        }

        if (occupation == null) {

            this.occupation = "<Информация не указана>";

        } else {

            this.occupation = occupation;
        }

    }

    void introductionFour() {

        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ".  Я родился в " + year + " году. Я работаю на должности " +
                occupation + ". Будем знакомы!");

    }

}
