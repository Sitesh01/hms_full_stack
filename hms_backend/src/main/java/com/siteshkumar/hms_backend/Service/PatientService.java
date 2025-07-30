package com.siteshkumar.hms_backend.Service;

import java.util.List;
import com.siteshkumar.hms_backend.Model.PatientModel;

public interface PatientService {
    public List<PatientModel> getAllPatients();
    public boolean createPatient(PatientModel patientModel);
}
