public class Main {
    public static void main(String[] args) {

        //Task 1.1

        Person maksim = new Person();
        maksim.name = "Максим";
        maksim.year = 1987;
        maksim.city = "Минск";
        maksim.introduction();

        Person anya = new Person();
        anya.name = "Аня";
        anya.year = 1993;
        anya.city = "Москва";
        anya.introduction();

        Person katya = new Person();
        katya.name = "Катя";
        katya.year = 1994;
        katya.city = "Калининград";
        katya.introduction();

        Person artem = new Person();
        artem.name = "Артём";
        artem.year = 1995;
        artem.city = "Москва";
        artem.introduction();

        System.out.println();

        //Task 1.2

        Person2 maksim2 = new Person2();
        maksim2.name = "Максим";
        maksim2.year = 1987;
        maksim2.city = "Минск";
        maksim2.occupation = "бренд - менеджер";
        maksim2.introductionTwo();

        Person2 anya2 = new Person2();
        anya2.name = "Аня";
        anya2.year = 1993;
        anya2.city = "Москва";
        anya2.occupation = "методист образовательных программ";
        anya2.introductionTwo();

        Person2 katya2 = new Person2();
        katya2.name = "Катя";
        katya2.year = 1994;
        katya2.city = "Калининград";
        katya2.occupation = "продакт-менеджер";
        katya2.introductionTwo();

        Person2 artem2 = new Person2();
        artem2.name = "Артём";
        artem2.year = 1995;
        artem2.city = "Москва";
        artem2.occupation = "директор по развитию бизнеса";
        artem2.introductionTwo();

        System.out.println();

        //Task 1.3

        Car car1 = new Car();
        car1.model = "Lada Grande";
        car1.year = 2015;
        car1.country = "Россия";
        car1.color = "жёлтый";
        car1.engineVol = 1.7;
        car1.requestInformation();

        Car car2 = new Car();
        car2.model = "Audi A8 50 L TDI quattro";
        car2.year = 2020;
        car2.country = "Германия";
        car2.color = "чёрный";
        car2.engineVol = 3.0;
        car2.requestInformation();

        Car car3 = new Car();
        car3.model = "BMW Z8";
        car3.year = 2021;
        car3.country = "Германия";
        car3.color = "чёрный";
        car3.engineVol = 3.0;
        car3.requestInformation();

        Car car4 = new Car();
        car4.model = "Kia Sportage 4 поколение";
        car4.year = 2018;
        car4.country = "Южная Корея";
        car4.color = "красный";
        car4.engineVol = 2.4;
        car4.requestInformation();

        Car car5 = new Car();
        car5.model = "Hyundai Avante";
        car5.year = 2016;
        car5.country = "Южная Корея";
        car5.color = "оранжевый";
        car5.engineVol = 1.6;
        car5.requestInformation();

        System.out.println();


        //Task 2.1

        Person3 maksim3 = new Person3(1987, "Максим", "Минск", "бренд-менеджер");
        Person3 anya3 = new Person3(1993, "Аня", "Москва", "методист образовательных программ");
        Person3 katya3 = new Person3(1994, "Катя", "Калининград", "продакт-менеджер");
        Person3 artem3 = new Person3(1995, "Артём", "Москва", "директор по развитию бизнеса");

        maksim3.introductionThree();
        anya3.introductionThree();
        katya3.introductionThree();
        artem3.introductionThree();

        System.out.println();

        //Task 2.2

        Car2 car21 = new Car2("Lada Grande", 1.7,  "жёлтый", 2015, "Россия");
        Car2 car22 = new Car2("Audi A8 50 L TDI quattro", 3.0,  "чёрный", 2020, "Германия");
        Car2 car23 = new Car2("BMW Z8", 3.0,  "чёрный", 2021, "Германия");
        Car2 car24 = new Car2("Kia Sportage 4 поколение", 2.4,  "красный", 2018, "Южная Корея");
        Car2 car25 = new Car2("Hyundai Avante", 1.6,  "оранжевый", 2016, "Южная Корея");

        car21.requestInformation2();
        car22.requestInformation2();
        car23.requestInformation2();
        car24.requestInformation2();
        car25.requestInformation2();

        System.out.println();

        //Task 3.1

        Person4 maksim4 = new Person4(-1987, null, "Минск", "бренд-менеджер");
        Person4 anya4 = new Person4(1993, "Аня", null, "методист образовательных программ");
        Person4 katya4 = new Person4(0, "Катя", "Калининград", "продакт-менеджер");
        Person4 artem4 = new Person4(1995, "Артём", null, "директор по развитию бизнеса");

        maksim4.introductionFour();
        anya4.introductionFour();
        katya4.introductionFour();
        artem4.introductionFour();

        System.out.println();

        //Task 4.1

        Car3 car31 = new Car3("Lada Grande", 1.7,  null, 2015, "Россия");
        Car3 car32 = new Car3("Audi A8 50 L TDI quattro", 3.0,  null, -3, "Германия");
        Car3 car33 = new Car3("BMW Z8", 3.0,  "чёрный", 2021, "Германия");
        Car3 car34 = new Car3(null, 2.4,  "красный", 0, "Южная Корея");
        Car3 car35 = new Car3("Hyundai Avante", 1.6,  "оранжевый", 2016, "Южная Корея");

        car31.requestInformation3();
        car32.requestInformation3();
        car33.requestInformation3();
        car34.requestInformation3();
        car35.requestInformation3();



    }
}