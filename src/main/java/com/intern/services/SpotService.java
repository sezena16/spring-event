package com.intern.services;


import com.intern.entity.SYSTEM;
import com.intern.entity.Spot;

import java.util.List;

public interface SpotService {

    List<Spot> saveAll(List<Spot> spots);

    Spot save(Spot spot);

    List<Spot> findAllBySpotSystem(SYSTEM system);

}
