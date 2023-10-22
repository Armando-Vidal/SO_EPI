import java.util.List;
import java.util.ArrayList;

public class bcp
{
    int contadorQuantum, contadorPrograma, tempodeEspera, interrupcoes;
    int X, Y;
    int count_ln = 1;
    boolean finalizado = false;
    String nomeTeste;
	String estadoProcesso;
    int nomePrograma;
    List<String> comandos = new ArrayList<>();

    //construtor
	public bcp(List<String> comandos, String nome){
		this.comandos = comandos; //lista de comandos do arquivo
        this.nomePrograma = Integer.parseInt(nome.replace(".txt", "")); //nome do arquivo (01, 02, etc.)
		this.estadoProcesso = "Pronto"; //estado variável entre "Pronto" e "Bloqueado"
        this.tempodeEspera = 2; //Tempo de espera para bloqueados
        this.nomeTeste = comandos.get(0); //Nome do Teste ("Teste-1", "Teste-2", etc)
	}

    //função para realizar um comando
    public void fazComando(){
        //Identifica uma linha que de comando COM
        if(comandos.get(count_ln).equals("COM")){
            contadorPrograma++;
            contadorQuantum++;
        }
        //Identifica uma linha que se inicia com 'X' ou 'Y'
        else if(Character.compare(comandos.get(count_ln).charAt(0), 'X') == 0){
            X = Integer.parseInt(comandos.get(count_ln).replaceAll("[^0-9]", ""));
            contadorPrograma++;
            contadorQuantum++;
        }
        else if(Character.compare(comandos.get(count_ln).charAt(0), 'Y') == 0){
            Y = Integer.parseInt(comandos.get(count_ln).replaceAll("[^0-9]", ""));
            contadorPrograma++;
            contadorQuantum++;
        }
        //Identifica E/S
        else if(comandos.get(count_ln).equals("E/S")){
            contadorPrograma++;
            contadorQuantum++;
            estadoProcesso = "Bloqueado";
        }
        //Identifica SAIDA na última linha
        else if(comandos.get(count_ln).equals("SAIDA")){
            finalizado = true;
            contadorPrograma++;
            contadorQuantum++;
        }
        count_ln++;
    }
}