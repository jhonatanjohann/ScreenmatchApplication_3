package br.com.alura.ScreenmatchApplication_3.service;

public abstract class IConverteDados {
    public abstract <T> T obterDados(String json, Class<T> classe);
}
