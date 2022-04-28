package com.Proyecto.service;

import com.Proyecto.dao.ArrozConLecheDao;
import com.Proyecto.domain.ArrozConLeche;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArrozConLecheServiceImpl implements ArrozConLecheService{
    
    @Autowired
    private ArrozConLecheDao arrozConLecheDao;

    @Override
    @Transactional(readOnly = true)
    public List<ArrozConLeche> getArrozConLeche() {
        return (List<ArrozConLeche>) arrozConLecheDao.findAll();
    }

    @Override
    @Transactional
    public void save(ArrozConLeche arrozConLeche) {
        arrozConLecheDao.save(arrozConLeche);
    }

    @Override
    public void delete(ArrozConLeche arrozConLeche) {
        arrozConLecheDao.delete(arrozConLeche);
    }

    @Override
    public ArrozConLeche getArrozConLeche(ArrozConLeche arrozConLeche) {
        return arrozConLecheDao.findById(arrozConLeche.getId()).orElse(null);
    }
    
}
