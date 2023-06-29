package com.example.appregistrostudentits.db.moduleTable.moduleService;

import com.example.appregistrostudentits.db.moduleTable.ModuleRepository;
import com.example.appregistrostudentits.db.moduleTable.ModuleTable;
import com.example.appregistrostudentits.db.studentModuleVote.StudentModuleVote;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {
    private final ModuleRepository moduleRepository;

    public ModuleServiceImpl(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    @Override
    public ModuleTable createModule(ModuleTable module) {
        return moduleRepository.save(module);
    }

    @Override
    public ModuleTable getModule(Long id) {
        return moduleRepository.findById(id).orElseThrow();
    }

    @Override
    public List<ModuleTable> getAllModules() {
        return moduleRepository.findAll();
    }

    @Override
    public List<StudentModuleVote> getAllVotesByModule(Long id) {
        return moduleRepository.getVotesByModule(id);
    }

    @Override
    public ModuleTable updateModule(ModuleTable module) {
        return moduleRepository.save(module);
    }

    @Override
    public void deleteModule(Long id) {
        moduleRepository.deleteById(id);
    }
}
