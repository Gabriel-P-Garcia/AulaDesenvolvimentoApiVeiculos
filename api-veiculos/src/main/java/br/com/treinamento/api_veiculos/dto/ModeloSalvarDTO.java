package br.com.treinamento.api_veiculos.dto;

import java.math.BigDecimal;

public record ModeloSalvarDTO(
        String nome,
        BigDecimal valor,
        Long idMontadora
) {}
