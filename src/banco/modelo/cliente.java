
package banco.modelo;


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
    public void printCliente(){
        System.out.println("Nome do cliente: "+getNome());
        System.out.println("Telefone do cliente: "+getTelefone());
        System.out.println("cpf do cliente: "+getCpf());
        System.out.println("cpf de quem indicou: "+getCpfIndicou());
        System.out.println("--------------------------------------\n");
    }
    
    
    
    
}
