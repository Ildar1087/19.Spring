package ru.geekbrain;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vlad", "Fattahov", 38);
        Person person1 = new Person("Vladlena", "Fattihova", 18);
        Person person2 = new Person("Loya", "Hattahova", 23);

        // Сериализуем из объекта в JSON
        System.out.println();
        System.out.println("Сериализация в формат JSON.");
        Gson gson = new Gson();
        String personGson = gson.toJson(person);
        System.out.println(personGson);

        // Обратный процесс: десериализация из JSON в объект Person
        System.out.println();
        System.out.println("Десериализация из JSON в объект");
        Person personDeser = gson.fromJson(personGson, Person.class);
        System.out.println(personDeser);

        // HashCode объекта
        System.out.println();
        System.out.println("HashCode объектов");
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        // сравниваем объекты по equals
        System.out.println();
        System.out.println("Equals объектов");
        System.out.println(person2.equals(person1));
        System.out.println(person.equals(person2));




    }
}
