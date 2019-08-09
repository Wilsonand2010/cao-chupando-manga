
package controller;

import cao.chupando.manga.domain.dao.ICategoriaDAO;
import cao.chupando.manga.domain.dao.list.CategoriaDAOImpl;
import cao.chupando.manga.domain.entidades.Categoria;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/categoria")
public class CategoriaController {

    private ICategoriaDAO banco = new CategoriaDAOImpl();
    
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    
    public String index(){
        return "\"teste\"";
    }
    
    @GET
    @Path("/select/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Categoria select(@PathParam("id") int pk){
        System.out.println("Parametro:"+pk);
        for(Categoria cat : banco.consultar()){
            if(cat.getId() == pk)
                return cat;
        }
        return null;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/cadastrar/{nome}")
    public String cadastrar(@PathParam("nome") String nome){
        System.out.println("Cadastrando ...");
        Categoria nova = new Categoria();
        nova.setNome(nome);
        banco.inserir(nova);
        String ret = "{\"status\":1}";
        return ret;
    }
}

