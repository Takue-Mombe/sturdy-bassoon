package org.thelastride.theend.Counters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thelastride.theend.Courses.CourseModel;
import org.thelastride.theend.Courses.CourseService;
import org.thelastride.theend.Lecturers.LecturerModel;
import org.thelastride.theend.Lecturers.LecturerService;
import org.thelastride.theend.Programmes.ProgrammeModel;
import org.thelastride.theend.Programmes.ProgrammeService;
import org.thelastride.theend.Students.StudentModel;
import org.thelastride.theend.Students.StudentService;

import java.util.List;

@Controller
@RequestMapping("/adminApi")
public class CounterController {


    @Autowired
    private CourseService courseService;
    @Autowired
    private LecturerService lecturerService;
    @Autowired
    private ProgrammeService programmeService;
    @Autowired
    private StudentService studentService;
    private final CounterService counterService;


    public CounterController(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping("/home")
    public String display(Model model){
        long studentCount = counterService.studentCounter();
        long lecturerCount=counterService.lecturerCounter();
        long programmeCount=counterService.programmeCounter();
        long courseCount=counterService.courseCounter();

        model.addAttribute("studentCount", studentCount);
        model.addAttribute("lecturerCount", lecturerCount);
        model.addAttribute("programmeCount", programmeCount);
        model.addAttribute("courseCount", courseCount);

        return "index";
    }
    @GetMapping("/LecturerDetails")
    public String showLecturerDetails(Model model) {
        List<LecturerModel> lecturers=lecturerService.getAllLecturers();
        model.addAttribute("lecturers",lecturers);
        return "LecturerDetails";
    }
    @GetMapping("/courseDetails")
    public String showCourseDetails(Model model) {
        List<CourseModel> courses=     courseService.getAll();
        model.addAttribute("courses",courses);
        return "table";
    }
    @GetMapping("/studentDetails")
    public String showstudentDetails(Model model) {
        List<StudentModel> students=     studentService.findAll();
        model.addAttribute("students",students);
        return "StudentTable";
    }
    @GetMapping("/programmeDetails")
    public String showprogrammeDetails(Model model) {
        List<ProgrammeModel> programme=  programmeService.getAllProgrammes();
        model.addAttribute("programme",programme);
        return "StudentTable";
    }


}
