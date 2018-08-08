
package banco.modelo;


public class conta {
    public int numero;
    public agencia agenciaAssociada;
    public cliente clienteConta;

    public conta() {
    }

    public conta(int numero, agencia agenciaAssociada, cliente clienteConta) {
        this.numero = numero;
        this.agenciaAssociada = agenciaAssociada;
        this.clienteConta = clienteConta;
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public agencia getAssociada() {
        return agenciaAssociada;
    }

    public void setAssociada(agencia agenciaAssociada) {
        this.agenciaAssociada = agenciaAssociada;
    }

    public cliente getClienteConta() {
        return clienteConta;
    }

    public void setClienteConta(cliente clienteConta) {
        this.clienteConta = clienteConta;
    }
    public void printConta(){
        System.out.println("Numero da conta: "+getNumero());
        System.out.println("Numero da Agencia: "+getAssociada().getNumero());
        System.out.println("Nome do cliente: "+getClienteConta().getNome());
        System.out.println("cpf do cliente: "+getClienteConta().getCpf());
        System.out.println("-----------------------------------------\n\n");
    }
    
    
}
