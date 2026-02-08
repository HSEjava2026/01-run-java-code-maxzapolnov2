package ru.hse.lab1;

import ru.hse.lab1.second.Person;
/**
* @author Запольнов Максим Александрович
* @version 1.0
* @since 2026
*/
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Анатолий", 43);
        System.out.println("Имя: " + person.name);
        System.out.println("Возраст: " + person.age);
    }
}
