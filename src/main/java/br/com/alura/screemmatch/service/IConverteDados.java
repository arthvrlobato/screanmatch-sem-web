package br.com.alura.screemmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);

}
