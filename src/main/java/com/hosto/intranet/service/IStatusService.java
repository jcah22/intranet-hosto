package com.hosto.intranet.service;

import java.util.List;

import com.hosto.intranet.entity.Status;

public interface IStatusService {

    public List<Status> listarStatus();
    public void guardarStatus(Status status);
    public Status buscarPorId(Integer id);
	
    
}
