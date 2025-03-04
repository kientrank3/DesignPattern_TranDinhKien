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
                System.out.println(name + " đi tuần.");
                System.out.println(name + " gán việc cho nhân viên.");
                break;
            case "Giám đốc":
                System.out.println(name + " quản lý công ty.");
                System.out.println(name + " phê duyệt ngân sách.");
                break;
            case "Nhân viên Văn Phòng":
                System.out.println(name + " pha cà phê.");
                System.out.println(name + " soạn thảo văn bản.");
                break;
            case "Nhân viên Xưởng":
                System.out.println(name + " lắp ráp sản phẩm.");
                System.out.println(name + " kiểm tra chất lượng.");
                break;
            case "Kế Toán Trưởng":
                System.out.println(name + " lập báo cáo tài chính.");
                System.out.println(name + " tính lương nhân viên.");
                break;
            default:
                System.out.println(name + " không có nhiệm vụ cụ thể.");
        }
    }

    public static void main(String[] args) {
        Employee teamLeader = new Employee("Khang", "Đội Trưởng");
        Employee officeStaff = new Employee("Canh", "Nhân viên Văn Phòng");
        Employee director = new Employee("Kien", "Giám đốc");
        teamLeader.performDuties();
        officeStaff.performDuties();
        director.performDuties();
    }
}