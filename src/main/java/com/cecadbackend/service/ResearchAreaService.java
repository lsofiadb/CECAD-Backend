package com.cecadbackend.service;

import com.cecadbackend.model.ResearchArea;
import com.cecadbackend.repository.ResearchAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResearchAreaService {

    @Autowired
    ResearchAreaRepository researchAreaRepository;

    public ResearchArea save(ResearchArea researchArea){
        return researchAreaRepository.save(researchArea);
    }

    public ResearchArea update(ResearchArea researchArea){
        return save(researchArea);
    }

    public ResearchArea findById(Long id){
        return researchAreaRepository.findResearchAreaById(id);
    }

    public ResearchArea findByName(String name){
        return  researchAreaRepository.findResearchAreaByName(name);
    }

    public void deleteById(Long id){
        researchAreaRepository.deleteResearchAreaById(id);
    }

    public void deleteByName(String name){
        researchAreaRepository.deleteResearchAreaByName(name);
    }
}
