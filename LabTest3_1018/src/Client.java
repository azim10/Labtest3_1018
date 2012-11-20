
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory Factory=new Factory();
	
		
		Projects pro=Factory.Projects();
		//Projects pro=new Projects();
		
		pro.createProject("lms","learning management system");
		
		//sprints 1
		Sprint spr1=Factory.CreateSprint(pro);
		spr1.setTime("2 weeks");
		
		System.out.println("*******************User stories information*******************\n");
		
		UserStory user1 =new UserStory(spr1,"Register_User");
		
		user1.setPriority(1);
		user1.Point(8);
		UserStory user2 =new UserStory(spr1,"Login User");
		user2.setPriority(5);
		user2.Point(5);
		UserStory user3 =new UserStory(spr1,"Register For a Course");
		user3.setPriority(1);
		user3.Point(5);
		
		//Task for user story one
		Task user1task1=new Task(user1,"Designing Forms");
		Task user1task2=new Task(user1,"Creating tables");
		Task user1task3=new Task(user1,"Testing");
		
		//Task for user story Two
		Task user2task1=new Task(user2,"Designing Forms");
		Task user2task2=new Task(user2,"Creating tables");
		Task user2task3=new Task(user2,"Testing");
		
		//States of stask one
		
		State state=Factory.CraeteState();
		state.attch(user1,user1task1);
		UserStoryStates Reading = Factory.ReadingState();
		UserStoryStates Doing = Factory.DoingState();
		UserStoryStates Done = Factory.DoneState();
		UserStoryStates panding = Factory.PandingState();
		System.out.println("*******************Task Status***************\n");
		state.changeState(Doing,user1,user1task1);
		
		//sprints 2
		Sprint spr2=new Sprint(pro);
		
		
		
		
		
		
		
		

	}

}
