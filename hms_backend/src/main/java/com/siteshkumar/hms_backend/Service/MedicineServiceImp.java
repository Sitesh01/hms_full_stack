package com.siteshkumar.hms_backend.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.siteshkumar.hms_backend.Entity.MedicineEntity;
import com.siteshkumar.hms_backend.Mapper.MedicineMapper;
import com.siteshkumar.hms_backend.Model.MedicineModel;
import com.siteshkumar.hms_backend.Repository.MedicineRepository;

@Service
public class MedicineServiceImp implements MedicineService{
    
    private final MedicineRepository medicineRepository;

    public MedicineServiceImp(MedicineRepository medicineRepository){
        this.medicineRepository = medicineRepository;
    }

    @Override
    public List<MedicineModel> getAllMedicine(){
        List<MedicineEntity> medicineEntity = medicineRepository.findAll();

        List<MedicineModel> resultModel = new ArrayList<>();
        for(MedicineEntity me : medicineEntity){
            MedicineModel md = MedicineMapper.entityToModel(me);
            resultModel.add(md);
        }
        return resultModel;
    }

    @Override
    public boolean createMedicine(MedicineModel medicineModel){
        MedicineEntity medicineEntity = MedicineMapper.modelToEntity(medicineModel);
        MedicineEntity savedEntity = medicineRepository.save(medicineEntity);
        return savedEntity != null && savedEntity.getId() != null;
    }
}
