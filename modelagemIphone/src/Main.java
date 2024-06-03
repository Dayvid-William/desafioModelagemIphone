
public class Main {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        
        iphone.selecionarMusica("Graveto - Marilha Mendonça");
        iphone.tocar();
        iphone.pausar();

        iphone.atender();
        iphone.ligar("+55 21 998877665");
        iphone.iniciarCorreioVoz();

        iphone.adicionarNovaAba();
        iphone.exibirPagina("Google");
        iphone.atualizarPagina();
    }
}
