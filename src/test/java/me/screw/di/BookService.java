package me.screw.di;

public class BookService {

    @Inject
    private BookRepository bookRepository;

    public BookRepository getBookRepository() {
        return bookRepository;
    }
}
