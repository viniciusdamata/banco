
package banco;


public class cliente {
    public String nome;
    public int telefone;
    public int cpf;
    public int cpfIndicou;

    public cliente() {
    }

    public cliente(String nome, int telefone, int cpf, int cpfIndicou) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.cpfIndicou = cpfIndicou;
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        nome = Input.readString("Digite o nome do cliente: ");
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone() {
        telefone = Input.readInt("Digite o telefone do cliente: ");
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf() {
       cpf = Input.readInt("Digite o cpf: ");
    }

    public int getCpfIndicou() {
        return cpfIndicou;
    }

    public void setCpfIndicou() {
        cpfIndicou = Input.readInt("Digite o cpf de quem indicou o cliente, se houver: ");
    }
    
    
    
    
}
