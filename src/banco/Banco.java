    
package banco;

public class Banco {
    public agencia[] agenciaVet; 
    public cliente[] clienteVet; 
    public conta[] contaVet; 
    public int indiceConta = 0;
    public int indiceCliente = 0;
    public int indiceAgencia = 0;
        
    
    public Banco(int x, int y, int z){   
        agenciaVet = new agencia[x];
        clienteVet = new cliente[y];
        contaVet = new conta[z];
    
    }
    public void cadastrarAgencia(){
        if(indiceAgencia > agenciaVet.length-1){
            System.out.println("Numero maximo de agencias atingido! \n");
        }else{
            agenciaVet[indiceAgencia] = new agencia();
            agenciaVet[indiceAgencia].setEndereco();
            agenciaVet[indiceAgencia].setNumero();
            System.out.println("Agencia Cadastrada! ");
            agenciaVet[indiceAgencia].printAgencia();
            indiceAgencia++;
        }   
        
    }
    public void cadastrarCliente(){
          if(indiceCliente > contaVet.length-1){
              System.out.println("Numero maximo de clientes atingido! \n");
          }else{
            clienteVet[indiceCliente] = new cliente();
            clienteVet[indiceCliente].setNome();
            clienteVet[indiceCliente].setCpf();
            clienteVet[indiceCliente].setTelefone();
            clienteVet[indiceCliente].setCpfIndicou();
            System.out.println("Cliente Cadastrado! ");
            clienteVet[indiceCliente].printCliente();
            indiceCliente++;
          }
     
    }
    public int verificaAgencia(int numAgencia){
        if(indiceAgencia == 0){
            return -1;
        }
        for (int i = 0; i < agenciaVet.length; i++) {
            if(numAgencia == agenciaVet[i].getNumero() && agenciaVet[i] != null){
                return i;
            }
            
        }
        
        return -1;
    }
    public int verificaCliente(int cpf){
        if(indiceCliente == 0){
            return -1;
        }
        for (int i = 0; i < clienteVet.length; i++) {
            if(cpf == clienteVet[i].getCpf() && clienteVet[i] != null){
                return i;
            }
            
        }
        
        return -1;
    
    }
    public void cadastraConta(int numero, int validaAgencia, int validaCliente){
        //instanciar um objeto do tipo conta
        //inicializar os atributos do objeto com os parametros desse metodo
        //implementar um contador
        
        if(validaAgencia != -1 && validaCliente != -1){
            if(indiceConta > contaVet.length-1){
                System.out.println("Numero maximo de contas atingido! \n");
            }else{
                contaVet[indiceConta] = new conta(numero, agenciaVet[validaAgencia], clienteVet[validaCliente]);
                System.out.println("Conta Cadastrada com sucesso! ");
                contaVet[indiceConta].printConta();
                indiceConta++;
            }
        }else{
           System.out.println("Agencia ou cliente nao encontrados! ");
        }
       
    }
    public void listarContaAgencia(int numAgencia){
        if(indiceConta > 0){
            for (int i = 0; i < contaVet.length; i++) {
                if(contaVet[i].getAssociada().getNumero() == numAgencia){
                   System.out.println("Nome do cliente: "+contaVet[i].getClienteConta().getNome());
                   System.out.println("Numero da conta; "+contaVet[i].getNumero());
                }
            }
        }else{
            System.out.println("Nenhuma conta cadastrada! ");
        }
    }
    public void listarContaCliente(int cpf){
        if(indiceConta > 0){
            for (int i = 0; i < contaVet.length; i++) {
                if(cpf == contaVet[i].getClienteConta().getCpf()){
                System.out.println("Numero da agencia: "+contaVet[i].getAssociada().getNumero());
                System.out.println("Numero da conta: "+contaVet[i].getNumero());
                }
            }
        }else{
            System.out.println("Nenhuma conta cadastrada! ");
        }
        
    }
    public void listarClienteAgencia(int numAgencia){
        if(indiceConta > 0){
            for (int i = 0; i < contaVet.length; i++) {
               
                if(numAgencia == contaVet[i].getAssociada().getNumero()){
                    System.out.println("Nome do cliente: "+contaVet[i].getClienteConta().getNome());
                    System.out.println("Telefone do cliente: "+contaVet[i].getClienteConta().getTelefone());
                }
                
                
            
            }
        }else{
            System.out.println("Nenhuma conta cadastrada! ");
        }
    
    }
    public static void main(String[] args) {
        int x, y, z;
        x = Input.readInt("Digite o numero de clientes: ");
        y = Input.readInt("Digite o numero de agencias: ");
        z = Input.readInt("Digite o numero de contas: ");
        Banco banco = new Banco(x, y, z);
       
        /*Variaveis do switch*/
        char op;
        int numConta, numAgencia, numCpf;
        
        op = Input.readChar("\nDigite a opcao desejada:\na - Cadastrar agencia\nb - Cadastrar cliente\nc - Cadastrar Conta\nd - Listar contas por agencia\ne "
                + "- Listar contas por cliente\nf - Listar clientes por agencia\ng - Sair\n");
        while(op != 'g'){
            switch (op){
                case 'a':
                    banco.cadastrarAgencia();
                break;
                case 'b':
                    banco.cadastrarCliente();
                break;
                case 'c':
                    numConta = Input.readInt("Digite o numero da Conta: ");
                    numAgencia = Input.readInt("Digite o numero da Agencia: ");
                    numCpf = Input.readInt("Digite o numero do cpf: ");
                    banco.cadastraConta(numConta, banco.verificaAgencia(numAgencia), banco.verificaCliente(numCpf));
                break;
                case 'd':
                    numAgencia = Input.readInt("Digite o numero da agencia: ");
                    banco.listarContaAgencia(numAgencia);
                break;
                case 'e':
                    numCpf = Input.readInt("Digite o cpf do cliente: ");
                    banco.listarContaCliente(numCpf);
                break;
                case 'f':
                    numAgencia = Input.readInt("Digite o numero da agencia: ");
                    banco.listarClienteAgencia(numAgencia);
                break;
                default:
                    System.out.println("Opcao invalida, tente novamente!\n");
                break;
            }
            op = Input.readChar("\nDigite a opcao desejada:\na - Cadastrar agencia\nb - Cadastrar cliente\nc - Cadastrar Conta\nd - Listar contas por agencia\ne "
                + "- Listar contas por cliente\nf - Listar clientes por agencia\ng - Sair\n\n");
            System.out.println("__________________________________________________________________");
        
        }
    }
    
        
     
}
    


