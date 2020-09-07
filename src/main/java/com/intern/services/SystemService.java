package com.intern.services;


import com.intern.entity.SYSTEM;

import java.util.List;
import java.util.Optional;

public interface SystemService {

    List<SYSTEM> saveAll(List<SYSTEM> systems);

    SYSTEM save(SYSTEM system);

    Optional<SYSTEM> findBySystemIDAndSystemName(int system_id, String system_name);

}
