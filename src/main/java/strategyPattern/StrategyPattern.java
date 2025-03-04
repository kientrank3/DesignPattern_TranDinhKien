package strategyPattern;

public class StrategyPattern {
	 public static void main(String[] args) {
	     Employee employee = new Employee();

	     // Use Team Leader strategy
	     employee.setDutyStrategy(new TeamLeaderStrategy("Kiên"));
	     employee.performDuties();

	     // Use Office Staff strategy
	     employee.setDutyStrategy(new OfficeStaffStrategy("Cảnh"));
	     employee.performDuties();
	     employee.setDutyStrategy(new ITSupportStrategy("Khang"));
	     employee.performDuties();
	 }
	
}
