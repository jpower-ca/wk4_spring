package com.jp.week4.rest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AdmissionServiceImpl implements AdmissionInterface {

    private final List<Admission> admissions = new ArrayList<>();


    public AdmissionServiceImpl() {
        
        admissions.add(new Admission(1, "2026-02-02", "Jack Johnson", "Leg fell off"));
    }

    @Override
    public List<Admission> findAllAdmissions() { 
        return admissions;
    }

    @Override
    public Admission findAdmissionById(int id) { 
        return admissions.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(Admission admission) {
        admissions.add(admission);
    }
    
    @Override
    public void update(int id, Admission updatedAdmission) {
        for (int i = 0; i < admissions.size(); i++) {
            if (admissions.get(i).getId() == id) {
                admissions.set(i, updatedAdmission);
                return;
            }
        }
    }
}