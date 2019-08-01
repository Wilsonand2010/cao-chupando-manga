/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.Categoria;
import java.util.List;

/**
 *
 * @author aluno
 */
public interface ICategoriaDAO {
    
    public void inserir(Categoria ent);
    public void atualizar(Categoria ent);
    public void remover(int id);
    public List<Categoria> consultar();
}
