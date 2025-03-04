package statePattern;

public class StatePattern {
	public static void main(String[] args) {
		   Employee employee = new Employee();
		
		   // Set state to Team Leader
		   employee.setState(new TeamLeaderState("Kiên"));
		   employee.performDuties();
		
		   // Set state to Office Staff
		   employee.setState(new OfficeStaffState("Cảnh"));
		   employee.performDuties();
		   employee.setState(new OfficeStaffState("Khang"));
		   employee.performDuties();
		}
}
