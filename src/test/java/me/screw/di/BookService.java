package me.screw.di;

public class BookService {

    @Bean
    private BookRepository bookRepository;

    public BookRepository getBookRepository() {
        return bookRepository;
    }
}
