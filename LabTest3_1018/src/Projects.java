
public class Projects {
	
	Sprint spr;
	
	String Projectname;
	String Discription;
	public void createProject(String proname, String des) {
		// TODO Auto-generated method stub
		this.Projectname=proname;
		this.Discription=des;
		
		Sprint spr;
		System.out.println("Project " + Projectname +" has been craeted" );
	}
	public void attch(Sprint sprint) {
		// TODO Auto-generated method stub
		this.spr =sprint;
	}
	
	
	
	
	
	

}
