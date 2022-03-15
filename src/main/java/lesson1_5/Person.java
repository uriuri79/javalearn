package lesson1_5;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "\r\n ФИО: '" + fullName + '\'' +
                ", \r\n Должность: '" + position + '\'' +
                ", \r\n email: '" + email + '\'' +
                ", \r\n Телефон: '" + phone + '\'' +
                ", \r\n Зарплата: " + salary +
                ", \r\n Возраст: " + age +
                ' ';
    }
}
