package com.havelsan.intern.services;

import com.havelsan.intern.entity.Event;
import com.havelsan.intern.entity.SYSTEM;

import java.util.List;

public interface EventService {

    List<Event> saveAll(List<Event> events);

    Event save(Event event);

    List<Event> findAllBySystem(SYSTEM system);

}
