package com.ge.predix.emp.service;

import com.ge.predix.emp.domain.CarhireEvent;
import com.ge.predix.emp.repo.CarhireEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by shalindaranasinghe on 2/21/17.
 */
@Service
public class CarhireEventService {

    private CarhireEventRepository carhireEventRepository;

    @Autowired
    public CarhireEventService(CarhireEventRepository carhireEventRepository) {
        this.carhireEventRepository = carhireEventRepository;
    }

    public CarhireEvent createCarhireEvent(String equipInitial, Integer equipNum, Date eventDateTime, String evntType) {

        return carhireEventRepository.save(new CarhireEvent(equipInitial, equipNum, eventDateTime, evntType));
    }
}
