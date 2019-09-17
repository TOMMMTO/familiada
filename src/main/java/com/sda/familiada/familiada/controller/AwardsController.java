package com.sda.familiada.familiada.controller;

import com.sda.familiada.familiada.service.AwardsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AwardsController {


   private final AwardsService awardsService;

   public AwardsController(AwardsService awardsService) {
        this.awardsService = awardsService;
    }

    @GetMapping("/awardFirstPlace")
    public ModelAndView showAwardFirstPlace() {
        return new ModelAndView ("awardFirstPlace");
    }
    @GetMapping("/firstPlace")
    public ModelAndView showFirstPlaceAwards() {
        return new ModelAndView ("firstPlace");
    }
    @GetMapping("/awardSecondPlace")
    public ModelAndView showAwardSecondPlace() {
        return new ModelAndView ("awardSecondPlace");
    }
    @GetMapping("/secondPlace")
    public ModelAndView showSecondPlaceAwards() {
        return new ModelAndView ("secondPlace");
    }
    @GetMapping("/awardThirdPlace")
    public ModelAndView showAwardThirdPlace() {
        return new ModelAndView ("awardThirdPlace");
    }
    @GetMapping("/thirdPlace")
    public ModelAndView showThirdPlaceAwards() {
        return new ModelAndView ("thirdPlace");
    }
    @GetMapping("/awardAnotherPlace")
    public ModelAndView showAwardAnotherPlace() {
        return new ModelAndView ("awardAnotherPlace");
    }
    @GetMapping("/anotherPlace")
    public ModelAndView showAnotherPlaceAwards() {
        return new ModelAndView ("anotherPlace");
    }


}
