package frutas; 
public class Balinha extends Frutas{

public Balinha(String nome, String cor){
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

public void sabor(){
    System.out.println("O sabor dessa balinha é de: " + nome);
}

public void aparencia(){
    System.out.println("O formato dessa balinha é redondo e sua cor é: " + cor);
}

}
