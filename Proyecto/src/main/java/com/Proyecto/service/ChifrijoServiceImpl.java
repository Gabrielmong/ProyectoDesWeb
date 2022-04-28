package com.Proyecto.service;

import com.Proyecto.dao.ChicharroneraDao;
import com.Proyecto.domain.Chicharronera;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ChifrijoServiceImpl implements ChicharroneraService{
    
    @Autowired
    private ChicharroneraDao chicharroneraDao;

    @Override
    @Transactional(readOnly = true)
    public List<Chicharronera> getChicharronera() {
        return (List<Chicharronera>) chicharroneraDao.findAll();
    }

    @Override
    @Transactional
    public void save(Chicharronera chicharronera) {
        chicharroneraDao.save(chicharronera);
    }

    @Override
    public void delete(Chicharronera chicharronera) {
        chicharroneraDao.delete(chicharronera);
    }
    
}
