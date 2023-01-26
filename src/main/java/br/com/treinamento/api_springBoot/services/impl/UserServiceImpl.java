package br.com.treinamento.api_springBoot.services.impl;

import br.com.treinamento.api_springBoot.domain.User;
import br.com.treinamento.api_springBoot.repositories.UserRepository;
import br.com.treinamento.api_springBoot.services.UserService;
import br.com.treinamento.api_springBoot.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
    }
}
