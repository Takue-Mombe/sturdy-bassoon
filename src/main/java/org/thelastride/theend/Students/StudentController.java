package org.thelastride.theend.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/studentApi")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private  StudentCSV studentCSVService;


    @PostMapping("/save")
    public String saveStudent(@ModelAttribute StudentModel studentModel){
        StudentModel createStudent = studentService.saveStudents(studentModel);
        System.out.println("Student Created: " + createStudent.getHitMail());
        return "redirect:/StudentApi/students/all"; // Redirect to the student list page after saving
    }
    @PostMapping("/upload-csv")
    public String saveCSV(@RequestParam("file") MultipartFile file) {
        try {
            studentCSVService.saveDataFromCsv(file);
            System.out.println(studentService.findAll());
            return "saved";
        } catch (IOException e) {
            return "error during upload";
        }
    }
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "deleted...";
    }
    @GetMapping("/students/all")
    public String getAllStudents(Model model) {
        // Retrieve all student data from the database
        List<StudentModel> students = studentService.findAll();

        // Add the list of students to the model
        model.addAttribute("students", students);

        // Return the name of your Thymeleaf template
        return "studentTable";
    }


    @GetMapping("/getById/{hitMail}")
    public Optional<StudentModel> findById(@PathVariable String hitMail){
        return studentService.findByHitMail(hitMail);
    }
}
