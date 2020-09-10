package book.dao;

/**
 * Фабрика для создания экземпляра BookDAO
 * отвечает за создание хранилища
 */
public class BookDAOFactory {
    public static BookDAO getBookDAO(){
        return new BookSimpleDAO();
    }
}