package com.hosto.intranet.service;

import java.util.List;

import com.hosto.intranet.entity.Area;

public interface IAreaService {

    public List<Area> listarAreas();
    public void guardarArea(Area area);
    public Area buscarPorId(Integer id);
  
}
