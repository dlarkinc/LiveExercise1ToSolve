package ie.cit.soft8027.liveexercise1.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ie.cit.soft8027.liveexercise1.entity.LearningOutcome;
import ie.cit.soft8027.liveexercise1.rowmapper.LearningOutcomeRowMapper;
import ie.cit.soft8027.liveexercise1.rowmapper.ModuleRowMapper;

@Repository
public class JdbcLearningOutcomeRepository implements LearningOutcomeRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<LearningOutcome> getByModuleId(int id) {
		String sql = "SELECT * FROM learning_outcomes WHERE module_id = ?";
		return jdbcTemplate.query(sql,  new Object[] {id}, new LearningOutcomeRowMapper());
	}
	
}
