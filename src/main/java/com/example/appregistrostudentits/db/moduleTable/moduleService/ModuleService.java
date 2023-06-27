package com.example.appregistrostudentits.db.moduleTable.moduleService;

import com.example.appregistrostudentits.db.moduleTable.ModuleTable;

import java.util.List;


public interface ModuleService {
    ModuleTable createModule(ModuleTable module);
    ModuleTable getModule(Long id);
    List<ModuleTable> getAllModules();
    ModuleTable updateModule(ModuleTable module);
    void deleteModule(Long id);
}
