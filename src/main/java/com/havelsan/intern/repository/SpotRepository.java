package com.havelsan.intern.repository;

import com.havelsan.intern.entity.SYSTEM;
import com.havelsan.intern.entity.Spot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpotRepository extends JpaRepository<Spot,Long> {

    List<Spot> findAllBySpotSystem(SYSTEM system);

}
