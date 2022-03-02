package com.example.learnAppData.demo.course;

import com.example.learnAppData.demo.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

    @Id
    private String id;
    private String description;
    private String name;

    @ManyToOne
    private Topic topic;



    public Course(){

    }
    public Course(String id, String description, String name,String topicId) {
        super();
        this.id = id;
        this.description = description;
        this.name = name;
        this.topic=new Topic(topicId,"","");
    }
    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
