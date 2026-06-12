package br.com.treinamento.api_veiculos.dto;

import java.math.BigDecimal;

public record ModeloRespostaDTO(
        Long id,
        String nome,
        BigDecimal valor,
        Long idMontadora,
        String nomeMontadora
) {}
