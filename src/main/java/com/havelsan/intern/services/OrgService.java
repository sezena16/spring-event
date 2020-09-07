package com.havelsan.intern.services;


import com.havelsan.intern.entity.Org;

import java.util.List;

public interface OrgService {

    List<Org> saveAll(List<Org> orgs);

    Org save(Org org);

}
