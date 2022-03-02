package com.example.learnAppData.demo.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

//    private List<Course> topics= new ArrayList<>(Arrays.asList(new Course("Spring","Spring Framework","Spring Framework Description"),
//                                                new Course("Java","Core Java","Core Java Description"),
//                                                new Course("Javascript","Javascript","Javascript Description")));
    public List<Course> getAllCourses(String id){
        List<Course> courses =new ArrayList<>();
        courseRepository.findByTopicId(id).forEach(courses::add);
        return courses;
//        return courses;
    }

    public Course getCourse(String id) {
        return courseRepository.findById(id).get();
//        return topics.stream().filter(t->t.getId().equals(id)).findAny().get();
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
//        topics.add(course);
    }

    public void updateCourse( /*Not needed anymore*/ String id, Course course) {
//        for(int i=0;i<topics.size();i++){
//            Course t=topics.get(i);
//            if(t.getId().equals(id)){
//                topics.set(i,course);
//                break;
//            }
//        }
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
//        topics.removeIf(t->t.getId().equals(id));
    }
}
