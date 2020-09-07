package com.havelsan.intern.services;


import com.havelsan.intern.entity.UNIT;

import java.util.List;

public interface UnitService {

    List<UNIT> saveAll(List<UNIT> units);

    UNIT save(UNIT unit);

}
