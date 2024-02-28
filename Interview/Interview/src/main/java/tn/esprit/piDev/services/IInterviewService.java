package tn.esprit.piDev.services;

import tn.esprit.piDev.entities.Interview;

import java.util.List;

public interface IInterviewService {
    public List<Interview> retrieveAllInterviews();
    public Interview retrieveInterview(Long interviewId);
    public Interview addInterview(Interview i);
    public void removeInterview(Long interviewId);
    public Interview modifyInterview(Interview interview);

}
