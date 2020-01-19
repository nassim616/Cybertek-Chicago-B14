package Constructors;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Book book1 = new Book(" java ", " cybertek ", 200);
        Book book2 = new Book(" auyomation ", " cybertek " , 300);
        Book [] myBooks = new Book[3];
        myBooks[0] = book1;
        myBooks[1] = book2;
        myBooks[0].pages=50;
        for(Book eachBook : myBooks){
            System.out.println(eachBook.name);

        }
        for(int i = 0 , j= 50 ; i < myBooks.length;i++,j+=100 ){
            myBooks[i].pages = j;
        }
        for (Book eachBooks: myBooks){
            eachBooks.info();
        }

//        Create a program that will ask the user how many books they have.
//                Then they will be asked to enter the book’s title, author, and number of pages.
//                Create each book object and store them into a Book array.
//                Part 2: Loop through your array and print the name of all the books


        Scanner in = new Scanner(System.in);
        System.out.println(" how many books you have ");
        int book = in.nextInt();
        in.nextLine(); // to print out the next line .

        Book [] library = new Book [book];
        for ( int i = 0 ; i< library.length ; i++){
            System.out.println(" enter the title "+ (i+1));
            String title = in.nextLine();
            System.out.println("the author " + (i+1));
            String  author = in.nextLine();
            System.out.println("number of pages " + (i+1));
            int pages=in.nextInt();
            in.nextLine();
            Book eachbook = new Book(title,author,pages);
            library[i] = eachbook;
            library[i] = new Book(title,author,pages);


        }
//        for(Book book : library){
//            System.out.println(book.title);

        }

    }

