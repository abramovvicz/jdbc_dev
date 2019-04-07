package main;

import dao.BookDaoImpl;
import model.Book;
import service.BookService;
import service.BookServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
//        ConnectionManager.getConnection();
        BookService bookService = new BookServiceImpl(new BookDaoImpl());
        List<Book> bookList = bookService.find();
//        System.out.println(bookList.toString());
        bookList = bookService.findByCategoryCode("CRIME");
        System.out.println(bookList );

        Book book = new Book();
        book.setTitle("cokolwiek");
        book.setPagesNumber(100);
        book.setIsbn(21345L);
        book.setCategoryId(1);
        book.setPublisherId(1);
        bookService.insert(book);
    }
}
