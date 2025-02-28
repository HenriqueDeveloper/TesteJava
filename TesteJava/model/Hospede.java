public class Hospede {
    public String nome;
    public String endereco;
    public String documento;
    public Contato contato;

    public Hospede(){
        this.contato = new Contato();
    }
    public Hospede(String nome){
        this.contato = new Contato();
        this.nome = nome;
    }
    public void exibeDados(){
        System.out.println("Nome do Hospede: "+ this.nome);
        System.out.println("Nome do Endereço: "+ this.endereco);
        System.out.println("Nome do CPF: "+ this.documento);
        System.out.println("Nome do Contato: "+ this.contato);
    }
}
