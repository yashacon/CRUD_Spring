package com.example.learnAppData.demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

//    private List<Course> topics= new ArrayList<>(Arrays.asList(new Course("Spring","Spring Framework","Spring Framework Description"),
//                                                new Course("Java","Core Java","Core Java Description"),
//                                                new Course("Javascript","Javascript","Javascript Description")));
    public List<Topic> getAllTopics(){
        List<Topic> topics=new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
//        return topics;
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(id).get();
//        return topics.stream().filter(t->t.getId().equals(id)).findAny().get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
//        topics.add(topic);
    }

    public void updateTopic( /*Not needed anymore*/ String id, Topic topic) {
//        for(int i=0;i<topics.size();i++){
//            Course t=topics.get(i);
//            if(t.getId().equals(id)){
//                topics.set(i,topic);
//                break;
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
//        topics.removeIf(t->t.getId().equals(id));
    }
}
