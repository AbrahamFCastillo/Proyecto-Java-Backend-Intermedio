package com.exception;

public class JugadorNoEncontradoException extends ErrorTiempoEjecucion {
    public JugadorNoEncontradoException(long id) {
        super("El jugador no existe", "ERR_PLAYER_NOT_FOUND", id);
    }
}
