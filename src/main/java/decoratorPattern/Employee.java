package decoratorPattern;

//Base component
interface Employee {
 void performDuties();
}

//Concrete component
class BasicEmployee implements Employee {
 private String name;

 public BasicEmployee(String name) {
     this.name = name;
 }

 @Override
 public void performDuties() {
     System.out.println(name + " thực hiện nhiệm vụ cơ bản.");
 }
}

//Decorator base
abstract class EmployeeDecorator implements Employee {
 protected Employee decoratedEmployee;

 public EmployeeDecorator(Employee decoratedEmployee) {
     this.decoratedEmployee = decoratedEmployee;
 }

 @Override
 public void performDuties() {
     decoratedEmployee.performDuties();
 }
}

//Existing decorators
class TeamLeaderDecorator extends EmployeeDecorator {
 public TeamLeaderDecorator(Employee decoratedEmployee) {
     super(decoratedEmployee);
 }

 @Override
 public void performDuties() {
     super.performDuties();
     System.out.println("Đi tuần.");
     System.out.println("Gán việc cho nhân viên.");
 }
}

class OfficeStaffDecorator extends EmployeeDecorator {
 public OfficeStaffDecorator(Employee decoratedEmployee) {
     super(decoratedEmployee);
 }

 @Override
 public void performDuties() {
     super.performDuties();
     System.out.println("Pha cà phê.");
     System.out.println("Soạn thảo văn bản.");
 }
}

//New decorators
class MarketingManagerDecorator extends EmployeeDecorator {
 public MarketingManagerDecorator(Employee decoratedEmployee) {
     super(decoratedEmployee);
 }

 @Override
 public void performDuties() {
     super.performDuties();
     System.out.println("Lên kế hoạch quảng cáo.");
     System.out.println("Phân tích thị trường.");
 }
}

class ITSupportDecorator extends EmployeeDecorator {
 public ITSupportDecorator(Employee decoratedEmployee) {
     super(decoratedEmployee);
 }

 @Override
 public void performDuties() {
     super.performDuties();
     System.out.println("Sửa chữa máy tính.");
     System.out.println("Cài đặt phần mềm.");
 }
}

