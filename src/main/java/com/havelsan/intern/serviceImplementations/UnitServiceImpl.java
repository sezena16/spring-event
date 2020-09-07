package com.havelsan.intern.serviceImplementations;


import com.havelsan.intern.entity.UNIT;
import com.havelsan.intern.repository.UnitRepository;
import com.havelsan.intern.services.UnitService;
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
