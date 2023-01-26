package br.com.treinamento.api_springBoot.services;

import br.com.treinamento.api_springBoot.domain.User;

public interface UserService {

    User findById(Integer id);
}
