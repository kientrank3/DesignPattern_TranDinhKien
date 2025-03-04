package statePattern;

//Interface for state
interface EmployeeState {
    void performDuties();
}

// Existing states
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

// New states
class MarketingManagerState implements EmployeeState {
    private String name;

    public MarketingManagerState(String name) {
        this.name = name;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " lên kế hoạch quảng cáo.");
        System.out.println(name + " phân tích thị trường.");
    }
}

class ITSupportState implements EmployeeState {
    private String name;

    public ITSupportState(String name) {
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
