package com.example.dplm.controller;

import com.example.dplm.domain.SimpleObject;
import com.example.dplm.domain.Message;
import com.example.dplm.repos.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GettingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private MessageRepository messageRepository;


    @RequestMapping("/messages")
    public Iterable<Message> getMessages(){
//        Message message = new Message("text", "tag");
//        messageRepository.save(message);
        return messageRepository.findAll();
    }

    @RequestMapping("/message")
    public SimpleObject greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new SimpleObject(Calendar.getInstance(),
                String.format(template, name));
    }
}
