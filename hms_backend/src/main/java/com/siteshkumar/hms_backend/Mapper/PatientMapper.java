package com.siteshkumar.hms_backend.Mapper;

import com.siteshkumar.hms_backend.Entity.PatientEntity;
import com.siteshkumar.hms_backend.Model.PatientModel;

public class PatientMapper {
    public static PatientEntity modelToEntity(PatientModel model){
        if(model == null)
            return null;

        return new PatientEntity(
            model.getId(),
            model.getFullName(),
            model.getAge(),
            model.getBloodGroup(),
            model.getPrescription(),
            model.getDose(),
            model.getFees(),
            model.getUrgency()
        );
    }

    public static PatientModel entityToModel(PatientEntity entity){
        if(entity == null)
            return null;

        return new PatientModel(
            entity.getId(),
            entity.getFullName(),
            entity.getAge(),
            entity.getBloodGroup(),
            entity.getPrescription(),
            entity.getDose(),
            entity.getFees(),
            entity.getUrgency()
        );
    }
}
