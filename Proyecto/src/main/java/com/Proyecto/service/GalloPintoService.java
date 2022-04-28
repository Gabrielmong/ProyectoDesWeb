package com.Proyecto.service;

import com.Proyecto.domain.GalloPinto;
import java.util.List;

public interface GalloPintoService {
    public List<GalloPinto> getGalloPinto();
    
    public void save(GalloPinto galloPinto);
    
    public void delete(GalloPinto galloPinto);
    
    public GalloPinto getGalloPinto(GalloPinto galloPinto);
}
