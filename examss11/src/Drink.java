public abstract class Drink {
    protected int id;
    protected String name;
    protected double price;
    public Drink(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public abstract double caculatePrice();
    public void displayInfor(){
        System.out.println("Mã : " + id + "|" + "Tên : " + name + "|" + "Giá gốc: " + price);
    }
}