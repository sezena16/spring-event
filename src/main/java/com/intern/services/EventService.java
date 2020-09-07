package com.intern.services;

import com.intern.entity.Event;
import com.intern.entity.SYSTEM;

import java.util.List;

public interface EventService {

    List<Event> saveAll(List<Event> events);

    Event save(Event event);

    List<Event> findAllBySystem(SYSTEM system);

}
