package com.company;

import java.util.Objects;

import static java.util.Objects.*;

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
        this.setName(name);
        this.setSurname(surname);
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


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
      /*
         1.10. Методы объектов
    Реализовать методы toString, equals и hashCode в классах Author и Book, которые были созданы на прошлом уроке.
    Обратите внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать
    (вызывать) его версию метода.
         - **Критерии оценки**
             – Метод toString реализован корректно.
             – Метод equals реализован корректно.
             – Метод hashCode реализован корректно.
            – Методы не дублируют друг друга в классах Author и Book.
         */

    @Override
    public String toString() {
        return ". Автор Имя Фамилия: " + name + ". " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return hash(surname);
    }
}
