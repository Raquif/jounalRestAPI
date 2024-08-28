package com.net.digest.journalApp.repository;

import com.net.digest.journalApp.entity.JournalEntrey;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntreyRepository extends MongoRepository<JournalEntrey, String> {


}
