package com.example.brief_smart_house_backend.services.HouseService;

import com.example.brief_smart_house_backend.entities.House;
import com.example.brief_smart_house_backend.entities.Room;
import com.example.brief_smart_house_backend.repository.HouseRepository;
import com.example.brief_smart_house_backend.services.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService implements IHouseService{

    @Autowired
    HouseRepository houseRepository;

    @Autowired
    SequenceGeneratorService sequenceGenerator;

    @Override
    public List<House> getAll() {
        List<House> houses = houseRepository.findAll();
        return houses;
    }

    @Override
    public House AddHouse(House house) {
        house.setId(sequenceGenerator.generateSequence(Room.SEQUENCE_NAME));
        House hse= houseRepository.save(house);
        return hse;
    }

    @Override
    public House UpdateHouse(House house) {
        House hse= houseRepository.save(house);
        return hse;
    }

    @Override
    public boolean deleteHouse(long id) {
        try {
            houseRepository.deleteById(id);
        }catch (Exception ex){
            return false;
        }
        return true;

    }


}
