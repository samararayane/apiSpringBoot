package br.com.treinamento.api_springBoot.services;

import br.com.treinamento.api_springBoot.domain.User;
import br.com.treinamento.api_springBoot.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO obj);

    User update(UserDTO obj);
}
