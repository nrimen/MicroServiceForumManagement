package tn.esprit.piDev.services;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.piDev.entities.Interview;
import tn.esprit.piDev.repositories.InterviewRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class InterviewService {
    InterviewRepository interviewRepository;

    public List<Interview> retrieveAllInterviews() {
        List<Interview> listC = interviewRepository.findAll();
        log.info("nombre total des interviews : " + listC.size());
        for (Interview c: listC) {
            log.info("interview : " + c);
        }
        return listC;
    }

    public Interview retrieveInterview(Long interviewId) {
        Interview c = interviewRepository.findById(interviewId).get();
        return c;
    }

    public Interview addInterview(Interview c) {
        Interview interview = interviewRepository.save(c);
        return interview;
    }

    public Interview modifyInterview(Interview interview) {
        Interview c = interviewRepository.save(interview);
        return c;
    }

    public void removeInterview(Long interviewId) {
        interviewRepository.deleteById(interviewId);
    }

}
