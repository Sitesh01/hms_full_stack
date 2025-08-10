package com.siteshkumar.hms_backend.Controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.siteshkumar.hms_backend.Model.PatientModel;
import com.siteshkumar.hms_backend.Service.PatientService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {
    
    private final PatientService patientService;

    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }

    @GetMapping("/patients")
    public List<PatientModel> getAllPatients(){
        return patientService.getAllPatients();
    }

    @PostMapping("/patients")
    public ResponseEntity<String> createPatient(@RequestBody PatientModel patientModel){
        boolean success = patientService.createPatient(patientModel);
        if(success)
            return ResponseEntity.status(HttpStatus.CREATED).body("Patient created successfully!");
        else
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Patient not created!");
    }
}
