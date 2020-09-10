package book.business;

import book.dao.BookDAO;
import book.dao.BookDAOFactory;
import book.entity.Book;

import java.util.List;

/**
 * Класс для реализации функций над списком книг
 */
public class BookManager {
    private BookDAO dao;

    public BookManager(){
        dao = BookDAOFactory.getBookDAO();
    }
    public Long addBook(Book book){
        return dao.addBook(book);
    }
    public void updateBook(Book book){
        dao.updateBook(book);
    }
    public void deleteBook(Long bookId){
        dao.deleteBook(bookId);
    }
    public Book getBook(Long bookId){
        return dao.getBook(bookId);
    }
    public List<Book> findBooks(){
        return dao.findBooks();
    }
}
