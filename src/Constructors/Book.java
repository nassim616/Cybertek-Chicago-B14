package Constructors;

public class Book {
    String name ;
    String author;
    int pages ;

    public Book ( String name, String author, int pages){
        this.name= name ;
        this.author = author;
        this.pages = pages;
    }
    public void  info (){
        System.out.println("Name " + this.name );
        System.out.println("author " + this.author);
        System.out.println("pages " + this.pages);
        System.out.println();
    }
}
