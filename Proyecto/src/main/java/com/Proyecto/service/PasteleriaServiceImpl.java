package com.Proyecto.service;

import com.Proyecto.dao.PasteleriaDao;
import com.Proyecto.domain.Pasteleria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PasteleriaServiceImpl implements PasteleriaService{
    
    @Autowired
    private PasteleriaDao PasteleriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Pasteleria> getPasteleria() {
        return (List<Pasteleria>) PasteleriaDao.findAll();
    }

    @Override
    @Transactional
    public void save(Pasteleria Pasteleria) {
        PasteleriaDao.save(Pasteleria);
    }

    @Override
    public void delete(Pasteleria Pasteleria) {
        PasteleriaDao.delete(Pasteleria);
    }
    
    
}