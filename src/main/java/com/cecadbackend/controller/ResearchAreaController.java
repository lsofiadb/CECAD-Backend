package com.cecadbackend.controller;


import com.cecadbackend.model.ResearchArea;
import com.cecadbackend.service.ResearchAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/researchArea")
public class ResearchAreaController {

    @Autowired
    private ResearchAreaService researchAreaService;

    @PostMapping("/save")
    public ResponseEntity <ResearchArea> save(@RequestBody ResearchArea researchArea){
        return ResponseEntity.ok().body(researchAreaService.save(researchArea));
    }

    @PutMapping("/update")
    public ResponseEntity <ResearchArea> update(@RequestBody ResearchArea researchArea){
        return ResponseEntity.ok().body(researchAreaService.save(researchArea));
    }

    @DeleteMapping("/deleteById/{}")
    public ResponseEntity <String> deleteById(@PathVariable Long id){
        researchAreaService.deleteById(id);
        return ResponseEntity.ok().body("Research area was deleted");
    }

    @DeleteMapping("/deleteByName/{}")
    public ResponseEntity <String> deleteByName(@PathVariable String name){
        researchAreaService.deleteByName(name);
        return ResponseEntity.ok().body("Research area was deleted");
    }

    @GetMapping("/findById")
    public ResponseEntity <ResearchArea> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(researchAreaService.findById(id));
    }

    @GetMapping("/findByName")
    public ResponseEntity <ResearchArea> findByName(@PathVariable String name){
        return ResponseEntity.ok().body(researchAreaService.findByName(name));
    }

}
