package br.com.treinamento.api_springBoot.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {

    private Integer id;
    private String name;
    private String email;

    @JsonIgnore
    private String password;
}
