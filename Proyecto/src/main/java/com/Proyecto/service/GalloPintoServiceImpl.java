package com.Proyecto.service;

import com.Proyecto.dao.GalloPintoDao;
import com.Proyecto.domain.GalloPinto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GalloPintoServiceImpl implements GalloPintoService{
    
    @Autowired
    private GalloPintoDao galloPintoDao;

    @Override
    @Transactional(readOnly = true)
    public List<GalloPinto> getGalloPinto() {
        return (List<GalloPinto>) galloPintoDao.findAll();
    }

    @Override
    @Transactional
    public void save(GalloPinto galloPinto) {
        galloPintoDao.save(galloPinto);
    }

    @Override
    public void delete(GalloPinto galloPinto) {
        galloPintoDao.delete(galloPinto);
    }
    
    @Override
    public GalloPinto getGalloPinto(GalloPinto galloPinto) {
        return galloPintoDao.findById(galloPinto.getId()).orElse(null);
    }
    
    
}