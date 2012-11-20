
public class Factory {

	public Projects Projects() {
		// TODO Auto-generated method stub
		return new Projects();
	}

	public State CraeteState() {
		// TODO Auto-generated method stub
		return new State();
	}

	public UserStoryStates ReadingState() {
		// TODO Auto-generated method stub
		return new Reading();
	}

	public UserStoryStates DoingState() {
		// TODO Auto-generated method stub
		return new Doing();
	}

	public UserStoryStates DoneState() {
		// TODO Auto-generated method stub
		return new Done();
	}

	public UserStoryStates PandingState() {
		// TODO Auto-generated method stub
		return new Panding();
	}

	public Sprint CreateSprint(Projects pro) {
		// TODO Auto-generated method stub
		return new Sprint(pro);
	}

}
