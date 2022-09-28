package com.hosto.intranet.service;

import java.util.List;

import com.hosto.intranet.entity.Requisicion;

public interface IRequisicionService {

    
	public void guardarRequisicion(Requisicion requisicion);
	public Requisicion buscarPorId(Long  id);
	public void eliminar(Long id);
	List<Requisicion> searchFiltroService(String filtro);

	
    
}
