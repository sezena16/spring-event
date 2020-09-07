package com.intern.serviceImplementations;


import com.intern.entity.Event;
import com.intern.entity.SYSTEM;
import com.intern.repository.EventRepository;
import com.intern.services.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    public List<Event> saveAll(List<Event> events){
        return eventRepository.saveAll(events);
    }

    public Event save(Event event){
        return eventRepository.save(event);
    }

    public List<Event> findAllBySystem(SYSTEM system){
        return eventRepository.findAllBySystem(system);
    }

}
