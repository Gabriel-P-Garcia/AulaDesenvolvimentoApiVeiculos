package br.com.treinamento.api_veiculos.dto;

public record AutenticacaoResDTO(
        String token,
        String tipo,      // Geralmente preenchido com "Bearer"
        Long expiracaoEm  // Tempo em milissegundos ou segundos para expirar
) {}
