package com.hosto.intranet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosto.intranet.entity.Directivo;
import com.hosto.intranet.repository.DirectivoRepository;
import com.hosto.intranet.service.IDirectivoService;

@Service
public class DirectivoServiceImpl implements IDirectivoService {


    @Autowired
    private DirectivoRepository directivoRepository;

    @Override
    public List<Directivo> listarDirectivos() {
        
        return (List<Directivo>)directivoRepository.findAll(); 
    }

    @Override
    public void guardarDirectivo(Directivo directivo) {
        
        directivoRepository.save(directivo);
    }

    @Override
    public Directivo buscarPorId(Integer id) {
        
        return directivoRepository.findById(id).orElse(null);
    }

   
    
}
