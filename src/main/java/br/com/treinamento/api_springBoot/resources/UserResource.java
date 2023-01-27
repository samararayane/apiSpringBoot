package br.com.treinamento.api_springBoot.resources;

import br.com.treinamento.api_springBoot.config.ModelMapperConfig;
import br.com.treinamento.api_springBoot.domain.User;
import br.com.treinamento.api_springBoot.domain.dto.UserDTO;
import br.com.treinamento.api_springBoot.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    protected ModelMapper modelMapper;

    @Autowired
    private ModelMapperConfig mapper;

    @Autowired
    private UserService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(modelMapper.map(service.findById(id), UserDTO.class));
    }
}
