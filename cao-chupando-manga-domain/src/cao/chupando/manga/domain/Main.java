
package cao.chupando.manga.domain;

import cao.chupando.manga.domain.dao.ICategoriaDAO;
import cao.chupando.manga.domain.dao.list.CategoriaDAOImpl;
import cao.chupando.manga.domain.entidades.Categoria;
import java.util.Scanner;

/**
 *
 * @author will
 */
public class Main {


    public static void main(String[] args) {
        ICategoriaDAO banco = new CategoriaDAOImpl();
        Scanner t = new Scanner(System.in);
        int opcao = 0;
        
        do{
            System.out.println("Menu: ");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Remover");
            System.out.println("4 - Consultar");
            System.out.println("5 - Sair");
            System.out.println("Digite a opcao => ");
            opcao = t.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Cadastrando.....");
                    Categoria nova = new Categoria();
                    System.out.println("Insira o nome Categiria => ");
                    nova.setNome(t.next());
                    try{
                    banco.inserir(nova);
                    System.out.println("Inserido com Sucesso!");
                    }catch(Exception erro){
                        System.out.println(erro.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Atualizando...");
                    System.out.println("Digite o ID => ");
                    Categoria c = new Categoria();
                    c.setId(t.nextInt());
                    System.out.println("Digite o novo atualizado => ");
                    c.setNome(t.next());
                    banco.atualizar(c);
                    System.out.println("Atualzado com Sucesso!");
                    break;
                case 3:
                    System.out.println("Removendo...");
                    System.out.println("Digite o ID => ");
                    banco.remover(t.nextInt());
                    System.out.println("Removido com Sucesso!");
                    break;
                case 4:
                    System.out.println("Listando");
                    for(Categoria ent : banco.consultar()){
                        System.out.println(ent.getId() + " - " + ent.getNome());
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcao Inválida");
            }
            
        } while(opcao != 5);
        
    }
    
}
