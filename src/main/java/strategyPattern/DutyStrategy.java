package strategyPattern;

//Interface for strategy
interface DutyStrategy {
 void performDuties();
}
class TeamLeaderStrategy implements DutyStrategy {
    private String name;

    public TeamLeaderStrategy(String name) {
        this.name = name;
    }

    @Override
    public void performDuties() {
    	System.out.println("+ "+name + ": quản lý công ty, phê duyệt ngân sách.");
    }
}

class OfficeStaffStrategy implements DutyStrategy {
    private String name;

    public OfficeStaffStrategy(String name) {
        this.name = name;
    }

    @Override
    public void performDuties() {
    	System.out.println("+ "+name + ": pha cà phê, soạn thảo văn bản.");
    }
}

// New strategies
class MarketingManagerStrategy implements DutyStrategy {
    private String name;

    public MarketingManagerStrategy(String name) {
        this.name = name;
    }

    @Override
    public void performDuties() {
    	System.out.println("+ "+name + " lập báo cáo tài chính, tính lương nhân viên.");
    }
}

class ITSupportStrategy implements DutyStrategy {
    private String name;

    public ITSupportStrategy(String name) {
        this.name = name;
    }

    @Override
    public void performDuties() {
        System.out.println("+ "+name + ": sửa chữa máy tính, cài đặt phần mềm.");
    }
}

// Context class
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


