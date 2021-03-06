package com.intern.serviceImplementations;


import com.intern.entity.SYSTEM;
import com.intern.repository.SystemRepository;
import com.intern.services.SystemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SystemServiceImpl implements SystemService {

    private final SystemRepository systemRepository;

    public List<SYSTEM> saveAll(List<SYSTEM> systems){
        return systemRepository.saveAll(systems);
    }

    public SYSTEM save(SYSTEM system){
        return systemRepository.save(system);
    }

    public Optional<SYSTEM> findBySystemIDAndSystemName(int system_id, String system_name){
        return systemRepository.findBySystemIDAndSystemName(system_id,system_name);
    }

}
