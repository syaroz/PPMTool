package com.syaroz.ppmtool.repositories;

import com.syaroz.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {

    Project findByProjectIdentifier(String project);

    @Override
    Iterable<Project> findAll();
}
