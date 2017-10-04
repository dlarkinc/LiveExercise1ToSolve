package ie.cit.soft8027.liveexercise1.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ie.cit.soft8027.liveexercise1.entity.Module;
import ie.cit.soft8027.liveexercise1.rowmapper.ModuleRowMapper;

@Repository
public class JdbcModuleRepository implements ModuleRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * Retrieve a single module
	 * 
	 * @param id	primary key
	 * @return	module entity object
	 */
	@Override
	public Module getById(int id) {
		String sql = "SELECT * FROM modules WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, new ModuleRowMapper());
	}

	/**
	 * Retrieve all modules
	 * 
	 * @return	list of all module entity objects
	 */
	@Override
	public List<Module> findAll() {
		String sql = "SELECT * FROM modules";
		return jdbcTemplate.query(sql,  new ModuleRowMapper());
					
	}

}
