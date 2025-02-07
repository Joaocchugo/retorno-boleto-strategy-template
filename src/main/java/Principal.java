import java.nio.file.Path;

public class Principal {
    public static void main(String[] args) {
        Path caminhoArquivoBB = Path.of("banco-brasil-1.csv");
        Path caminhoArquivoBradesco = Path.of("bradesco-1.csv");

        // Processa Banco do Brasil
        ProcessadorBoletos processadorBB = new ProcessadorBoletos(new LeituraRetornoBancoBrasil());
        processadorBB.processar(caminhoArquivoBB.toUri());

        System.out.println("\n============================\n");

        // Processa Bradesco
        ProcessadorBoletos processadorBradesco = new ProcessadorBoletos(new LeituraRetornoBradesco());
        processadorBradesco.processar(caminhoArquivoBradesco.toUri());
    }
}










