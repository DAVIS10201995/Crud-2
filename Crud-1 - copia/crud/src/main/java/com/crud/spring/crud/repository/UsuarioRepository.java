package com.crud.spring.crud.repository;

import com.crud.spring.crud.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
