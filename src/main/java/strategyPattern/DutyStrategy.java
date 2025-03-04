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

// New strategies
class MarketingManagerStrategy implements DutyStrategy {
    private String name;

    public MarketingManagerStrategy(String name) {
        this.name = name;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " lên kế hoạch quảng cáo.");
        System.out.println(name + " phân tích thị trường.");
    }
}

class ITSupportStrategy implements DutyStrategy {
    private String name;

    public ITSupportStrategy(String name) {
        this.name = name;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " sửa chữa máy tính.");
        System.out.println(name + " cài đặt phần mềm.");
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


