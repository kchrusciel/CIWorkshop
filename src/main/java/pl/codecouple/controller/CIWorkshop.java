package pl.codecouple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.codecouple.domain.Book;
import pl.codecouple.repository.BookRepository;

import java.util.List;

/**
 * Created by Krzysztof Chruściel.
 */
@RestController
public class CIWorkshop {

    private BookRepository bookRepository;

    @Autowired
    public CIWorkshop(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public List<Book> getBooks(){
//        bookRepository.save(new Book("Jan nowak"));
        return bookRepository.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

}
