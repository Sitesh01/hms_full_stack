package com.siteshkumar.hms_backend.Controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.siteshkumar.hms_backend.Model.MedicineModel;
import com.siteshkumar.hms_backend.Service.MedicineService;

@RestController
@RequestMapping("/api/v1")
public class MedicineController {
    
    private final MedicineService medicineService;

    public MedicineController(MedicineService medicineService){
        this.medicineService = medicineService;
    }

    @GetMapping("/medicines")
    public List<MedicineModel> getAllMedicine(){
        return medicineService.getAllMedicine();
    }

    @PostMapping("/medicines")
    public ResponseEntity<String> createMedicine(@RequestBody MedicineModel medicineModel){
        boolean success = medicineService.createMedicine(medicineModel);
        if(success)
            return ResponseEntity.status(HttpStatus.CREATED).body("Medicine created successfully!");
        else
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Medicine not created!");
    }
}
