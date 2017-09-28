package com.yearcon.girl.controller;

import com.yearcon.girl.dao.ReadingListRepository;
import com.yearcon.girl.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class ReadingListController {

    @Autowired
    private ReadingListRepository readingListRepository;


    @RequestMapping(value = "/{reader}",method = RequestMethod.GET)
    public String readerBooks(@PathVariable("reader") String reader, Model model){

        List<Book>books = readingListRepository.findByReader(reader);
        if(books!=null){
            model.addAttribute("books", books);
        }
        return "readinglist";
    }





}
