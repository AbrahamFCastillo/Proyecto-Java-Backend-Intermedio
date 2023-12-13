package com.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

//Como recibir la data
@Data
public class CrearJugadorDTO {
    //validacion spring
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String nickname;
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
