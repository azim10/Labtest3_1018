
public class Task {
	
	State st;
	UserStory userstory;
	private String TaskName;

	public Task(UserStory user1, String TaskName) {
		// TODO Auto-generated constructor stub
		this.TaskName=TaskName;
		this.userstory =user1;
		user1.attach(this);
	}

	public String getTaskName() {
		return TaskName;
	}

}
