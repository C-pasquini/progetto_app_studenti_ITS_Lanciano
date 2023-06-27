package com.example.appregistrostudentits.db.moduleTable;

import com.example.appregistrostudentits.db.moduleTable.ModuleTable;
import com.example.appregistrostudentits.db.moduleTable.moduleService.ModuleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class ModuleController {
    private final ModuleService moduleService;

    public ModuleController(ModuleService moduleService) {
        this.moduleService = moduleService;
    }

    @GetMapping("/modules")
    public List<ModuleTable> getAllModules() {
        return moduleService.getAllModules();
    }

    @GetMapping("/modules/{id}")
    public ModuleTable getModule(@PathVariable Long id){
        return moduleService.getModule(id);
    }

    @PostMapping("/modules")
    public ModuleTable createModule(@RequestBody ModuleTable module){
        return moduleService.createModule(module);
    }

    @PutMapping("/modules/{id}")
    public ModuleTable updateModule(@PathVariable Long id, @RequestBody ModuleTable module){
        if(!id.equals(module.getIdCorso())){
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Id in path does not match Id in Module object");
        }
        return moduleService.updateModule(module);
    }

    @DeleteMapping("/modules/{id}")
    public void deleteModule(@PathVariable Long id) {
        moduleService.deleteModule(id);
    }
}
