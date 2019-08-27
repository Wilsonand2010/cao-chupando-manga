/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cao.chupando.manga.domain.dao.postgresql;

import cao.chupando.manga.domain.dao.ICategoriaDAO;
import cao.chupando.manga.domain.entidades.Categoria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author will
 */
public class CategoriaDAOImplPostegreSQL implements ICategoriaDAO{

    private Connection criaConexao(){
        Connection conexao = null;
        try{
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/manga", "postgres", "123");
        } catch(Exception erro){
            erro.printStackTrace();
        }
        return conexao;
    }
    
    public void inserir(Categoria ent) {
        Connection con = criaConexao();
        
        String sql = "insert into categoria (nome)" + "VALUES('"+ent.getNome()+"')";
        try {
            con.createStatement().execute(sql);
        } catch(Exception erro){
            erro.printStackTrace();
        }
    }

    @Override
    public void atualizar(Categoria ent) {
        Connection con = criaConexao();
        String sql = "update categoria set " + "nome = ? where id = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ent.getNome());
            ps.setInt(2, ent.getId());
            ps.execute();
            ps.close();
            con.close();
        } catch(Exception erro){
            erro.printStackTrace();
        }
    }

    @Override
    public void remover(int id) {
        Connection con = criaConexao();
        String sql = "delete from categoria where id ="+id;
        try{
            con.createStatement().execute(sql);
            
        } catch(Exception erro){
            erro.printStackTrace();
        }
    }

    @Override
    public List<Categoria> consultar() {
        try{
           List<Categoria> lista = new ArrayList<>();
           
           String sql = "select * from categoria";
           Connection con = criaConexao();
           
           ResultSet res = con.createStatement().executeQuery(sql);
           
           while(res.next()){
               Categoria c = new Categoria();
               c.setId(res.getInt("id"));
               c.setNome(res.getString("nome"));
               lista.add(c);
           }
           
           return lista;
        }catch(Exception erro){
            erro.printStackTrace();
        }
        
        return null;
    }
    
    
    
}
