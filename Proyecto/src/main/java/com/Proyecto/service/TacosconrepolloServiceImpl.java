package com.Proyecto.service;

import com.Proyecto.dao.TacosconrepolloDao;
import com.Proyecto.domain.Tacosconrepollo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TacosconrepolloServiceImpl implements TacosconrepolloService{
    
    @Autowired
    private TacosconrepolloDao tacosconrepolloDao;

    @Override
    @Transactional(readOnly = true)
    public List<Tacosconrepollo> getTacosconrepollo() {
        return (List<Tacosconrepollo>) tacosconrepolloDao.findAll();
    }

    @Override
    @Transactional
    public void save(Tacosconrepollo tacosconrepollo) {
        tacosconrepolloDao.save(tacosconrepollo);
    }

    @Override
    public void delete(Tacosconrepollo tacosconrepollo) {
        tacosconrepolloDao.delete(tacosconrepollo);
    }
    
    @Override
    public Tacosconrepollo getTacosconrepollo(Tacosconrepollo tacosconrepollo) {
        return tacosconrepolloDao.findById(tacosconrepollo.getId()).orElse(null);
    }
    
}
