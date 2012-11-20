
public class UserStory {
	
	State st;
	Task task;
	Sprint spr;
	int Priority;
	private int point;
	public String StoryName;
	

	public String getStoryName() {
		return StoryName;
	}

	public UserStory(Sprint spr1, String StoryName) {
		// TODO Auto-generated constructor stub
		
		this.spr=spr1;
		this.StoryName=StoryName;
		spr.attach(this);
		
		System.out.println("UserStory: " +StoryName);
				
	}

	public void setPriority(int prio) {
		// TODO Auto-generated method stub
		
		Priority = prio;
		System.out.println("With priority: " +Priority);
		
	}

	public void Point(int point) {
		// TODO Auto-generated method stub
		this.point=point;
		System.out.println("and total hours: " +point);
		
	}

	public void attach(Task task) {
		// TODO Auto-generated method stub
		this.task=task;
	}

}
