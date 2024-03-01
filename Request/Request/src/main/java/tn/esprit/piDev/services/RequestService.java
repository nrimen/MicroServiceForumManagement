package tn.esprit.piDev.services;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.piDev.entities.Request;
import tn.esprit.piDev.repositories.RequestRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class RequestService implements IRequestService {
    RequestRepository requestRepository;

    public List<Request> retrieveAllRequests() {
        List<Request> listC = requestRepository.findAll();
        log.info("nombre total des requests : " + listC.size());
        for (Request r: listC) {
            log.info("request : " + r);
        }
        return listC;
    }

    public Request retrieveRequest(Long requestId) {
        Request r = requestRepository.findById(requestId).get();
        return r;
    }

    public Request addRequest(Request r) {
        Request request = requestRepository.save(r);
        return request;
    }

    public Request modifyRequest(Request request) {
        Request r = requestRepository.save(request);
        return r;
    }

    public void removeRequest(Long requestId) {
        requestRepository.deleteById(requestId);
    }

}
