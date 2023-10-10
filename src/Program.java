import Animals.*;
import Exceptions.IncorrectNumber;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Counter count = new Counter();

        Cat cat1 = new Cat(count.add(), "Barsik", "2020-01-01", "cat");
        cat1.setCommands("run");
        cat1.setCommands("murk");
        Cat cat2 = new Cat(count.add(), "Mursik", "2021-02-07", "cat");
        cat2.setCommands("stop");
        cat2.setCommands("jump");
        Dog dog1 = new Dog(count.add(), "Sharik", "2019-03-05", "dog");
        dog1.setCommands("seat");
        dog1.setCommands("die");
        Dog dog2 = new Dog(count.add(), "Polkan", "2023-03-01", "dog");
        Hamster hamster1 = new Hamster(count.add(), "Puhla", "2022-03-08", "hamster");
        Horse horse1 = new Horse(count.add(), "Avrora", "2020-05-09", "horse");
        Camel camel1 = new Camel(count.add(), "Fedya", "2017-05-09", "camel");
        Donkey donkey1 = new Donkey(count.add(), "Smarty", "2016-05-07", "donkey");

        Animals animals = new Animals();

        animals.addAnimal(cat1);
        animals.addAnimal(cat2);
        animals.addAnimal(dog1);
        animals.addAnimal(dog2);
        animals.addAnimal(hamster1);
        animals.addAnimal(horse1);
        animals.addAnimal(camel1);
        animals.addAnimal(donkey1);

        String choose = "";
        Scanner sc = new Scanner(System.in);

        while (choose.equals("")) {

            System.out.printf("Выберите действие:\n" +
                    "1. Добавить новое животное\n" +
                    "2. Обучить животное\n" +
                    "3. Смотреть список команд животного\n" +
                    "4. Смотреть список животных\n"+
                    "5. Выход\n");

            choose = sc.next();

            try {

                if (choose.equals("1")) {

                    String chooseTypeAnimal = "";

                    System.out.println("Введите кличку: ");
                    String nameAnimal = sc.next();

                    System.out.println("Введите дату рождения: ");
                    String birthDate = sc.next();

                    while (chooseTypeAnimal.equals("")) {

                        System.out.printf("Выберите тип животного:\n" +
                                "1. Кошка\n" +
                                "2. Собака\n" +
                                "3. Хомяк\n" +
                                "4. Лошадь\n" +
                                "5. Верблюд\n" +
                                "6. Осел\n" +
                                "7. Отмена\n");

                        chooseTypeAnimal = sc.next();
                        String typeAnimal = "";

                        try {
                            if (chooseTypeAnimal.equals("1")) {
                                typeAnimal = "cat";
                                Cat cat = new Cat(count.add(), nameAnimal, birthDate, typeAnimal);
                                animals.addAnimal(cat);
                                System.out.println("Животное успешно создано!");
                            } else if (chooseTypeAnimal.equals("2")) {
                                typeAnimal = "dog";
                                Dog dog = new Dog(count.add(), nameAnimal, birthDate, typeAnimal);
                                animals.addAnimal(dog);
                                System.out.println("Животное успешно создано!");
                            } else if (chooseTypeAnimal.equals("3")) {
                                typeAnimal = "hamster";
                                Hamster hamster = new Hamster(count.add(), nameAnimal, birthDate, typeAnimal);
                                animals.addAnimal(hamster);
                                System.out.println("Животное успешно создано!");
                            } else if (chooseTypeAnimal.equals("4")) {
                                typeAnimal = "horse";
                                Horse horse = new Horse(count.add(), nameAnimal, birthDate, typeAnimal);
                                animals.addAnimal(horse);
                                System.out.println("Животное успешно создано!");
                            } else if (chooseTypeAnimal.equals("5")) {
                                typeAnimal = "camel";
                                Camel camel = new Camel(count.add(), nameAnimal, birthDate, typeAnimal);
                                animals.addAnimal(camel);
                                System.out.println("Животное успешно создано!");
                            } else if (chooseTypeAnimal.equals("6")) {
                                typeAnimal = "donkey";
                                Donkey donkey = new Donkey(count.add(), nameAnimal, birthDate, typeAnimal);
                                animals.addAnimal(donkey);
                                System.out.println("Животное успешно создано!");
                            } else if (chooseTypeAnimal.equals("7")) {
                                choose = "";
                                break;
                            } else {
                                chooseTypeAnimal = "";
                                choose = "";
                                throw new IncorrectNumber("Некорректное значение!");
                            }
                        } catch (IncorrectNumber e) {
                            System.out.println("Ошибка: " + e.getMessage());
                        }

                        choose = "";

                    }

                } else if (choose.equals("2")) {

                    System.out.println("Введите команду для изучения: ");
                    String command = sc.next();

                    System.out.println("Введите id животного для обучения: ");
                    int idAnimal = sc.nextInt();

                    Animal learnAnimal = animals.getAnimal(idAnimal);
                    if(learnAnimal != null) {
                        learnAnimal.setCommands(command);
                        System.out.println("Команда успешно сохранена!");
                    } else {
                        System.out.println("Такое животное не найдено! Попробуйте снова.");
                    }
                    choose = "";

                } else if (choose.equals("3")) {

                    System.out.println("Введите id животного: ");
                    int idAnimal = sc.nextInt();

                    Animal foundAnimal = animals.getAnimal(idAnimal);
                    if(foundAnimal != null) {
                        System.out.println(foundAnimal.getCommands());
                    } else {
                        System.out.println("Такое животное не найдено! Попробуйте снова.");
                    }
                    choose = "";

                } else if (choose.equals("4")) {
                    animals.printAnimals();
                    choose = "";
                } else if (choose.equals("5")) {
                    break;
                } else {
                    System.out.println("choose = " + choose);
                    choose = "";
                    throw new IncorrectNumber("Некорректное значение!.");
                }

            } catch (IncorrectNumber e) {
                System.out.println("Ошибка: " + e.getMessage());
            }

        }
        sc.close();
    }

}