package com.havelsan.intern.serviceImplementations;


import com.havelsan.intern.entity.Org;
import com.havelsan.intern.repository.OrgRepository;
import com.havelsan.intern.services.OrgService;
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
