public class Iphone implements repordutorMusical, AparelhoTelefonico, NavegadorInternet{
  @Override
  public void tocar() {
    System.out.println("Tocando musica!");
  }

  @Override
  public void pausar() {
    System.out.println("Musica pausada");
  }

  @Override
  public void selecionarMusica(final String musica) {
    System.out.println("Selecionadno " + musica);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo ligação");
  }

  @Override
  public void ligar(String numero) {
    System.out.println("Ligando para " + numero);
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba");
  }

  @Override
  public void exibirPagina(String url) {
    System.out.println("Exibindo pagina " + url);
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando Pagina");
  }
}
