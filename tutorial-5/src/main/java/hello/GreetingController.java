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
        cv.append("Name: Ahmad Satryaji Aulia\n");
        cv.append("Birthdate: 01/07/1998\n");
        cv.append("Birthplace: Samarinda\n");
        cv.append("Address: Jl. Taman Cilandak 1 No. D9\n");
        cv.append("Education History:\n");
        cv.append("- SMP Al Izhar 2010-2013\n");
        cv.append("- SMA Al Izhar 2013-2016\n");
        cv.append("- Faculty of Computer Science 2016-Present\n");
        model.addAttribute("cv", cv.toString());

        StringBuilder description = new StringBuilder();
        description.append("I am a second-year CS student at Universitas Indonesia. ");
        description.append("Previously, I've interned at GO-JEK software engineering. ");
        description.append("Currently, I'm teaching assistant at UI. ");
        description.append("Interests include cryptocurrency, music and writing.");
        model.addAttribute("description", description.toString());

        return "greeting";
    }

}
