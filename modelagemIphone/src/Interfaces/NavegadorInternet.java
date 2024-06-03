package Interfaces;
public interface NavegadorInternet {
  default void adicionarNovaAba() {}

  default void exibirPagina(String url) {}

  default void atualizarPagina() {}
}
