import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class logfile
{
    static void gravarLog(int quantum, String log)
    {
        String numQuantum;

        if (quantum < 10)
        {
            numQuantum = "0" + quantum;
        }
        else
        {
            numQuantum = Integer.toString(quantum);
        }
        
        String arquivoLog = "log" + numQuantum + ".txt";

    }
}
/*
Incluir:
numero medio de trocas de processo(média calculada sobre todos os processos, do numero de vezes em q cada processo foi interrompido):
numero medio de instruções executadas por quantum (media calculada sobre todos os processos, do numero de instrucoes executadas ate o processo ser interrompido– uma media das instrucoes executadas em cada quantum, levando em conta o conjunto de todos os processos)
numero do quantum: ok
*/