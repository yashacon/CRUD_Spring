package com.example.learnAppData.demo.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
    //already has crud methods
}
