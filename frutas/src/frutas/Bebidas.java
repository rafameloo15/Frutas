package frutas;
public class Bebidas extends Frutas{

public Bebidas(String nome, String cor){
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

public void suco(){
    System.out.println("O suco que darramou no chão era de: " + nome);
}

public void cafe(){
    System.out.println("O cafe é da cor " + cor + " ou marrom avermelhado");
}

}
