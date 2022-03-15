package lesson1_5;

public class PersonApp {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Сергей",
                "Старший сотрудник", "ivanovser@mail.mail", "+7 122 233 44 55", 100000,
                38);
        persArray[1] = new Person("Сергеев Иван",
                "Младший сотрудник", "sergeev@mail.mail", "+7 322 555 48 84", 80000,
                45);
        persArray[2] = new Person("Петров Семен",
                "Главный помощник", "petrov@mail.mail", "+7 177 255 44 88", 120000,
                42);
        persArray[3] = new Person("Симонов Дмитрий",
                "Второй помощник", "simonov@mail.mail", "+7 188 533 99 55", 110000,
                33);
        persArray[4] = new Person("Ломакин Василий",
                "Самый главный", "lomakin@mail.mail", "+7 144 443 77 66", 250000,
                48);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() >= 40) {
                System.out.println(persArray[i].toString());
                System.out.println();
            } else { continue; }

        }



    }
}
