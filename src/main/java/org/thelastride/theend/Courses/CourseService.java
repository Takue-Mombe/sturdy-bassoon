package org.thelastride.theend.Courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    //CRUDs

    //Create
    public CourseModel saveCourse(CourseModel courseModel){
        return courseRepository.save(courseModel);
    }
    //Read
    public List<CourseModel> getAll(){
        return courseRepository.findAll();
    }
    //Read by ID
    Optional<CourseModel> findbyID(String courseID){
        return courseRepository.findByCourseId(courseID);
    }
    //Delete
    public void delete(String courseID){
        courseRepository.deleteById(courseID);
    }

}
