package com.example.brief_smart_house_backend.services.HouseService;

import com.example.brief_smart_house_backend.entities.House;

import java.util.List;

public interface IHouseService {
    House AddHouse(House house);
    House UpdateHouse(House house);
    boolean deleteHouse(long id);
    List<House> getAll();

}
