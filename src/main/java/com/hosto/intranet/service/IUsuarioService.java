package com.hosto.intranet.service;

import java.util.List;

import com.hosto.intranet.entity.Usuario;

public interface IUsuarioService {

    public List<Usuario> listarUsuarios();
    public void guardarusuario(Usuario usuario);
    public Usuario buscarPorId(Integer id);
    
   
	
}
