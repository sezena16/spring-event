package com.havelsan.intern.repository;

import com.havelsan.intern.entity.Event;
import com.havelsan.intern.entity.SYSTEM;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event,Long> {

    List<Event> findAllBySystem(SYSTEM system);

}
