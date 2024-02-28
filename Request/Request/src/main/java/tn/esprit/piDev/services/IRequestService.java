package tn.esprit.piDev.services;

import tn.esprit.piDev.entities.Request;

import java.util.List;

public interface IRequestService {
    public List<Request> retrieveAllRequests();
    public Request retrieveRequest(Long requestId);
    public Request addRequest(Request r);
    public void removeRequest(Long requestId);
    public Request modifyRequest(Request request);

}
