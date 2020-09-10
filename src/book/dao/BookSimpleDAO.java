package book.dao;

import book.entity.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Моделирование хранилища
 */

public class BookSimpleDAO implements BookDAO{
    private final List<Book> books = new ArrayList<Book>();

    @Override
    public Long addBook(Book book) {
        Long id = generateBookId();
        book.setBookId(id);
        books.add(book);
        return id;
    }

    @Override
    public void updateBook(Book book) {
        Book oldBook = getBook(book.getBookId());
        if (oldBook != null){
            oldBook.setBookTitle(book.getBookTitle());
            oldBook.setAuthorName(book.getAuthorName());
            oldBook.setAuthorSurname(book.getAuthorSurname());
            oldBook.setGenre(book.getGenre());
            oldBook.setYearOfPublication(book.getYearOfPublication());
        }
    }

    @Override
    public void deleteBook(Long bookId) {
        for (Iterator<Book> it = books.iterator();
        it.hasNext();){
            Book bk = it.next();
            if (bk.getBookId().equals(bookId)){
                it.remove();
            }
        }
    }

    @Override
    public Book getBook(Long bookId) {
        for (Book book: books){
            if (book.getBookId().equals(bookId)){
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> findBooks() {
        return books;
    }

    private Long generateBookId(){
        Long bookId = Math.round(Math.random()*1000+System.currentTimeMillis());
        while (getBook(bookId)!=null){
            bookId = Math.round(Math.random()*1000+System.currentTimeMillis());
        }
        return bookId;
    }
}
