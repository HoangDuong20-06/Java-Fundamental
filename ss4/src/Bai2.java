public class Bai2 {
    public static void main(String[] args) {
        String description = "Sách giáo khoa Toán lớp 12. Kệ: A1-102, tình trạng mới.";
        if(description.contains("Kệ: ")){
            int start = description.indexOf("Kệ: ")+4;
            int end = description.indexOf(",", start);
            if(end == -1){
                end = description.length();
            }
            String shelfCode = description.substring(start,end).trim();
            System.out.println("Mã vị trí kệ sách: "+ shelfCode);
            String newDescription = description.replace("Kệ: ", "Vị trí lưu trữ: ");
            System.out.print("Mô tả sau khi thay thế: ");
            System.out.println(newDescription);
        }else{
            System.out.println("Không tìm thấy thông tin kệ sách trong mô tả");
        }
    }
}
