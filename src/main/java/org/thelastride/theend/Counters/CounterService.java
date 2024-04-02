package org.thelastride.theend.Counters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thelastride.theend.Courses.CourseRepository;
import org.thelastride.theend.Lecturers.LecturerRepo;
import org.thelastride.theend.Lecturers.LecturerService;
import org.thelastride.theend.Programmes.ProgrammeRepo;
import org.thelastride.theend.Programmes.ProgrammeService;
import org.thelastride.theend.Students.StudentRepo;
import org.thelastride.theend.Students.StudentService;

@Service
public class CounterService {

    @Autowired
    private ProgrammeRepo programmeRepo;
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private LecturerRepo lecturerRepo;
    @Autowired
    private CourseRepository courseRepository;

    public Long programmeCounter(){
        return programmeRepo.count();
    }
    public Long studentCounter(){
        return studentRepo.count();
    }
    public Long lecturerCounter(){
        return lecturerRepo.count();
    }
    public Long courseCounter(){
        return courseRepository.count();
    }
}
