package com.Proyecto.service;

import com.Proyecto.domain.GalloPinto;
import java.util.List;

public interface GalloPintoService {
    public List<GalloPinto> getGalloPinto();
    
    public void save(GalloPinto GalloPinto);
    
    public void delete(GalloPinto GalloPinto);
    
}
