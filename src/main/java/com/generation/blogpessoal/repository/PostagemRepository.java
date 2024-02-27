package com.generation.blogpessoal.repository;

import com.generation.blogpessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

    //Métodos personalizados utilizando o JPA
    //SELECT * FROM tb_postagens WHERE titulo LIKE "%titulo%"
    List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);

    List<Postagem> findAllOrderByDataDesc();

}
