package model;

import java.util.*;
import entidade.Cliente;
import java.sql.*;

public class ModelCliente {

	public List<Cliente> MostrarTudo() {
		try {
			List<Cliente> listCliente = new ArrayList<>();
			PreparedStatement cli = Conexao.obterConexao().prepareStatement("select * from clientes");
			ResultSet rs = cli.executeQuery();
			while (rs.next()) {

				Cliente cliente = new Cliente();

				cliente.setCODIGO(rs.getInt("CODIGO"));
				cliente.setNOME(rs.getString("NOME"));
				cliente.setENDERECO(rs.getString("ENDERECO"));
				cliente.setCPF(rs.getString("CPF"));
				cliente.setRG(rs.getString("RG"));
				cliente.setSEXO(rs.getString("SEXO"));
				cliente.setDEVE(rs.getInt("DEVE"));

				listCliente.add(cliente);
			}
			return listCliente;
		} catch (Exception e) {
			return null;
		}
	}

	public Cliente MostrarId(int CODIGO) {
		try {
			Cliente cliente = new Cliente();

			PreparedStatement cli = Conexao.obterConexao().prepareStatement("SELECT * FROM clientes WHERE CODIGO =?");
			cli.setInt(1, CODIGO);

			ResultSet rs = cli.executeQuery();

			while (rs.next()) {

				cliente.setCODIGO(rs.getInt("CODIGO"));
				cliente.setNOME(rs.getString("NOME"));
				cliente.setENDERECO(rs.getString("ENDERECO"));
				cliente.setCPF(rs.getString("CPF"));
				cliente.setRG(rs.getString("RG"));
				cliente.setSEXO(rs.getString("SEXO"));
				cliente.setDEVE(rs.getInt("DEVE"));
			}
			return cliente;
		} catch (Exception e) {
			return null;
		}
	}

	public boolean Cadastrar(Cliente cliente) {
		try {
			PreparedStatement cli = Conexao.obterConexao()
					.prepareStatement("INSERT INTO clientes VALUES (?,?,?,?,?,?,?)");
			cli.setInt(1, cliente.getCODIGO());
			cli.setString(2, cliente.getNOME());
			cli.setString(3, cliente.getENDERECO());
			cli.setString(4, cliente.getCPF());
			cli.setString(5, cliente.getRG());
			cli.setString(6, cliente.getSEXO());
			cli.setInt(7, cliente.getDEVE());

			return cli.executeUpdate() > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean Editar(Cliente cliente) {
		try {
			PreparedStatement cli = Conexao.obterConexao().prepareStatement(
					"UPDATE clientes SET CODIGO=?, NOME=?,ENDERECO=?,CPF=?,RG=?,SEXO=?,DEVE=? where CODIGO=?");
			cli.setInt(1, cliente.getCODIGO());
			cli.setString(2, cliente.getNOME());
			cli.setString(3, cliente.getENDERECO());
			cli.setString(4, cliente.getCPF());
			cli.setString(5, cliente.getRG());
			cli.setString(6, cliente.getSEXO());
			cli.setInt(7, cliente.getDEVE());

			cli.setInt(8, cliente.getCODIGO());

			return cli.executeUpdate() > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean Apagar(Cliente cliente) {
		try {
			PreparedStatement cli = Conexao.obterConexao().prepareStatement("DELETE FROM clientes WHERE CODIGO=?");

			cli.setInt(1, cliente.getCODIGO());
			return cli.executeUpdate() > 0;
		} catch (Exception e) {
			return false;
		}
	}
}
