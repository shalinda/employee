package com.ge.predix.emp.web;

import com.ge.predix.emp.domain.CarhireEvent;
import com.ge.predix.emp.repo.CarhireEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

/**
 * Created by shalindaranasinghe on 3/8/17.
 */
@RestController
@RequestMapping(path = "/carhireEvents/findById/{id}")
public class CarhireEventController {

    CarhireEventRepository carhireEventRepository;

    @Autowired
    public CarhireEventController(CarhireEventRepository carhireEventRepository) {
        this.carhireEventRepository = carhireEventRepository;
    }

    protected CarhireEventController() {
    }

    @RequestMapping(method = RequestMethod.GET)
    public CarhireEvent getCarhireEvent(@PathVariable(value = "id") int id, Pageable pageable) {
        CarhireEvent event = carhireEventRepository.findOne(id);
        if (event == null)
            throw new NoSuchElementException("Carhire Event does not exist " + id);
        return event;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoSuchElementException.class)
    public String return400(NoSuchElementException ex) {
        return ex.getMessage();

    }
}
