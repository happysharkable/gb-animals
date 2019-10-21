package Workers;

public class Main {
    public static void main(String[] args) {
        int minAge = 60;

        Person[] persArray = new Person[5];
        persArray[0] = new Person("James Gosling", "Java Developer", "james@java.com", 1555000001, 150000, 64);
        persArray[1] = new Person("Guido van Rossum", "Python Developer", "guido@python.com", 1555000002, 100000, 63);
        persArray[2] = new Person("Rasmus Lerdorf", "PHP Developer", "rasmus@php.com", 1555000003, 90000, 50);
        persArray[3] = new Person("Dennis MacAlistair Ritchie", "C Developer", "dennis@c.com", 1555000004, 120000, 70);
        persArray[4] = new Person("John George Kemeny", "BASIC Developer", "john@basic.com", 1555000005, 10000, 66);

        for (Person person : persArray) {
            if (person.getAge() >= minAge) person.getInfo();
        }
    }
}
