package br.com.fiap.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.fiap.models.ProdutoModel;

@Component
public class ProdutoRepository {

	private List<ProdutoModel> produtos;
	
	public ProdutoRepository() {
		produtos = new ArrayList<ProdutoModel>();
		produtos.add(
			new ProdutoModel(1,"Nome do Produto 1", "Sku-0001", "Descrição do produto 1" , 1000.90, "Detalhes 1, 2, 4 do produto 1" ));
		
		produtos.add(
			new ProdutoModel(2,"Nome do Produto 2", "Sku-0002", "Descrição do produto 2" , 2000.90, "Detalhes 1, 2, 4 do produto 2" ));
			
		produtos.add(
			new ProdutoModel(3,"Nome do Produto 3", "Sku-0003", "Descrição do produto 3" , 3000.90, "Detalhes 1, 2, 4 do produto 3" ));
			
		produtos.add(
			new ProdutoModel(4,"Nome do Produto 4", "Sku-0004", "Descrição do produto 4" , 4000.90, "Detalhes 1, 2, 4 do produto 4" ));
			
	}
	
	
	public List<ProdutoModel> get(){
		return this.produtos;
	}
	
	public ProdutoModel get(long id) {
		if ( id == 1 ) {
			return 
				new ProdutoModel(1,"Nome do Produto 1", "Sku-0001", "Descrição do produto 1" , 1000.90, "Detalhes 1, 2, 4 do produto 1" );
		} else {
			return 
				new ProdutoModel(2,"Nome do Produto 2", "Sku-0002", "Descrição do produto 2" , 2000.90, "Detalhes 1, 2, 4 do produto 2" );
		}
	}
	
	
	public int newProduct(ProdutoModel produtoModel) {
		System.out.println("Inserindo um novo produto");
		System.out.println(produtoModel.getNome());
		System.out.println(produtoModel.getSku());
		
		return (int)(Math.random()*100);
	}
	
	
	
}
