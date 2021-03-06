package br.projeto_desafio_versao2.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.projeto_desafio_versao2.DAO.AnunciaDAO;
import br.projeto_desafio_versao2.modelo.Anuncia;
import br.projeto_desafio_versao2.modelo.Produto;
import br.projeto_desafio_versao2.modelo.Usuario;
import br.projeto_desafio_versao2.util.JPAUtil;

public class TestaAnuncioDAOaltera {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		// TODO Auto-generated method stub
		Anuncia anuncio = new Anuncia();
		anuncio.setId(4);
		anuncio.setValoraluguelhora(1300);
		anuncio.setData(Calendar.getInstance());
		
		Usuario usr1 = new Usuario();
		usr1.setId(1);
		anuncio.setUsuario(usr1);
		
		Produto prd1 = new Produto();
		prd1.setId(3);
		anuncio.setProduto(prd1);
		
		AnunciaDAO anunciaDAO = new AnunciaDAO(em);
		try {
			anunciaDAO.AnunciaAlterar(anuncio);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
