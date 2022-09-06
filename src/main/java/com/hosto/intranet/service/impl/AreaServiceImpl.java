package com.hosto.intranet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosto.intranet.entity.Area;
import com.hosto.intranet.repository.AreaRepository;
import com.hosto.intranet.service.IAreaService;

@Service
public class AreaServiceImpl implements IAreaService {

    @Autowired
    private AreaRepository areaRepository;

    @Override
    public List<Area> listarAreas() {
        
        return (List<Area>)areaRepository.findAll(); 
    }

    @Override
    public void guardarArea(Area area) {
       
        areaRepository.save(area);
    }

    @Override
    public Area buscarPorId(Integer id) {
      
        return areaRepository.findById(id).orElse(null);
    }

    
    
}
