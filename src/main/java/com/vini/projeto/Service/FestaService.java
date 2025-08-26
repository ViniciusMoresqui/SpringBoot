package com.vini.projeto.Service;

import com.vini.projeto.Model.FestaModel;
import com.vini.projeto.Repository.FestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestaService {

    @Autowired
    private FestaRepository festaRepository;

    public List<FestaModel>findALL(){
        return festaRepository.findAll();
    }

    public FestaModel criarFesta(FestaModel festaModel){
        return festaRepository.save(festaModel);
    }
}
