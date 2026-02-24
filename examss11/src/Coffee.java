public class Coffee extends Drink{
    protected boolean hasMilk;

    public Coffee(int id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    public double caculatePrice() {
        if(hasMilk == true){
            return price + 500;
        }else {
            return price;
        }
    }
    @Override
    public void displayInfor() {
        super.displayInfor();
        if(hasMilk == true){
            System.out.println("Có sữa");
        }else {
            System.out.print("Không sữa");
        }
    }
}
