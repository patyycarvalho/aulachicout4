package br.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex4 {
    public static void main(String[] args) {
        String nomeArquivo = "meuarquivo.txt";
        int contadorLinhas = 0;

        try {
            // Abre o arquivo para leitura
            BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));

            // Lê cada linha do arquivo e incrementa o contador
            String linha = null;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
                contadorLinhas++;
            }

            // Fecha o BufferedReader
            reader.close();

            // Exibe o número de linhas no console
            System.out.println("O arquivo " + nomeArquivo + " contém " + contadorLinhas + " linhas.");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}