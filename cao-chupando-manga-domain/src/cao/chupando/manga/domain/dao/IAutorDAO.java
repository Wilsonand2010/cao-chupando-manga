/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.Autor;
import java.util.List;

/**
 *
 * @author aluno
 */
public interface IAutorDAO {
    
    public void inserir(Autor ent);
    public void atualizar(Autor ent);
    public void remover(int id);
    public List<Autor> consultar();
    
}
