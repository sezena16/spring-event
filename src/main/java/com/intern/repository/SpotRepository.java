package com.intern.repository;

import com.intern.entity.SYSTEM;
import com.intern.entity.Spot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpotRepository extends JpaRepository<Spot,Long> {

    List<Spot> findAllBySpotSystem(SYSTEM system);

}
