package com.havelsan.intern.services;


import com.havelsan.intern.entity.SYSTEM;
import com.havelsan.intern.entity.Spot;

import java.util.List;

public interface SpotService {

    List<Spot> saveAll(List<Spot> spots);

    Spot save(Spot spot);

    List<Spot> findAllBySpotSystem(SYSTEM system);

}
