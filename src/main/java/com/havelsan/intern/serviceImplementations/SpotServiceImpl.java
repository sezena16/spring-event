package com.havelsan.intern.serviceImplementations;


import com.havelsan.intern.entity.SYSTEM;
import com.havelsan.intern.entity.Spot;
import com.havelsan.intern.repository.SpotRepository;
import com.havelsan.intern.services.SpotService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SpotServiceImpl implements SpotService {

    private final SpotRepository spotRepository;

    public List<Spot> saveAll(List<Spot> spots){
        return spotRepository.saveAll(spots);
    }

    public Spot save(Spot spot){
        return spotRepository.save(spot);
    }

    public List<Spot> findAllBySpotSystem(SYSTEM system){
        return spotRepository.findAllBySpotSystem(system);
    }

}
