package frutas;
public abstract  class Frutas {

    protected String nome;
    protected String cor;

    public Frutas(String nome, String cor){
        this.nome=nome;
        this.cor=cor;   
    }
       
    public abstract  void tipo();

    //public abstract void preco(); 

}
