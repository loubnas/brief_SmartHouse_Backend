package com.example.brief_smart_house_backend.services.DeviceService;

import com.example.brief_smart_house_backend.entities.Device;

import java.util.List;

public interface IDeviceService {
    Device AddDevie(Device device);
    Device UpdateDevice(Device device);
    boolean deleteDevice(long id);
    List<Device> getAll();
}
