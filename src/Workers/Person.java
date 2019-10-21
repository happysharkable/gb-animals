package Workers;

public class Person {
    private String name;
    private String position;
    private String email;
    private long phone;
    private int salary;
    private int age;

    public Person(String _name, String _position, String _email, long _phone, int _salary, int _age) {
        name = _name;
        position = _position;
        email = _email;
        phone = _phone;
        salary = _salary;
        age = _age;
    }

    public int getAge() {
        return this.age;
    }

    public void getInfo() {
        System.out.print("Имя: " + name +
                "\nДолжность: " + position +
                "\nEmail: " + email +
                "\nТелефон: " + phone +
                "\nЗарплата: "  + salary +
                "\nВозраст: " + age + "\n");
    }
}
