package com.hosto.intranet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosto.intranet.entity.Odc;
import com.hosto.intranet.repository.OdcRepository;
import com.hosto.intranet.service.IOdcService;

@Service
public class OdcServiceImpl implements IOdcService{

    @Autowired
    private OdcRepository odcRepository;

    @Override
    public List<Odc> listarOrdenes() {
        
        return odcRepository.findAll();
    }

    @Override
    public void guardarEmpresa(Odc odc) {
       odcRepository.save(odc);
        
    }

    @Override
    public Odc buscarPorId(Integer id) {
        
        return odcRepository.findById(id).orElse(null);
    }


}
