package statePattern;

//Interface for state
interface EmployeeState {
 void performDuties();
}

//Concrete states
class TeamLeaderState implements EmployeeState {
 private String name;

 public TeamLeaderState(String name) {
     this.name = name;
 }

 @Override
 public void performDuties() {
     System.out.println(name + " đi tuần.");
     System.out.println(name + " gán việc cho nhân viên.");
 }
}

class OfficeStaffState implements EmployeeState {
 private String name;

 public OfficeStaffState(String name) {
     this.name = name;
 }

 @Override
 public void performDuties() {
     System.out.println(name + " pha cà phê.");
     System.out.println(name + " soạn thảo văn bản.");
 }
}

//Context class
class Employee {
 private EmployeeState state;

 public void setState(EmployeeState state) {
     this.state = state;
 }

 public void performDuties() {
     if (state != null) {
         state.performDuties();
     } else {
         System.out.println("Chưa gán chức vụ.");
     }
 }
}

