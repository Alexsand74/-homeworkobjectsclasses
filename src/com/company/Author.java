package com.company;

public class Author {
    /*
    п 2
    Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
        */
    private String name;
    private String surname;
    /*
    п 3
    Написать конструкторы для обоих классов, заполняющие все поля.
        */
    // пишем конструктор для класса Author для полей name и surname
    public Author (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    //public Author(){
    //}
    /*
    п 4
        Создать геттеры для всех полей автора
     */
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }



}
