package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false)
                                   String name, Model model) {
        if (name == null || name.equals("")) {
            model.addAttribute("title", "This is my CV");
        } else {
            model.addAttribute("title", name + ", I hope you are interested to hire me");
        }

        StringBuilder cv = new StringBuilder();
        cv.append("Name: Mochamad Aulia Akbar Praditomo\n");
        cv.append("Birthdate: 26/03/1999\n");
        cv.append("Birthplace: Jakarta\n");
        cv.append("Address: Jl. Abdul Majid Raya No. 17\n");
        cv.append("Education History:\n");
        cv.append("- SMP Labschool Kebayoran 2010-2013\n");
        cv.append("- SMAN 70 Jakarta 2013-2016\n");
        cv.append("- Faculty of Computer Science 2016-Present\n");
        model.addAttribute("cv", cv.toString());

        StringBuilder description = new StringBuilder();
        description.append("I am a 4th semester Computer Science student at Universitas Indonesia. ");
        description.append("Previously, I've been a teaching assistant at UI for Programming Foundations course. ");
        description.append("Currently, I'm a teaching assistant at UI for Programming Foundations 2 course. ");
        description.append("My hobby is reading books and computer games.");
        model.addAttribute("description", description.toString());

        return "greeting";
    }

}
