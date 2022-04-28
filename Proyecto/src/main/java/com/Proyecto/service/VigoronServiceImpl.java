package com.Proyecto.service;

import com.Proyecto.dao.VigoronDao;
import com.Proyecto.domain.Vigoron;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VigoronServiceImpl implements VigoronService{
    
    @Autowired
    private VigoronDao vigoronDao;

    @Override
    @Transactional(readOnly = true)
    public List<Vigoron> getVigoron() {
        return (List<Vigoron>) vigoronDao.findAll();
    }

    @Override
    @Transactional
    public void save(Vigoron vigoron) {
        vigoronDao.save(vigoron);
    }

    @Override
    public void delete(Vigoron vigoron) {
        vigoronDao.delete(vigoron);
    }
    
}