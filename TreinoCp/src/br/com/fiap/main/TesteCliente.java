package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente objCliente = new Cliente(JOptionPane.showInputDialog("Digite o nome:"), 
				Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:")), 
				Double.parseDouble(JOptionPane.showInputDialog("Digite o peso:")));
		
		Endereco objEndereco = new Endereco(JOptionPane.showInputDialog("Digite o Logradouro: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número da residência")),
				JOptionPane.showInputDialog("Digite o CEP: "),
				JOptionPane.showInputDialog("Digite o Bairro: "),
				JOptionPane.showInputDialog("Digite o Município: "),
				JOptionPane.showInputDialog("Digite o Estado: "),
				JOptionPane.showInputDialog("Digite o país: "));
		
		Telefone objTelefone = new Telefone(JOptionPane.showInputDialog("Digite o Telefone Fixo: "),
				JOptionPane.showInputDialog("Digite o Número de Celular: "),
				JOptionPane.showInputDialog("Digite o Telefone Comercial: "),
				JOptionPane.showInputDialog("Digite o Contato: "));
		
		objCliente.setEndereco(objEndereco);
		objCliente.setTelefone(objTelefone);
		
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
