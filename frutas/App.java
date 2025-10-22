import frutas.Balinha;
import frutas.Shampoo;
import frutas.Bebidas;

public class App {
    public static void main(String[] args) {
    Balinha bubaloo = new Balinha("Melância", "verde");
    Shampoo seda = new Shampoo("Morango", "Vermelho");
    Bebidas cafe = new Bebidas("Manga", "Marrom");

     seda.tipo(); 
     cafe.tipo(); 
    
     bubaloo.sabor();
     bubaloo.aparencia();
     
     seda.perfume();
     seda.frasco();

     cafe.suco();
     cafe.cafe();








    }
}
