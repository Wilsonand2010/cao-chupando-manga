/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.EditoraManga;
import java.util.List;

/**
 *
 * @author aluno
 */
public interface IEditoraMangaDAO {
    
    public void inserir(EditoraManga ent);
    public void atualizar(EditoraManga ent);
    public void remover(int id);
    public List<EditoraManga> consultar();
}
