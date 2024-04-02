package org.thelastride.theend.Counters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adminApi")
public class CounterController {

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
}
