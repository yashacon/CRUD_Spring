package com.example.learnAppData.demo.course;

import com.example.learnAppData.demo.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("topic/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return courseService.getAllCourses(id);
    }

    @RequestMapping("/topic/{topicId}/course/{id}")
    public Course getCourse(@PathVariable String id){

        return courseService.getCourse(id);
    }
    @RequestMapping(value = "/topic/{topicId}/course",method = RequestMethod.POST)
    public void addCourse(@PathVariable String topicId,@RequestBody Course course){
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }
    @RequestMapping(value = "/topic/{topicId}/course/{id}",method = RequestMethod.PUT)
    public void updateCourse(@PathVariable String topicId,@RequestBody Course course, @PathVariable String id){
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(id,course);
    }
    @RequestMapping(value = "/topic/{topicId}/course/{id}",method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }
}
