package noDesignPattern;

public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void performDuties() {
        switch (position) {
            case "Đội Trưởng":
                System.out.println("+ "+name + ": đi tuần, gán việc cho nhân viên.");
                break;
            case "Giám đốc":
                System.out.println("+ "+name + ": quản lý công ty, phê duyệt ngân sách.");
                break;
            case "Nhân viên Văn Phòng":
                System.out.println("+ "+name + ": pha cà phê, soạn thảo văn bản.");
                break;
            case "Nhân viên Xưởng":
                System.out.println("+ "+name + ": lắp ráp sản phẩm, kiểm tra chất lượng.");
                break;
            case "Kế Toán Trưởng":
                System.out.println("+ "+name + " lập báo cáo tài chính, tính lương nhân viên.");
                break;
            default:
                System.out.println(name + " không có nhiệm vụ cụ thể.");
        }
    }

    public static void main(String[] args) {
        Employee teamLeader = new Employee("Khang", "Đội Trưởng");
        Employee officeStaff = new Employee("Canh", "Nhân viên Văn Phòng");
        Employee director = new Employee("Kien", "Giám đốc");
        Employee accountant = new Employee("Tam", "Kế Toán Trưởng");
        accountant.performDuties();
        teamLeader.performDuties();
        officeStaff.performDuties();
        director.performDuties();
    }
}