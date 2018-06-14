package banco;
public class agencia {
    public int numero;
    public String endereco;

    public agencia() {
    }

    public agencia(int numero, String endereco) {
        this.numero = numero;
        this.endereco = endereco;
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
    
    
}
