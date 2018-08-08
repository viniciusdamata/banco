package banco.modelo;
public class agencia {
    public int numero;
    public String endereco;

    public agencia() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero() {
       numero = Input.readInt("Digite numero da agencia: ");
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco() {
        endereco = Input.readString("Digite o endereco da agencia: ");
    }
    public void printAgencia(){
        System.out.println("Numero da agencia: "+getNumero());
        System.out.println("Endereco da agencia: "+getEndereco());
        System.out.println("-------------------------------------\n");
       
    }
    
    
}
