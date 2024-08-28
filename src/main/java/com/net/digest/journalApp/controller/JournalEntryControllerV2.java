package com.net.digest.journalApp.controller;

import com.net.digest.journalApp.entity.JournalEntrey;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntreyControllerv2 {

    @GetMapping
    public List<JournalEntrey> getAll(){
        return null;

    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntrey entry)
    {

        return true;
    }
@GetMapping("id/{myId}")
    public JournalEntrey getJournalEntryById(@PathVariable long myId){
        return null;

    }
    @DeleteMapping("id/{myId}")
    public JournalEntrey deleteJournalEntryById(@PathVariable long myId){
        return null;

    }
    @PutMapping("/id/{id}")
    public JournalEntrey updateJournalEntryById(@PathVariable long id, @RequestBody JournalEntrey entry){
        return null;

    }

}


