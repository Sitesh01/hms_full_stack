package com.siteshkumar.hms_backend.Mapper;

import com.siteshkumar.hms_backend.Entity.AppointmentEntity;
import com.siteshkumar.hms_backend.Model.AppointmentModel;

public class AppointmentMapper {
    
    public static AppointmentEntity modelToEntity(AppointmentModel model) {
        if (model == null)
            return null;

        return new AppointmentEntity(
            model.getId(),
            model.getName(),
            model.getAge(),
            model.getSymptoms(),
            model.getTokenNumber()
        );
    }

    public static AppointmentModel entityToModel(AppointmentEntity entity) {
        if (entity == null)
            return null;

        return new AppointmentModel(
            entity.getId(),
            entity.getName(),
            entity.getAge(),
            entity.getSymptoms(),
            entity.getTokenNumber()
        );
    }
}

