import java.util.Scanner;

class Student {
    String id;
    String name;
    double score;
    public Student(String id, String name, double score){
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public void display(){
        System.out.println("Mã SV: "+id);
        System.out.println("Tên SV: "+name);
        System.out.println("Điểm trung bình: "+score);
        System.out.println("Học lực: "+getRank(score));
        System.out.println("\n");
    }
    public static String getRank(double score){
        if (score >= 8.0){
            return "Giỏi";
        }else if(score <8.0 && score >= 6.5){
            return "Khá";
        }else{
            return "Trung Bình";
        }

    }
}
public class ExamPractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] list= new Student[100];
        int count = 0;
        int choice;
        do {
            System.out.println("\n=====QUẢN LÝ SINH VIÊN=====");
            System.out.println("1.Nhập danh sách sinh viên");
            System.out.println("2.Hiển thị danh sách sinh viên");
            System.out.println("3.Tìm kiếm sinh viên theo Học lực");
            System.out.println("4.Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.println("============================");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Nhập id: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên sinh viên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập điểm trung bình: ");
                    double score = sc.nextDouble();
                    list[count] = new Student(id, name, score);
                    count++;
                    System.out.println("Thêm thành sinh viên thành công");
                    break;
                case 2:
                    if(count==0){
                        System.out.println("Chưa có sinh viên nào!");
                    }else {
                        for (int i = 0; i < count; i++) {
                            list[i].display();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập học lực cần tìm: ");
                    String rank = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (Student.getRank(list[i].score).equalsIgnoreCase(rank)) {
                            list[i].display();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy sinh viên phù hợp!");
                    }
                    break;
                case 4:
                    for (int i = 0; i < count - 1; i++) {
                        for (int j = i + 1; j < count; j++) {
                            if (list[i].score < list[j].score) {
                                Student temp = list[i];
                                list[i] = list[j];
                                list[j] = temp;
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ");
                    break;
            }
        }while(choice != 5);
    }
}