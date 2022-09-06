package com.hosto.intranet.service;

import java.util.List;

import com.hosto.intranet.entity.Empresa;

public interface IEmpresaService {

    public List<Empresa> listarEmpresas();
    public void guardarEmpresa(Empresa empresa);
    public Empresa buscarPorId(Integer id);
	
    
}
