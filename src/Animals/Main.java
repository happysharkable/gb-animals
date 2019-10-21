package Animals;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat(300, 5, 15);  // Аппетит 15, стандартная миска 15 = наелся
        cats[1] = new Cat(); // Конструктор по умолчанию выставляет аппетит 10, стандартная миска 15 = наелся
        cats[2] = new Cat(400, 3, 20); // Аппетит 15, стандартная миска 15 = не наелся
        cats[3] = new Cat(350, 4, 25); // Аппетит 25, стандартная миска 15 = не наелся
        cats[4] = new Cat(); // Конструктор по умолчанию выставляет аппетит 10, стандартная миска 15 = наелся

        // Коты едят каждый из персональной миски
        for (int i = 0; i < cats.length; i++) {
           cats[i].eat();
           if (!cats[i].isHungry()) {
               System.out.println("Кот номер " + (i + 1) + " наелся!");
           } else {
               System.out.println("Кот номер " + (i + 1) + " остался голодный, еды в его миске недостаточно");
           }
        }

        System.out.println();
        // Общая миска, откуда будут есть все пять котов по очереди
        Bowl bowlForAll = new Bowl(50);
        for (int i = 0; i < cats.length; i++) {
            if (bowlForAll.isEnoughFood(cats[i].getAppetite())) {
                bowlForAll.eat(cats[i].getAppetite());
                System.out.println("Кот номер " + (i + 1) + " съел из общей миски " + cats[i].getAppetite() + " еды");
            } else {
                bowlForAll.fillWithFood();
                System.out.println("Недостаточно еды коту номер " + (i + 1) + ". Засыпаем миску кормом доверху..");
                bowlForAll.eat(cats[i].getAppetite());
                System.out.println("Кот номер " + (i + 1) + " съел из общей миски " + cats[i].getAppetite() + " еды");
            }
        }
        if (bowlForAll.getFoodLeft() > 0) {
            System.out.println("Все коты накормлены! В миске осталось еще " + bowlForAll.getFoodLeft() + " еды");
        } else if (bowlForAll.getFoodLeft() == 0) {
            System.out.println("Все коты накормлены, в миске еды не осталось");
        } else {
            System.out.println("Накормить всех котов не удалось");
        }
    }
}
