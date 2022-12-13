public class Person3 {

    int year;
    String name;
    String city;
    String occupation;

    public Person3(int year, String name, String city, String occupation) {
        this.year = year;
        this.name = name;
        this.city = city;
        this.occupation = occupation;
    }

    void introductionThree() {

        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ".  Я родился в " + year + " году. Я работаю на должности " +
                occupation + ". Будем знакомы!");

    }

}
