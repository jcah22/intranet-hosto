package com.hosto.intranet.service;

import java.util.List;

import com.hosto.intranet.entity.Directivo;

public interface IDirectivoService {

    public List<Directivo> listarDirectivos();
    public void guardarDirectivo(Directivo directivo);
    public Directivo buscarPorId(Integer id);
   
    
}
