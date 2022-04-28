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
    private GalloPintoDao GalloPintoDao;

    @Override
    @Transactional(readOnly = true)
    public List<GalloPinto> getGalloPinto() {
        return (List<GalloPinto>) GalloPintoDao.findAll();
    }

    @Override
    @Transactional
    public void save(GalloPinto GalloPinto) {
        GalloPintoDao.save(GalloPinto);
    }

    @Override
    public void delete(GalloPinto GalloPinto) {
        GalloPintoDao.delete(GalloPinto);
    }
    
    
}