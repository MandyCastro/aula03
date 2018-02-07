package test.br.edu.impacta.ads;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.edu.impacta.ads.Contato;
import br.edu.impacta.ads.ContatoDaoArquivo;

public class ContatoTest {

	ContatoDaoArquivo cdao;
	Contato contato;
	List<Contato> contatoL;
	
	@Before
	public void setData(){
		cdao = new ContatoDaoArquivo("contatos.txt");
		contato = new Contato("Renato", "123");
	}

	@Test
	public void testTest() {
		cdao.inserir(contato);
		assertTrue("O contato não foi adicionado.", cdao.existe(contato));
	}
	
	public void testAmanda() {
		
		int qtd = contatoL.size();
		cdao.gravar(contatoL);
		int qtd2 =	cdao.lerTodos().size() ;
		assertTrue("O contato nao foi salvo.", qtd != qtd2)  ;
	}
}
