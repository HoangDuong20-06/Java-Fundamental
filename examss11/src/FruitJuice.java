public class FruitJuice extends Drink implements isMix{
    protected int discountPercent;

    public FruitJuice(int id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double caculatePrice() {
        if(discountPercent != 0){
            return price - (price * discountPercent / 100);
        }else {
            return price;
        }
    }
    @Override
    public void mix() {
        System.out.println("Đang ép trái cây tươi");
    }
}
