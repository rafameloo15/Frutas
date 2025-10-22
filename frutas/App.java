import frutas.Balinha;
import frutas.Shampoo;
import frutas.Bebidas;

public class App {
    public static void main(String[] args) {
    Frutas moranguinho = new Frutas("Uva", "Roxo"); 
    Balinha bubaloo = new Balinha("Melância", "verde");
    Shampoo seda = new Shampoo("Morango", "Vermelho");
    Bebidas cafe = new Bebidas("Manga", "Marrom");

     moranguinho.tipo(); 
    
     bubaloo.sabor();
     bubaloo.aparencia();
     
     seda.perfume();
     seda.frasco();

     cafe.suco();
     cafe.cafe();








    }
}
