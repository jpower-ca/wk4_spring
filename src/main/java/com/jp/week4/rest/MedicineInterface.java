package com.jp.week4.rest;
import java.util.List;

public interface MedicineInterface {

	List<Medicine> findAllMedicines();
	Medicine findMedicineById (int id);
    void add(Medicine newMedicine);
    void update(int id, Medicine updateMed);
}
