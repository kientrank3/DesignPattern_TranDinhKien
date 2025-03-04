package strategyPattern;

//Interface for strategy
interface DutyStrategy {
 void performDuties();
}

//Concrete strategies
class TeamLeaderStrategy implements DutyStrategy {
 private String name;

 public TeamLeaderStrategy(String name) {
     this.name = name;
 }

 @Override
 public void performDuties() {
     System.out.println(name + " đi tuần.");
     System.out.println(name + " gán việc cho nhân viên.");
 }
}

class OfficeStaffStrategy implements DutyStrategy {
 private String name;

 public OfficeStaffStrategy(String name) {
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
 private DutyStrategy dutyStrategy;

 public void setDutyStrategy(DutyStrategy dutyStrategy) {
     this.dutyStrategy = dutyStrategy;
 }

 public void performDuties() {
     if (dutyStrategy != null) {
         dutyStrategy.performDuties();
     } else {
         System.out.println("Không có nhiệm vụ.");
     }
 }
}


