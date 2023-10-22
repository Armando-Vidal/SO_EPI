import java.util.ArrayList;
import java.util.List;

public class tabela_processos {
    List<bcp> tabela = new ArrayList<>();;
    int index_com;

    public void addBCP(bcp bloco){
        this.tabela.add(bloco);
    }
    public void removeBCP(bcp bloco){
        for(int i = 0; i < tabela.size(); i++){
            if(tabela.get(i) == bloco){
                tabela.remove(i);
            }
        }
    }
    public bcp getBCP(int index){
        return tabela.get(index);
    }
}
