package com.hosto.intranet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosto.intranet.entity.Status;
import com.hosto.intranet.repository.StatusRepository;
import com.hosto.intranet.service.IStatusService;

@Service
public class StatusServiceImpl implements IStatusService {

    @Autowired
    private StatusRepository  statusRepository;

    @Override
    public List<Status> listarStatus() {
      
        return statusRepository.findAll();
    }

    @Override
    public void guardarStatus(Status status) {
        
        statusRepository.save(status);
        
    }

    @Override
    public Status buscarPorId(Integer id) {
        
        return statusRepository.findById(id).orElse(null);
    }

    

   
    
}
