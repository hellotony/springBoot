package com.dream.demo;

import java.util.List;

/**
 * Created by sunzhiqiang on 2016/8/26.
 */
public interface ModuleMapper {

    void insert(Module module);

    Module getModuleById(Integer id);

    Module getFirstModule();

    List<Module> getModuleListByType(Integer typeId);

    List<Module> getModuleList();
}