
public class Main {
    public static void main(String[] args) {
        Controller iphone = new Controller();
        
         // Testando funções do reprodutor musical do Iphone
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        // Testando funções do aparelho telefônico do Iphone
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando funções do navegador de internet do Iphone
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
