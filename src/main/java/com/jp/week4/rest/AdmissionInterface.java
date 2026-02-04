package com.jp.week4.rest;

import java.util.List;

public interface AdmissionInterface {

    List<Admission> findAllAdmissions();

    Admission findAdmissionById(int id);

    void add(Admission admission);

    void update(int id, Admission updatedAdmission);
}