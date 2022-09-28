package com.hosto.intranet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hosto.intranet.entity.Requisicion;
import com.hosto.intranet.repository.RequsicionRepository;
import com.hosto.intranet.service.IRequisicionService;

@Service
public class RequisicionServiceImpl implements IRequisicionService{


    @Autowired
    private RequsicionRepository reqRepository;

    @Override
    public void guardarRequisicion(Requisicion requisicion) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Requisicion buscarPorId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminar(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Requisicion> searchFiltroService(String filtro) {
        
        return reqRepository.searchFiltroRepository(filtro);
    }

   

    


   

  

   

    

   



   

    

    

   
    
}
