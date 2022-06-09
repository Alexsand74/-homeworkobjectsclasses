package com.company;

public class Book {
      /*
      п 1
       Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
       Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
        */
      Author author;
      int year;
      String nameOfTheBook;
      /*
      п 3
      Написать конструкторы для обоих классов, заполняющие все поля.
        */
      public Book (Author author, int year, String nameOfTheBook){
          this.author = author;
          this.year = year;
          this.nameOfTheBook = nameOfTheBook;
      }

       public Book(String Names, String Surnames, int year, String nameOfTheBook ){
          Author aut = new Author (Names,Surnames);
           this.year = year;
        this.nameOfTheBook = nameOfTheBook;

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
       /*
        п 5
        Создать сеттер для поля «Год публикации» у книги.
         */
       public void setYear( int year){
           this.year = year;
       }

}
