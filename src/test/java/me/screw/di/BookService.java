package me.screw.di;

public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookRepository getBookRepository() {
        return bookRepository;
    }
}
