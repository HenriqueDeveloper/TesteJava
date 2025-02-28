public class MainApp{
    public static void main(String[]args){
        Hospede Henrique = new Hospede("Henrique Alencar");
        Henrique.endereco = "Rua Claudino Barbosa";
        Henrique.documento = "514.206.908-09";
        Henrique.contato.email = "henriquealencar23062006@gmail.com";
        Henrique.contato.celular = "11958341342";
        
        Henrique.exibeDados();
    }
}