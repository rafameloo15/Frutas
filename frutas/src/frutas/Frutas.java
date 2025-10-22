package frutas;
public class Frutas {

    protected String nome;
    protected String cor;

    public Frutas(String nome, String cor){
        this.nome=nome;
        this.cor=cor;   
    }
       
    public void tipo(){
        System.out.println("O nome dessa fruta é: " + nome);
        System.out.println("A cor da fruta é: " + cor);
    }


}
