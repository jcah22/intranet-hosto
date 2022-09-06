package com.hosto.intranet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosto.intranet.entity.Usuario;
import com.hosto.intranet.repository.UsuarioRepository;
import com.hosto.intranet.service.IUsuarioService;

@Service
public class UsuarioServiceImpl  implements IUsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> listarUsuarios() {
        
        return usuarioRepository.findAll();
    }

    @Override
    public void guardarusuario(Usuario usuario) {
        usuarioRepository.save(usuario);
        
    }

    @Override
    public Usuario buscarPorId(Integer id) {
        
        return usuarioRepository.findById(id).orElse(null);
    }



    
    
}
