package com.net.digest.journalApp.controller;

import com.net.digest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map< Long,JournalEntry> journalEntries= new HashMap<>();
    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());

    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry entry)
    {
        journalEntries.put(entry.getId(), entry);
        return true;
    }
@GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable long myId){
        return journalEntries.get(myId);

    }
    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable long myId){
        return journalEntries.remove(myId);

    }
    @PutMapping("/id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable long id,@RequestBody JournalEntry entry){
        return journalEntries.put(id, entry);

    }

}


