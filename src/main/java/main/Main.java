package main;

import connection.ConnectionManager;
import dao.BookDaoImpl;
import dao.CategoryDaoImp;
import dto.BookDto;
import model.Book;
import service.BookService;
import service.BookServiceImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
//        ConnectionManager.getConnection();

        ConnectionManager.getConnection();
        BookService bookService = new BookServiceImpl(new BookDaoImpl(), new CategoryDaoImp());
        List<Book> bookList = bookService.find();
        System.out.println(bookList.toString());
        bookList = bookService.findByCategoryCode("CRIME");
        System.out.println(bookList);

        Book book = new Book();
        book.setTitle("cokolwiek");
        book.setPagesNumber(100);
        book.setIsbn(21345L);
        book.setCategoryId(1);
        book.setPublisherId("1");
        bookService.insert(book);


        BookDto bookDto = new BookDto();
        bookDto.setTitle("Jakiś  tytuł");
        bookDto.setIsbn(13123L);
        bookDto.setPagesNumber(123);
        bookDto.setCategoryCode("FANTASY");
        book.setPublisherId("Wydawnictwo supernowa");

        bookService.insert(bookDto);

    }


}
