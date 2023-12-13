package com.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorTiempoEjecucion extends Exception {
    private String codigo;
    private Object detalles;

    public ErrorTiempoEjecucion(String mensaje, String codigo, Object detalles) {
        super(mensaje);
        this.codigo = codigo;
        this.detalles = detalles;
    }
}
