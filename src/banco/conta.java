
package banco;


public class conta {
    public int numero;
    public int agenciaAssociada;
    public int cpf;

    public conta() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAssociada() {
        return agenciaAssociada;
    }

    public void setAssociada(int agencia) {
        this.agenciaAssociada = agencia;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    
}
