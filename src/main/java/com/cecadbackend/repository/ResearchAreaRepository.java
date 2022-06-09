package com.cecadbackend.repository;

import com.cecadbackend.model.ResearchArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResearchAreaRepository extends JpaRepository<ResearchArea, Long> {
    ResearchArea findResearchAreaById(Long id);
    ResearchArea findResearchAreaByName(String name);
    void deleteResearchAreaById(Long id);
    void deleteResearchAreaByName(String name);
}
