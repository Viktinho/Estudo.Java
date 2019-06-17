package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Conexao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Jframe extends JFrame {

	private JPanel contentPane;
	private JTextField txtCODIGO;
	private JTextField txtNOME;
	private JTextField txtENDERECO;
	private JTextField txtCPF;
	private JTextField txtRG;
	private JTextField txtSEXO;
	private JTextField txtDEVE;

	/**
	 * Inicia o aplicativo.
	 */
	Connection con = null;
	PreparedStatement cli = null;
	ResultSet rs = null;

	private void LimparTexts() {
		txtCODIGO.setText(null);
		txtNOME.setText(null);
		txtENDERECO.setText(null);
		txtCPF.setText(null);
		txtRG.setText(null);
		txtSEXO.setText(null);
		txtDEVE.setText(null);

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe frame = new Jframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Cria o frame.
	 */
	public Jframe() {
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750, 350, 360, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_7 = new JLabel("Menu de clientes");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setToolTipText("");
		lblNewLabel_7.setBounds	(110, 10, 100, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel = new JLabel("Código:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setToolTipText("aaaaaaa");
		lblNewLabel.setBounds	(10, 45, 89, 14);
		contentPane.add(lblNewLabel);

		txtCODIGO = new JTextField();
		txtCODIGO.setBounds		(88, 45, 125, 20);
		contentPane.add(txtCODIGO);
		txtCODIGO.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds	(10, 70, 89, 14);
		contentPane.add(lblNewLabel_1);

		txtNOME = new JTextField();
		txtNOME.setBounds		(88, 70, 235, 20);
		contentPane.add(txtNOME);
		txtNOME.setColumns(10);		
		
		JLabel lblNewLabel_2 = new JLabel("Endereço:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 95, 89, 14);
		contentPane.add(lblNewLabel_2);

		txtENDERECO= new JTextField();
		txtENDERECO.setBounds(88, 95, 235, 20);
		contentPane.add(txtENDERECO);
		txtENDERECO.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CPF:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 120, 89, 14);
		contentPane.add(lblNewLabel_3);

		txtCPF = new JTextField();
		txtCPF.setBounds		(88, 120, 235, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("RG:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds	(10, 145, 89, 14);
		contentPane.add(lblNewLabel_4);

		txtRG = new JTextField();
		txtRG.setBounds		(88, 145, 235, 20);
		contentPane.add(txtRG);
		txtRG.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Sexo:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds	(10, 170, 89, 14);
		contentPane.add(lblNewLabel_5);

		txtSEXO = new JTextField();
		txtSEXO.setBounds		(88, 170, 235, 20);
		contentPane.add(txtSEXO);
		txtSEXO.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Deve:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds	(10, 195, 89, 14);
		contentPane.add(lblNewLabel_6);

		txtDEVE = new JTextField();
		txtDEVE.setBounds		(88, 195, 235, 20);
		contentPane.add(txtDEVE);
		txtDEVE.setColumns(10);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PreparedStatement cli = Conexao.obterConexao().prepareStatement("SELECT * FROM clientes WHERE CODIGO = ?");

					cli.setString(1, txtCODIGO.getText());
					rs = cli.executeQuery();

					if (rs.next()) {
						txtCODIGO.setText(rs.getString("CODIGO"));
						txtNOME.setText(rs.getString("NOME"));
						txtENDERECO.setText(rs.getString("ENDERECO"));
						txtCPF.setText(rs.getString("CPF"));
						txtRG.setText(rs.getString("RG"));
						txtSEXO.setText(rs.getString("SEXO"));
						txtDEVE.setText(rs.getString("DEVE"));
						con.close();
					} else {
						JOptionPane.showMessageDialog(null, "Código não encontrado");
					}

				} catch (Exception e1) {
				}
			}
		});
		btnBuscar.setBounds(220, 43, 101, 23);
		contentPane.add(btnBuscar);

		JButton btnInserir = new JButton("Cadastrar");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				con = Conexao.obterConexao();
				try {
					PreparedStatement cli = Conexao.obterConexao().prepareStatement("INSERT INTO clientes VALUES(?,?,?,?,?,?,?)");
					cli.setString(1, txtCODIGO.getText());
					cli.setString(2, txtNOME.getText());
					cli.setString(3, txtENDERECO.getText());
					cli.setString(4, txtCPF.getText());
					cli.setString(5, txtRG.getText());
					cli.setString(6, txtSEXO.getText());
					cli.setString(7, txtDEVE.getText());

					int resultado = cli.executeUpdate();
					if (resultado > 0) {
						JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
						LimparTexts();
						con.close();
					} else {
						JOptionPane.showMessageDialog(null, "Erro ao cadastrar novo cliente!");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados!");
				}
			}

		});
		btnInserir.setBounds(70, 255, 100, 23);
		contentPane.add(btnInserir);

		JButton btnAlterar = new JButton("Atualizar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				con = Conexao.obterConexao();
				try {
					PreparedStatement cli = Conexao.obterConexao().prepareStatement(
							"UPDATE clientes SET NOME=?, ENDERECO=?, CPF=?, RG=?, SEXO=?, DEVE=? where CODIGO = ?");

					cli.setString(1, txtNOME.getText());
					cli.setString(2, txtENDERECO.getText());
					cli.setString(3, txtCPF.getText());
					cli.setString(4, txtRG.getText());
					cli.setString(5, txtSEXO.getText());
					cli.setString(6, txtDEVE.getText());
					cli.setString(7, txtCODIGO.getText());

					int resultado = cli.executeUpdate();
					if (resultado > 0) {
						JOptionPane.showMessageDialog(null, "Dados do cadastro atualizados com sucesso!");
						LimparTexts();
						con.close();
					} else {
						JOptionPane.showMessageDialog(null, "Erro ao atualizar cadastro!");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados!");
				}
			}
		});
		btnAlterar.setBounds(70, 225, 100, 23);
		contentPane.add(btnAlterar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con = Conexao.obterConexao();
				try {
					PreparedStatement cli = Conexao.obterConexao().prepareStatement("DELETE FROM clientes WHERE CODIGO = ?");

					cli.setString(1, txtCODIGO.getText());

					int resultado = cli.executeUpdate();
					if (resultado > 0) {
						JOptionPane.showMessageDialog(null, "Cadastro exclúido com sucesso!");
						LimparTexts();
						con.close();
					} else {
						JOptionPane.showMessageDialog(null, "Erro ao excluir cadastro!");
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados");
				}
			}
		});
		btnExcluir.setBounds(200, 225, 100, 23);
		contentPane.add(btnExcluir);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
			}
		});
		btnSair.setBounds(200, 255, 100, 23);
		contentPane.add(btnSair);
	}
}
