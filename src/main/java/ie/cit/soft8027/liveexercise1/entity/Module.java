package ie.cit.soft8027.liveexercise1.entity;

import java.util.List;

/**
 * A taught module
 * 
 * @author larkin.cunningham
 *
 */
public class Module {
	private int id;
	private String code;
	private double credits;
	private String nfq_level;
	private String description;
	
	private List<LearningOutcome> learningOutcomes;
	
	public Module() {}
	
	public Module(int id, String code, double credits, String nfq_level, String description) {
		super();
		this.id = id;
		this.code = code;
		this.credits = credits;
		this.nfq_level = nfq_level;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public double getCredits() {
		return credits;
	}
	
	public void setCredits(double credits) {
		this.credits = credits;
	}
	
	public String getNfq_level() {
		return nfq_level;
	}
	
	public void setNfq_level(String nfq_level) {
		this.nfq_level = nfq_level;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public List<LearningOutcome> getLearningOutcomes() {
		return learningOutcomes;
	}

	public void setLearningOutcomes(List<LearningOutcome> learningOutcomes) {
		this.learningOutcomes = learningOutcomes;
	}

	@Override
	public String toString() {
		return "Module [id=" + id + ", code=" + code + ", credits=" + credits + ", nfq_level=" + nfq_level
				+ ", description=" + description + ", learningOutcomes=" + learningOutcomes + "]";
	}
	
}
