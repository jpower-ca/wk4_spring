package com.jp.week4.rest;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admissions") // returns all admissions
public class AdmissionRestController {

    private final AdmissionInterface admissionService;

    
    public AdmissionRestController(AdmissionInterface admissionService) {
        this.admissionService = admissionService;
    }

    // GET all admissions /api/admissions
    @GetMapping
    public List<Admission> getAllAdmissions() {
        return admissionService.findAllAdmissions();
    }

    // GET by id /api/admissions/id#
    @GetMapping("/{id}")
    public Admission getAdmissionById(@PathVariable int id) {
        return admissionService.findAdmissionById(id);
    }

    // POST create a new admission   /api/admissions
    @PostMapping
    public void createAdmission(@RequestBody Admission newAdmission) {
        admissionService.add(newAdmission);
    }

    // PUT Update existing admission by id# /api/admissions/id# 
    @PutMapping("/{id}")
    public void updateAdmission(@PathVariable int id, @RequestBody Admission updatedAdmission) {
        admissionService.update(id, updatedAdmission);
    }
}