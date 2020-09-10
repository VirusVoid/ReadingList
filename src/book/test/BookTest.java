package book.test;

import book.business.BookManager;
import book.entity.Book;

import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        BookManager bm = new BookManager();

        Book b1 = new Book("451 градус по Фаренгейту", "Рей", "Бредбери","антиутопия", 1953);
        Book b2 = new Book("1984", "Джордж", "Оруэлл","антиутопия", 1949);
        Book b3 = new Book("О дивный новый мир", "Олдос", "Хаксли","антиутопия", 1932);

        System.out.println("ADD BOOKS ================");
        Long bId1 = bm.addBook(b1);
        Long bId2 = bm.addBook(b2);
        Long bId3 = bm.addBook(b3);
        List<Book> result1 = bm.findBooks();
        for (Book b: result1){
            System.out.println(b);
        }

        System.out.println("UPDATE BOOK =================");
        Book change = new Book(bId1, "451° по Фаренгейту", "Рей", "Бредбери","антиутопия", 1953);
        bm.updateBook(change);
        List<Book> result2 = bm.findBooks();
        for (Book b: result2){
            System.out.println(b);
        }

        System.out.println("DELETE BOOK ==================");
        bm.deleteBook(bId1);
        List<Book> result3 = bm.findBooks();
        for (Book b: result3){
            System.out.println(b);
        }

        System.out.println("GET BOOK ==================");
        Book book = bm.getBook(bId2);
        System.out.println(book);
    }
}
