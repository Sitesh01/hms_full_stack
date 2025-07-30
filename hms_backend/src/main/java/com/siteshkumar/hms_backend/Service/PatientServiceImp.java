package com.siteshkumar.hms_backend.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.siteshkumar.hms_backend.Entity.PatientEntity;
import com.siteshkumar.hms_backend.Mapper.PatientMapper;
import com.siteshkumar.hms_backend.Model.PatientModel;
import com.siteshkumar.hms_backend.Repository.PatientRepository;

@Service
public class PatientServiceImp implements PatientService{

    private final PatientRepository patRepo;

    public PatientServiceImp(PatientRepository patRepo){
        this.patRepo = patRepo;
    }

    @Override
    public List<PatientModel> getAllPatients(){
        List<PatientEntity> resultEntity = patRepo.findAll();
        
        List<PatientModel> resultModel = new ArrayList<>();
        for(PatientEntity pe : resultEntity){
            PatientModel currPatientModel = PatientMapper.entityToModel(pe);
            resultModel.add(currPatientModel);
        }
        return resultModel;
    }

    @Override
    public boolean createPatient(PatientModel patientModel){
        PatientEntity patientEntity = PatientMapper.modelToEntity(patientModel);
        PatientEntity savedEntity = patRepo.save(patientEntity);
        return savedEntity != null && savedEntity.getId() != null;
    }
}
