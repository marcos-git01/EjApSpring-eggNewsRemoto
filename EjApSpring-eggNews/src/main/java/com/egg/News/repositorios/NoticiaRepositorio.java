
package com.egg.News.repositorios;

import com.egg.News.entidades.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepositorio extends JpaRepository<Noticia, String>{
    
    @Query("SELECT n FROM Noticia n WHERE n.tiulo = :titulo")
    public Noticia buscarPorTitulo(@Param("titulo") String titulo);       
       
}