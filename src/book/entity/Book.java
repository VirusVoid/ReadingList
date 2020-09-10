package book.entity;

/**
 * Класс для хранения информации о книге
 */
public class Book {
    private Long bookId;
    //Название книги
    private String bookTitle;
    //Имя автора книги
    private String authorName;
    //Фамилия автора книги
    private String authorSurname;
    //Жанр
    private String genre;
    //Год публикации
    private Integer yearOfPublication;

    public Book(){

    }
    public Book(String bookTitle, String authorName, String authorSurname, String genre, Integer yearOfPublication){
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.genre = genre;
        this.yearOfPublication = yearOfPublication;
    }
    public Book(Long bookId, String bookTitle, String authorName, String authorSurname, String genre, Integer yearOfPublication){
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.genre = genre;
        this.yearOfPublication = yearOfPublication;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString(){
        return "Book{" + "bookId=" + bookId + ", bookTitle="+bookTitle+", authorName=" + authorName+", authorSurname=" + authorSurname + ", genre=" + genre + ", year of publication=" + yearOfPublication+ '}';
    }
}
