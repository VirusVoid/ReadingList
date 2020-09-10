package book.dao;

import book.entity.Book;

import java.util.List;

/**
 * Интерфейс для определения функций анализа данных о книгах
 * DAO-Data Access Object-объект доступа к данным
 */
public interface BookDAO {
    public Long addBook(Book book);
    public void updateBook(Book book);
    public void deleteBook(Long bookId);
    public Book getBook(Long bookId);
    //Получение списка книг
    public List<Book> findBooks();
}
