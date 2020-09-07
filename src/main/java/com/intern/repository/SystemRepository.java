package com.intern.repository;

import com.intern.entity.SYSTEM;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SystemRepository extends JpaRepository<SYSTEM,Long> {

    Optional<SYSTEM> findBySystemIDAndSystemName(int systemID,String systemName);

}
