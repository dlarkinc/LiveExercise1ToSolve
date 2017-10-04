package ie.cit.soft8027.liveexercise1.entity;

public class LearningOutcome {
	private int id;
	private int displayOrder;
	private String description;
	private Module module;
	
	public LearningOutcome() {}
	
	public LearningOutcome(int id, int displayOrder, String description, Module module) {
		super();
		this.id = id;
		this.displayOrder = displayOrder;
		this.description = description;
		this.module = module;
	}



	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getDisplayOrder() {
		return displayOrder;
	}
	
	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Module getModule() {
		return module;
	}
	
	public void setModule(Module module) {
		this.module = module;
	}
	
	@Override
	public String toString() {
		return "LearningOutcome [id=" + id + ", displayOrder=" + displayOrder + ", description=" + description
				+ ", module=" + module + "]";
	}
	
}
