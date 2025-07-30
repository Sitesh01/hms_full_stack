package com.siteshkumar.hms_backend.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.siteshkumar.hms_backend.Entity.AppointmentEntity;
import com.siteshkumar.hms_backend.Mapper.AppointmentMapper;
import com.siteshkumar.hms_backend.Model.AppointmentModel;
import com.siteshkumar.hms_backend.Repository.AppointmentRepository;

@Service
public class AppointmentServiceImp implements AppointmentService{
    
    private final AppointmentRepository appointmentRepository;

    public AppointmentServiceImp(AppointmentRepository appointmentRepository){
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<AppointmentModel> getAllAppointments(){
        List<AppointmentEntity> appointmentEntity = appointmentRepository.findAll();

        List<AppointmentModel> resultModel = new ArrayList<>();
        for(AppointmentEntity ae : appointmentEntity){
            AppointmentModel am = AppointmentMapper.entityToModel(ae);
            resultModel.add(am);
        }
        return resultModel;
    }

    @Override
    public boolean createAppointments(AppointmentModel appointmentModel){
        AppointmentEntity appointmentEntity = AppointmentMapper.modelToEntity(appointmentModel);
        AppointmentEntity savedEntity = appointmentRepository.save(appointmentEntity);
        return savedEntity != null && savedEntity.getId() != null;
    }
}
