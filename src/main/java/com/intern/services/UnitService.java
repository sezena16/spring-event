package com.intern.services;


import com.intern.entity.UNIT;

import java.util.List;

public interface UnitService {

    List<UNIT> saveAll(List<UNIT> units);

    UNIT save(UNIT unit);

}
