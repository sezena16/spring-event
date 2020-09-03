package com.havelsan.intern.repository;

import com.havelsan.intern.entity.Org;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrgRepository extends JpaRepository<Org,Long> {
}
