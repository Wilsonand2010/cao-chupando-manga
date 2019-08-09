
package cao.chupando.manga.domain.dao.list;

import cao.chupando.manga.domain.dao.ICategoriaDAO;
import cao.chupando.manga.domain.entidades.Categoria;
import java.util.ArrayList;
import java.util.List;



public class CategoriaDAOImpl implements ICategoriaDAO{
    
    
    private static List<Categoria> categorias = new ArrayList<>();
    private static int lastId = 1;

    public void inserir(Categoria ent) {
        if(ent == null){
            throw new NullPointerException();
        }
        if(categorias.contains(ent))
        {
            throw new RuntimeException("Valor Repetido !!! ");
        }
        ent.setId(lastId);
        lastId++;
        categorias.add(ent);
    }


    public void atualizar(Categoria ent) {
        
        for (int i = 0; i < categorias.size(); i++) {
            Categoria get = categorias.get(i);
            if(ent.getId() == get.getId()){
                if(!categorias.contains(ent)){
                    categorias.set(i, ent);
                }
            }
        }
        
    }


    public void remover(int id) {
        for (int i = 0; i < categorias.size(); i++) {
            Categoria get = categorias.get(i);
            if(get.getId() == id){
                categorias.remove(i);
            }
            
        }
    }


    public List<Categoria> consultar() {
        return categorias;
    }
    
    
    
 
    
    
}
