package com.siteshkumar.hms_backend.Mapper;

import com.siteshkumar.hms_backend.Entity.MedicineEntity;
import com.siteshkumar.hms_backend.Model.MedicineModel;

public class MedicineMapper {
    
    public static MedicineEntity modelToEntity(MedicineModel model) {
        if (model == null)
            return null;

        return new MedicineEntity(
            model.getId(),
            model.getDrugName(),
            model.getStock()
        );
    }

    public static MedicineModel entityToModel(MedicineEntity entity) {
        if (entity == null)
            return null;

        return new MedicineModel(
            entity.getId(),
            entity.getDrugName(),
            entity.getStock()
        );
    }
}
