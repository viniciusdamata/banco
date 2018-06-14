    
package banco;

public class Banco {
    public agencia[] agenciaVet; 
    public cliente[] clienteVet; 
    public conta[] contaVet; 
        
    
    public Banco(int x, int y, int z){   
        agenciaVet = new agencia[x];
        clienteVet = new cliente[y];
        contaVet = new conta[z];
       /* for (int i = 0; i < agenciaVet.length; i++) {;
            agenciaVet[i] = new agencia();
        }
        for (int i = 0; i < clienteVet.length; i++) {
            clienteVet[i] = new cliente();
        }
        for (int i = 0; i < contaVet.length; i++) {
            contaVet[i] = new conta();
            
        }*/
    }
    public void cadastrarAgencia(){
        for (int i = 0; i < agenciaVet.length; i++) {
            agenciaVet[i] = new agencia();
            agenciaVet[i].setEndereco();
            agenciaVet[i].setNumero();
            
        }
    }
    public void cadastrarCliente(){
        for (int i = 0; i < clienteVet.length; i++) {
            clienteVet[i] = new cliente();
            clienteVet[i].setNome();
            clienteVet[i].setCpf();
            clienteVet[i].setTelefone();
            clienteVet[i].setCpfIndicou();
        }
    }
    
    public void cadastrarConta(int numAgencia, int conta, int cpf){
            
        
        
    }
    public static void main(String[] args) {
        Banco banco = new Banco(Input.readInt("Digite o numero de clientes: "),
        Input.readInt("Digite o numero de agencias: "),Input.readInt("Digite o numero de contas: "));
       }
    
        
     
}
    


