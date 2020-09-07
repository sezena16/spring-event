package com.intern.repository;

import com.intern.entity.Org;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrgRepository extends JpaRepository<Org,Long> {
}
