package com.api_planejamento.demo.InsumoCultura;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizaIC(
    @NotNull
    Long id,
    int quantidade_ha,
    Long id_cultura,
    Long id_insumo
) {

}
