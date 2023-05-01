package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente objCliente = new Cliente(JOptionPane.showInputDialog("Digite o nome:"), 
				Integer.parseInt(JOptionPane.showInputDialog(17)), 
				Double.parseDouble(JOptionPane.showInputDialog(17.55)));
		Endereco objEndereco = new Endereco();
		Telefone objTelefone = new Telefone();
		
		objCliente.setEndereco(objEndereco);
		objCliente.setTelefone(objTelefone);
		
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o Logradouro: "));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da residência")));
		objEndereco.setBairro(JOptionPane.showInputDialog("Digite o Bairro: "));
		objEndereco.setMunicipio(JOptionPane.showInputDialog("Digite o Município: "));
		objEndereco.setEstado(JOptionPane.showInputDialog("Digite o Estado: "));
		objEndereco.setNacionalidade(JOptionPane.showInputDialog("Digite o país: "));
		
		objTelefone.setFixo(JOptionPane.showInputDialog("Digite o Telefone Fixo: "));
		objTelefone.setCelular(JOptionPane.showInputDialog("Digite o Número de Celular: "));
		objTelefone.setComercial(JOptionPane.showInputDialog("Digite o Telefone Comercial: "));
		objTelefone.setContato(JOptionPane.showInputDialog("Digite o Contato: "));
		
		System.out.println("Nome do Cliente: " + objCliente.getNome() + 
						   "\nIdade: " + objCliente.getIdade() + " anos" +
						   "\nPeso: " + objCliente.getPeso() + "Kg" +
						   "\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
						   "\nNúmero: " + objCliente.getEndereco().getNumero() +
						   "\nBairro: " + objCliente.getEndereco().getBairro() +
						   "\nMunicípio: " + objCliente.getEndereco().getMunicipio() +
						   "\nEstado: " + objCliente.getEndereco().getEstado() +
						   "\nNacionalidade: " + objCliente.getEndereco().getNacionalidade() +
						   "\n" + "\nNúmeros para Contato: " +
						   "\nFixo: " + objCliente.getTelefone().getFixo() +
						   "\nCelular: " + objCliente.getTelefone().getCelular() +
						   "\nComercial: " + objCliente.getTelefone().getComercial() +
						   "\nContato: " + objCliente.getTelefone().getContato());
	}
}
