package org.thelastride.theend.Courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/courseApi")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/save")
    public String saveCourse(@RequestBody CourseModel courseModel){
        courseService.saveCourse(courseModel);
        return "table";
    }
    @GetMapping("/getAll")
    public String getAll(Model model){
        List<CourseModel>courses=     courseService.getAll();
        model.addAttribute("courses",courses);
        return "table";
    }
   @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable String id){
        courseService.delete(id);
        return "<div>Deleted</div>";
   }

}
