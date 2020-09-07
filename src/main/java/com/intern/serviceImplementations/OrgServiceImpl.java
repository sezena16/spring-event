package com.intern.serviceImplementations;


import com.intern.entity.Org;
import com.intern.repository.OrgRepository;
import com.intern.services.OrgService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrgServiceImpl implements OrgService {

    private final OrgRepository orgRepository;

    public List<Org> saveAll(List<Org> orgs){
        return orgRepository.saveAll(orgs);
    }

    public Org save(Org org){
        return orgRepository.save(org);
    }

}
