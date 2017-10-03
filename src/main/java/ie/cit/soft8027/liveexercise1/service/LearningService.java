package ie.cit.soft8027.liveexercise1.service;

import java.util.List;

import ie.cit.soft8027.liveexercise1.entity.Module;

public interface LearningService {

	void populateLearningOutcomes(Module module);
	
	List<Module> getAllModules();
}
