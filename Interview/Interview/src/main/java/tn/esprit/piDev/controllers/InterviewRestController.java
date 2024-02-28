package tn.esprit.piDev.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.piDev.entities.Interview;
import tn.esprit.piDev.services.IInterviewService;
import tn.esprit.piDev.services.InterviewService;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/interview")
public class InterviewRestController {
    @Autowired
    InterviewService interviewService;


    @GetMapping("/retrieve-all-interviews")
    public List<Interview> getInterviews() {
        List<Interview> listInterviews = interviewService.retrieveAllInterviews() ;
        return listInterviews ;
    }

    @PostMapping("/add-interview")
    public Interview  addInterview(@RequestBody Interview i) {
        Interview interview=interviewService.addInterview(i) ;
        return interview ;
    }

    @DeleteMapping("/remove-interview/{idInterview}")
    public void removeInterview(@PathVariable("idInterview") long idInterview) {
        interviewService.removeInterview(idInterview);
    }

    @PutMapping("/modify-interview")
    public Interview modifyInterview(@RequestBody Interview i) {
        Interview interview=interviewService.modifyInterview(i) ;
        return interview;
    }


}
