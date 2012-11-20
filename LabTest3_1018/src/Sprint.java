
public class Sprint {
	
	
	Projects pro2;

	public Sprint(Projects pro2) {
		// TODO Auto-generated constructor stub
		
		this.pro =pro2;
		pro.attch(this);
	}

	UserStory userstory;
	
	Projects pro =new  Projects();

	private String duration;

	public void setTime(String duration) {
		// TODO Auto-generated method stub
		this.duration=duration;
	}

	public void attach(UserStory us) {
		// TODO Auto-generated method stub
		this.userstory=us;
	}
	
	

}
