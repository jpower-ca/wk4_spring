package com.jp.week4.rest;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/medicines") // base url that returns all medicines
public class MedicineRestController {

    private final MedicineInterface medicineService;

    public MedicineRestController(MedicineInterface medicineService) {
        this.medicineService = medicineService;
    }

    // 1. GET all medicines /api/medicines
    @GetMapping
    public List<Medicine> getAll() {
        return medicineService.findAllMedicines();
    }

    // 2. GET medicines by id  /api/medicines/id#
    @GetMapping("/{id}")
    public Medicine getById(@PathVariable int id) {
        return medicineService.findMedicineById(id);
    }

    // 3. POST the new medicine to /api/medicines
    @PostMapping
    public void addMedicine(@RequestBody Medicine newMedicine) {
        medicineService.add(newMedicine);
    }

    // 4. PUT to update medicines /api/medicines/id#
    @PutMapping("/{id}")
    public void updateMedicine(@PathVariable int id, @RequestBody Medicine updatedMed) {
        medicineService.update(id, updatedMed);
    }
}