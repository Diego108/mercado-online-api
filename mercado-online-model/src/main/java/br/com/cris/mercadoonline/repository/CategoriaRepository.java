package br.com.cris.mercadoonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cris.mercadoonline.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

	public List<Categoria> findByCategoriaPai(Categoria idPai);
}
