package com.hosto.intranet.service;

import java.util.List;

import com.hosto.intranet.entity.Odc;

public interface IOdcService {
    
    public List<Odc> listarOrdenes();
    public void guardarEmpresa(Odc odc);
    public Odc buscarPorId(Integer id);
	
}
