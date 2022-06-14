package com.company;

import phonebook.Contact;

import java.util.Objects;

public class Book extends Object {
      /*
      п 1
       Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
       Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
        */
      private Author author;        // поле объекта автор, в него входят объект и поля класса Autor
      private int year;             // год издания книги
      private String nameOfTheBook; // название книги
      private  int id;              // номер создания объекта
      private static  int counter;  // переменная счетчика создания объектов работает внутри данного класса
      /*
      п 3
      Написать конструкторы для обоих классов, заполняющие все поля.
        */
      // пишем конструктор для класса Book и его полей
      public Book (Author author, int year, String nameOfTheBook){
          this.author = author;
          this.year = year;
          this.nameOfTheBook = nameOfTheBook;
          counter ++ ;      // увеличение  счетчика создания объектов book
          this.id = counter;
       }

    // пишем конструктор для класса Book и его полей который внутри себя создает объект на основе
    // конструктора в классе Author и так как поле author, это есть описание объекта класса Аuthor
    // в классе Book, то с помощью этого поля, объект выводим из конструктора в класс Book и
    // создается объект класса Author
       public Book(String names, String surnames, int year, String nameOfTheBook ){
           this.author = new Author (names,surnames);
           this.year = year ;
           this.nameOfTheBook = nameOfTheBook;
           counter ++ ;      // увеличение  счетчика создания объектов book
           this.id = counter;
    }
       /*
        п 4
        Создать геттеры для всех полей книги.
         */
       public Author getAuthor(){
           return this.author;
       }
       public int getYear(){
           return this.year;
       }
       public String getNameOfTheBook(){
           return this.nameOfTheBook;
       }
       public int getCounter(){
        return this.counter;
    }
       public int getId() { return  this.id; }
       /*
        п 5
        Создать сеттер для поля «Год публикации» у книги.
         */
       public void setYear( int year){
           this.year = year;
       }

       //public void setCounter (int counter) { this.counter = counter;}

       //public void setAuthor(Author author) { this.author = author; }

       // public void setNameOfTheBook(String nameOfTheBook) { this.nameOfTheBook = nameOfTheBook;}

       // public void setId(int id) {  this.id = id;
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
        return id + ". Имя книги: " + nameOfTheBook + ". год издания книги: " + year ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        boolean varible = nameOfTheBook.equals(book.nameOfTheBook);
        if (varible){
            System.out.println( " Книги имеют одиаковы названия !");
        } else {System.out.println(" У этих книг разные названия ! ");}
        return varible;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheBook);
    }
}
