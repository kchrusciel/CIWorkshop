package pl.codecouple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
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

    @RequestMapping("/addBook")
    public String addBook(){
        bookRepository.save(new Book("Test"));
        return "index";
    }

    @RequestMapping("/")
    public ModelAndView getBooks(ModelAndView modelAndView){
        modelAndView.addObject("books", bookRepository.findAll());
        modelAndView.setViewName("index");
        return modelAndView;
    }


}
