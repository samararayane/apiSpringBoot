package br.com.treinamento.api_springBoot.repositories;

import br.com.treinamento.api_springBoot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
