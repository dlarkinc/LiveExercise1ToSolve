package ie.cit.soft8027.liveexercise1.repository;

import java.util.List;

import ie.cit.soft8027.liveexercise1.entity.LearningOutcome;

public interface LearningOutcomeRepository {

	List<LearningOutcome> getByModuleId(int id);
	
}
