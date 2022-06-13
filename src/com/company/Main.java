package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /*
       п 1
       Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
       Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
        */
       // Создали и смотрим появившийся класс Book,
       // В нем создали поля: String author; и int year;
       /*
       п 2
       Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
        */
        // Создали и смотрим появившийся класс Book,
        // В нем создали поля: String name; и String surname;
        /*
        п 3
        Написать конструкторы для обоих классов, заполняющие все поля.
        */
        //Создаем конструктора внутри классов Author и Book
        /*
        п 4
        Создать геттеры для всех полей автора и всех полей книги.
         */
        //Создаем  геттеры для всех полей в классе Author и Book
        /*
        п 5
        Создать сеттер для поля «Год публикации» у книги.
         */
        // Идем в класс Book и создаем сеттер для переменной year
        /*
        п 6
        В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор
        (достаточно тоже двух) и инициализировать друг друга.
        Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.

        Метод main не должен находиться в классах Book и Author.
        Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
        */
        // инициализируем несколько обьектов Автор
        Author author1 = new Author("Александр","Пушкин");
        Author author2 = new Author("Михаил","Лермонтов");
        // создаем несколько объектов Книга
        Book book1 = new Book(author1,1833,"Евгений Онегин");
        Book book2 = new Book(author2, 1835, "Маскарад");
        // попытка объединить вызовы двух конструкторов в один конструктор
        Book book3 = new Book("Александр","Солженицын",1973,"Архипелаг ГУЛАГ");


        // Достаем имя и фамилию автора из класса Book, через метод getAutor, далее уже работаем сметодами
        // getName() и getSurname()
        System.out.println (book1.getId() + ". Имя книги: " + book1.getNameOfTheBook()+ ". год издания книги: " + book1.getYear() +
                ". Автор Имя Фамилия: " + book1.getAuthor().getName() + ". " + book1.getAuthor().getSurname());
        System.out.println();
        // Достаем имя и фамилию автора из класса Autor, далее уже работаем сметодами getName() и getSurname()
        System.out.println (book1.getId() + ". Имя книги: " + book1.getNameOfTheBook()+ ". год издания книги: " + book1.getYear() +
                ". Автор Имя Фамилия: " + author1.getName() + ". " + author1.getSurname());
        System.out.println();
        /*
        п 7
        В том же методе main изменить год публикации одной из книг с помощью сеттера.
         */
        // меняем в объекте book2 дату с 1835 года на 1836
        System.out.println (book2.getId() + ". Имя книги: " + book2.getNameOfTheBook()+ ". год издания книги: " + book2.getYear() +
                ". Автор Имя Фамилия: " + book2.getAuthor().getName() + ". " + book2.getAuthor().getSurname());
        System.out.println();
        System.out.println (book3.getId() + ". Имя книги: " + book3.getNameOfTheBook()+ ". год издания книги: " + book3.getYear() +
                ". Автор Имя Фамилия: " + book3.getAuthor().getName() + ". " + book3.getAuthor().getSurname());
        System.out.println();

        book2.setYear(1836);

        System.out.println("book2.getYear() = " + book2.getYear());
        System.out.println("book2.nameOfTheBook = " + book2.getNameOfTheBook());
        System.out.println();
        System.out.println (book2.getId() + ". Имя книги: " + book2.getNameOfTheBook()+ ". год издания книги: " + book2.getYear() +
                ". Автор Имя Фамилия: " + book2.getAuthor().getName() + ". " + book2.getAuthor().getSurname());






    }
}
