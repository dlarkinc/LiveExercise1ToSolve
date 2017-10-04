package ie.cit.soft8027.liveexercise1.repository;

import java.util.List;

import ie.cit.soft8027.liveexercise1.entity.Module;

public interface ModuleRepository {

	Module getById(int id); 

	List<Module> findAll();

}
