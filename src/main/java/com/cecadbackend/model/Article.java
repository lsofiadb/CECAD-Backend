package com.cecadbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "article")
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    @Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "urlImage")
    private String urlImage;
    @Column(name = "description")
    private String description;
    @ManyToOne @JoinColumn(name = "research_id")
    private ResearchArea researchArea;

}
