package com.jp.week4.rest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MedicineServiceImpl implements MedicineInterface {

    private final List<Medicine> medicines = new ArrayList<>();

    public MedicineServiceImpl() {
        medicines.add(new Medicine(1, "Advil", "Pain killer", "4", "2026-02-02"));
        medicines.add(new Medicine(2, "Ibuprofen", "Anti-inflammatory", "6.5", "2026-02-02"));
    }

    @Override
    public List<Medicine> findAllMedicines() {
        return medicines;
    }

    @Override
    public Medicine findMedicineById(int id) {
        return medicines.stream()
                .filter(m -> m.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(Medicine newMedicine) {
        // 'medicines' is the list, 'newMedicine' is the object
        medicines.add(newMedicine);
    }

    @Override
    public void update(int id, Medicine updatedMed) {
        for (int i = 0; i < medicines.size(); i++) {
            if (medicines.get(i).getId() == id) {
                medicines.set(i, updatedMed);
                return;
            }
        }
    }
}