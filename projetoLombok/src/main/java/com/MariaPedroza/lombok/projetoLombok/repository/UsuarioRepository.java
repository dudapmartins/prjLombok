package com.MariaPedroza.lombok.projetoLombok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MariaPedroza.lombok.projetoLombok.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>  {

}
