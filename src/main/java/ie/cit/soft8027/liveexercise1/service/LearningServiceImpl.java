package ie.cit.soft8027.liveexercise1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ie.cit.soft8027.liveexercise1.entity.Module;
import ie.cit.soft8027.liveexercise1.repository.LearningOutcomeRepository;
import ie.cit.soft8027.liveexercise1.repository.ModuleRepository;

// MISSING!
public class LearningServiceImpl // MISSING!

	@Autowired
	private ModuleRepository moduleRepo;

	// MISSING!
	private LearningOutcomeRepository loRepo;
	
	/**
	 * This may not be the most efficient way to do this - using a join query with result set extractor might be faster
	 */
	@Override
	public void populateLearningOutcomes(Module module) {
		module.setLearningOutcomes(loRepo.getByModuleId(module.getId()));
	}

	@Override
	public List<Module> getAllModules() {
		return moduleRepo.findAll();
	}

}
