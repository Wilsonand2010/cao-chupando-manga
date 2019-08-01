/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.Capitulo;
import java.util.List;

/**
 *
 * @author aluno
 */
public interface ICapituloDAO {
    
    public void inserir(Capitulo ent);
    public void atualizar(Capitulo ent);
    public void remover(int id);
    public List<Capitulo> consultar();
}
