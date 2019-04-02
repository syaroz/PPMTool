package com.syaroz.ppmtool.services;

import com.syaroz.ppmtool.domain.Project;
import com.syaroz.ppmtool.exceptions.ProjectIdException;
import com.syaroz.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);

        }catch (Exception e){
            throw new ProjectIdException("Project ID "+ project.getProjectIdentifier().toUpperCase()+ " Already exist");
        }

        //Logic
    }
}
