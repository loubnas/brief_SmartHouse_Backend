package com.example.brief_smart_house_backend.services.DeviceService;

import com.example.brief_smart_house_backend.entities.Device;
import com.example.brief_smart_house_backend.entities.Floor;
import com.example.brief_smart_house_backend.repository.DeviceRepository;
import com.example.brief_smart_house_backend.services.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService implements IDeviceService {

    @Autowired
    DeviceRepository deviceRepository;

    @Autowired
    SequenceGeneratorService sequenceGenerator;


    @Override
    public List<Device> getAll() {
        List<Device> devices = deviceRepository.findAll();
        return devices;
    }

    @Override
    public Device AddDevie(Device device) {
        device.setId(sequenceGenerator.generateSequence(Device.SEQUENCE_NAME));
        Device dfr= deviceRepository.save(device);
        return dfr;
    }

    @Override
    public Device UpdateDevice(Device device) {
        Device dv = deviceRepository.save(device);
        return dv;
    }

    @Override
    public boolean deleteDevice(long id) {
        try {
            deviceRepository.deleteById(id);
        }catch (Exception ex){
            return false;
        }
        return true;
    }


}
