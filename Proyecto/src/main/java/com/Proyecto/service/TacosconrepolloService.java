package com.Proyecto.service;

import com.Proyecto.domain.Tacosconrepollo;
import java.util.List;

public interface TacosconrepolloService {
    public List<Tacosconrepollo> getTacosconrepollo();
    
    public void save(Tacosconrepollo tacosconrepollo);
    
    public void delete(Tacosconrepollo tacosconrepollo);
}
