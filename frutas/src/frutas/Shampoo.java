package frutas;
public class Shampoo extends Frutas{

public Shampoo(String nome, String cor){
        super(nome,cor);   
    }

 public String getNome(){
    return nome;
 }

 public void setNome(String nome){
    this.nome=nome;
 }

 public String getCor(){
    return cor;
 }

 public void setCor(String cor){
    this.cor=cor;
 }

 public void perfume(){
    System.out.println("O perfume desse shampoo é de: " + nome);
 }

 public void frasco(){
    System.out.println("A cor do frasco do shampoo é: " + cor);
 }


}
