/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.Manga;
import java.util.List;

/**
 *
 * @author aluno
 */
public interface IMangaDAO {
    
    public void inserir(Manga ent);
    public void atualizar(Manga ent);
    public void remover(int id);
    public List<Manga> consultar();
}
