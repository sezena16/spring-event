package com.intern.serviceImplementations;


import com.intern.entity.SYSTEM;
import com.intern.entity.Spot;
import com.intern.repository.SpotRepository;
import com.intern.services.SpotService;
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
