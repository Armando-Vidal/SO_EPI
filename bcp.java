import java.util.List;
import java.util.ArrayList;

public class bcp
{
    int contadorQuantum, contadorPrograma, tempodeEspera;
    int X, Y;
    int count_ln = 1;
    boolean finalizado = false;
    String nomeTeste;
	String estadoProcesso;
    int nomePrograma;
    int quantum;
    List<String> comandos = new ArrayList<>(); 

	public bcp(List<String> comandos, String nome){
		this.comandos = comandos;
        this.nomePrograma = Integer.parseInt(nome.replace(".txt", ""));
		this.estadoProcesso = "Pronto";
        this.nomeTeste = comandos.get(0);
	}

    public void fazComando(){
        //while(count_ln < 21){
            if(comandos.get(count_ln).equals("COM")){
                contadorPrograma++;
                contadorQuantum++;
                System.out.println(nomeTeste + " COM");
            }
            //Identifica uma linha que se inicia com 'X' ou 'Y'
            else if(Character.compare(comandos.get(count_ln).charAt(0), 'X') == 0){
                System.out.println(nomeTeste + " X");
                X = Integer.parseInt(comandos.get(count_ln).replaceAll("[^0-9]", ""));
                contadorPrograma++;
                contadorQuantum++;
            }
            else if(Character.compare(comandos.get(count_ln).charAt(0), 'Y') == 0){
                System.out.println(nomeTeste + " Y");
                Y = Integer.parseInt(comandos.get(count_ln).replaceAll("[^0-9]", ""));
                contadorPrograma++;
                contadorQuantum++;
            }
            //Identifica entradas e saídas
            else if(comandos.get(count_ln).equals("E/S")){
                System.out.println(nomeTeste + " E/S");
                contadorPrograma++;
                contadorQuantum++;
                estadoProcesso = "Bloqueado";
                //break;
            }
            //Identifica SAIDA na última linha
            else if(comandos.get(count_ln).equals("SAIDA")){
                System.out.println(nomeTeste + " SAIDA");
                finalizado = true;
                contadorPrograma++;
                contadorQuantum++;
                //break;
            }
            System.out.println("Contador programa/Quatum " + nomeTeste + ": " + contadorPrograma + "/" + contadorQuantum);
            count_ln++;
        //}
    }

    /*
    //sobrescrevendo a lista de processos
    public String toString()
    {
		return nomePrograma + " - PC: [" + contadorPrograma + "/" + textodoPrograma.size() + "] - Tempo Espera: " + tempodeEspera + " - Estado: " + estadoProcesso + "\n";
	}
    
    //setando os registradores
    public int getRegistradorX()
    {
		return this.registradores[0];
	}

	public int getRegistradorY()
    {
		return this.registradores[1];
	}

	public void setRegistradorX(int x)
    {
		this.registradores[0] = x;
	}

	public void setRegistradorY(int y)
    {
		this.registradores[1] = y;
	}

    //setando o contador
    public int getContador()
    {
		return this.contadorPrograma;
	}

	public void setContador(int valor)
    { 
		this.contadorPrograma = valor;
	}
    
    public void aumentaContador()
    { 
		this.contadorPrograma++;
	}

    //setando o tempo de espera
    public int gettempodeEspera()
    {
        return this.tempodeEspera;
    }
    
    public void settempodeEspera(int tempo)
    { 
        this.tempodeEspera = tempo++;
    }
    
    public void diminuitempodeEspera()
    {
        this.tempodeEspera--;
    }

    //setando o estado do processo
	public void setestadoProcesso(String novoEstado)
    {
		estadoProcesso = novoEstado;
	}

    //pegando nome do programa e do arquivo
	public String getnomePrograma()
    {
		return this.nomePrograma;
	}

	public int getnomeArquivo()
    {
		return nomeArquivo;
	}
     */

}