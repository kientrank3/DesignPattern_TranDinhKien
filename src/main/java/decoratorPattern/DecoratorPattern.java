package decoratorPattern;

public class DecoratorPattern {
	 public static void main(String[] args) {
	     Employee  kien= new TeamLeaderDecorator(new BasicEmployee("Kiên"));
	     kien.performDuties();

	     Employee canh = new OfficeStaffDecorator(new BasicEmployee("Cảnh"));
	     canh.performDuties();
	     Employee khang = new OfficeStaffDecorator(new BasicEmployee("Khang"));
	     khang.performDuties();
	 }
	
}
