
public class State {

	UserStoryStates Ustate;
	UserStory ust;
	Task tk;
	
	public void changeState(UserStoryStates Ustate, UserStory user1, Task Utask) {
		
		System.out.println("Task for " + tk.getTaskName() + " of User Story " + ust.getStoryName());
		this.Ustate=Ustate;
		Ustate.ReadingState();
		Ustate.DoingState();
		Ustate.Done();
		
	//	Ustate.Panding();
		
	}

	public void attch(UserStory userstory, Task user1task) {
		// TODO Auto-generated method stub
		this.ust=userstory;
		
		
		this.tk=user1task;
		
	}

}
