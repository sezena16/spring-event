package com.intern.serviceImplementations;


import com.intern.entity.UNIT;
import com.intern.repository.UnitRepository;
import com.intern.services.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UnitServiceImpl implements UnitService {

    private final UnitRepository unitRepository;

    public List<UNIT> saveAll(List<UNIT> units){
        return unitRepository.saveAll(units);
    }

    public UNIT save(UNIT unit){
        return unitRepository.save(unit);
    }

}
