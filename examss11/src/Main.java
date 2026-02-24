public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee(1, "Bạc xỉu",30000,true);
        drinks[1] = new FruitJuice(2, "Nước cam" , 40000, 10);
        drinks[2] = null;
        for (int i = 0 ;i<3;i++){
            if(drinks[i] == null){
                System.out.print("Nước không có");
            }
            drinks[i].displayInfor();
            drinks[i].caculatePrice();
            if(drinks[i] instanceof FruitJuice){
                ((FruitJuice) drinks[i]).mix();
            }
        }
        }
    }