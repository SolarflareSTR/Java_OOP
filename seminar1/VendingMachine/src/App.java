import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import VendingMachine.VendingMachine;
public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(1, "Lays" , "Чипсы", 59);
        item1.setPrice(98);
        Product item2 = new Bottle(2, "Cola", "Напитки", 99, 500);
        VendingMachine iMachine = new VendingMachine(250);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(new Product(3, "Сникерс", "Шоколад", 69));
        iMachine.addProduct(new Bottle(4, "Bonaqua", "Напитки",49, 500));
        iMachine.addProduct(new HotDrink(5, "Горячий Чай", "Горячие напитки",49, 300, 60));
        iMachine.addProduct(new HotDrink(6, "Горячий Кофе", "Горячие напитки",59, 300, 60));
        iMachine.addProduct(new HotDrink(7, "Горячий Какао", "Горячие напитки",69, 300, 60));
        
        for(Product prod: iMachine.getProducts())
        {
            System.out.println(prod.toString());
        }
    } 
}
