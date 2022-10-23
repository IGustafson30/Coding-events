package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        List<String> events = new ArrayList<>();
        events.add("Move Avery In");
        events.add("Unpack Boxes");
        events.add("Celebrate");
        events.add("Buy Ferrets");
        model.addAttribute("events", events);
        return "events/index";
    }

    // this method lives at localhost:8080/events/create
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }

}
