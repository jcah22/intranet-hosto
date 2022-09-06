package com.hosto.intranet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosto.intranet.entity.Empresa;
import com.hosto.intranet.repository.EmpresaRepository;
import com.hosto.intranet.service.IEmpresaService;

@Service
public class EmpresaServiceImpl implements IEmpresaService{

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public List<Empresa> listarEmpresas() {
        
        return empresaRepository.findAll();
    }

    @Override
    public void guardarEmpresa(Empresa empresa) {
        
        empresaRepository.save(empresa);
        
    }

    @Override
    public Empresa buscarPorId(Integer id) {
        
        return empresaRepository.findById(id).orElse(null);
    }

  

   

    
   

  
    
}
