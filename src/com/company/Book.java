package com.company;

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
          counter++;      // увеличение  счетчика создания объектов book
          this.id = counter;
       }

    // пишем конструктор для класса Book и его полей который внутри себя создает объект на основе
    // конструктора в классе Author и так как поле author, это есть описание объекта класса Аuthor
    // в классе Book, то с помощью этого поля, объект выводим из конструктора в класс Book и
    // создается объект класса Author
       public Book(String names, String surnames, int year, String nameOfTheBook ){
          this.author = new Author (names,surnames);
           this.year = year;
        this.nameOfTheBook = nameOfTheBook;
           counter++;      // увеличение  счетчика создания объектов book
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
       public void setCounter (int counter) { this.counter = counter;}

}
