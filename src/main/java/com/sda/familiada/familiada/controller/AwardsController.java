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

    @GetMapping("/award_firstplace")
    public ModelAndView showAwardFirstPlace() {
        return new ModelAndView ("award_firstplace");
    }
    @GetMapping("/firstplace")
    public ModelAndView showFirstPlaceAwards() {
        return new ModelAndView ("firstplace");
    }
    @GetMapping("/award_secondplace")
    public ModelAndView showAwardSecondPlace() {
        return new ModelAndView ("award_secondplace");
    }
    @GetMapping("/secondplace")
    public ModelAndView showSecondPlaceAwards() {
        return new ModelAndView ("secondplace");
    }
    @GetMapping("/award_thirdplace")
    public ModelAndView showAwardThirdPlace() {
        return new ModelAndView ("award_thirdplace");
    }
    @GetMapping("/thirdplace")
    public ModelAndView showThirdPlaceAwards() {
        return new ModelAndView ("thirdplace");
    }
    @GetMapping("/award_anotherplace")
    public ModelAndView showAwardAnotherPlace() {
        return new ModelAndView ("award_anotherplace");
    }
    @GetMapping("/anotherplace")
    public ModelAndView showAnotherPlaceAwards() {
        return new ModelAndView ("anotherplace");
    }


}
