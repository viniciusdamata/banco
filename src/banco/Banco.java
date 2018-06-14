    
package banco;

public class Banco {
    public agencia[] agenciaVet; 
    public cliente[] clienteVet; 
    public conta[] contaVet; 
        
    
    public Banco(int x, int y, int z){   
        agenciaVet = new agencia[x];
        clienteVet = new cliente[y];
        contaVet = new conta[z];
    
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
    public boolean verificaAgencia(int numAgencia, int i){
        if(i == 0 && numAgencia != agenciaVet[i].getNumero()){
          return false;
        }
        else if(numAgencia == agenciaVet[i].getNumero()){
          return true;   
        }
            return verificaAgencia(numAgencia, i-1);
    }
    public boolean verificaCliente(int cpf, int i){
        if(i == 0 && cpf != clienteVet[i].getCpf()){
            return false;
        }
        else if(cpf == clienteVet[i].getCpf()){
            return true;
        }
            return verificaCliente(cpf, i-1);
    }
    public void verificarDados(int numAgencia, int conta, int cpf){
            if(verificaAgencia(numAgencia, agenciaVet.length-1)){
                if(verificaCliente(cpf, agenciaVet.length-1)){
                    cadastraConta(numAgencia, conta, cpf);
                }
                else{
                    System.out.println("Cliente nao encontrado! tente novamente");
                }
            }
            else{
                System.out.println("Agencia nao encontrada! tente novamente");
            }
    }
    public void cadastraConta(int numAgencia, int conta, int cpf){
        /*Continuar daqui*/
        for (int i = 0; i < contaVet.length; i++) {
            
            
        }
    }
    public static void main(String[] args) {
        Banco banco = new Banco(Input.readInt("Digite o numero de clientes: "),
        Input.readInt("Digite o numero de agencias: "),Input.readInt("Digite o numero de contas: "));
       }
    
        
     
}
    


