//Persist�ncia de dados (delete, update, insert)

package Cadastro;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDao extends Dao {
	
	public void incluirPessoa(Pessoa p) throws Exception {
		open(); //abre o banco
		stmt = con.prepareStatement("insert into pessoa values(?,?,?)"); //cada ? � um campo
		stmt.setInt(1, p.getIdPessoa());
		stmt.setString(2, p.getNomePessoa());
		stmt.setString(3, p.getEmail());
		stmt.execute(); //executar
		stmt.close(); //fecha a conex�o
		close();
	}

	
	public void alterarPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("update Pessoa set nomepessoa = ?, email = ? where idpessoa = ?");
		stmt.setString(1, p.getNomePessoa());
		stmt.setString(2, p.getEmail());
		stmt.setInt(3, p.getIdPessoa());
		stmt.execute();
		stmt.close();
		close();
	}

	public void excluirPessoa(Pessoa p) throws Exception {

		open();
		stmt = con.prepareStatement("delete from Pessoa where idPessoa = ?");
		stmt.setInt(1, p.getIdPessoa());
		stmt.execute();
		stmt.close();
		close();

	}
	// retornando um objeto
	public Pessoa consultarPessoaIndividual(int cod) throws Exception {
		open();
		stmt = con.prepareStatement("select * from pessoa where idPessoa = ? ");
		stmt.setInt(1, cod);
			rs = stmt.executeQuery();			
		Pessoa p = null;
		if (rs != null) {
			if (rs.next()) {
				p = new Pessoa();
				p.setIdPessoa(rs.getInt("idPessoa"));
				p.setNomePessoa(rs.getString("nomePessoa"));
				p.setEmail(rs.getString("email"));				
			}
		}
		close();
		return p;
}

	public List<Pessoa> ListarPessoas() {
		try { //pode dar problema
			open();
			stmt = con.prepareStatement("select * from pessoa");
			rs = stmt.executeQuery();
	        List<Pessoa> listaPessoas = new ArrayList<>();
			while (rs.next()) {
				Pessoa p = new Pessoa();
				p.setIdPessoa(rs.getInt("idPessoa"));
				p.setNomePessoa(rs.getString("nomePessoa"));
				p.setEmail(rs.getString("email"));
				listaPessoas.add(p);
			}
			close();
			return listaPessoas;
			
		} catch (Exception e) { //se deu problema retorna essa mesangem
			System.out.println(e.getMessage());
			return null;
		}
	}
}