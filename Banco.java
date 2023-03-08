package banco;

import deposito.Deposito;

public class Banco extends Deposito{

	
	public static void main(String[] args) {
		// Criar um banco

//Funcionalidades

//Saque
//Transferencia 
//Consulta saldo
//Deposito

//utilizar metodos se possível herança 

//Se o cliente não tiver saldo nao pode transferir ou sacar
//Se o cliente fizer um deposito o valor do saldo deve aumentar
//Se o cliente fizer um saque o valor do saldo deve diminuir

		System.out.println("Funções:");
		Deposito deposito = new Deposito();

		deposito.saque();
		deposito.transferencia();
		deposito.consultasaldo();
		deposito.deposito();

		System.out.println("\n");

		double saldoCliente, depósito, Saque, transferência, saldotransferencia, saldosaque, saquedeposito;
		saldoCliente = 500.00;

		depósito = 100.00 + saldoCliente;
		saquedeposito = saldoCliente + depósito;

		Saque = 100.00;
		saldosaque = saldoCliente - Saque;

		transferência = saldoCliente - 50.00;
		saldotransferencia = saldoCliente - transferência;

		// 1 Saque |2 Transferência | 3 Consulta Saldo|4 Deposito

		int opcao = 1;
		switch (opcao) {

		case 1:
			System.out.println("Você escolheu a opção:(1) \nValor de Saque: " + Saque);

			if (Saque > 0) {

				System.out.println("Saque realizado com sucesso");
				System.out.println("Saldo em conta: " + saldosaque);
			} else {
				System.out.println("Saque Negado procure o seu banco");

			}

			break;

		case 2:
			System.out.println("Você escolheu a opção: (2)\nValor de Transferência: " + saldotransferencia);

			if (saldoCliente > 0) {

				System.out.println("Transferência realizada com sucesso");
				System.out.println("Saldo em conta: " + transferência);
			} else {
				System.out.println("Transferência negada procure o seu banco");

			}

			break;

		case 3:
			System.out.println("Você escolheu a opção: (3)\nConsulta Saldo: " + saldoCliente);

			if (saldoCliente > 0) {

				System.out.println("Consulta de Saldo realizada com sucesso");
			} else {
				System.out.println("Sem saldo não pode transferir ou sacar");

			}

			break;
		default:
			System.out.println("opção inválida");
			break;
		case 4:
			System.out.println("Você escolheu a opção (4) Depósito \nValor de Depósito: " + depósito);
			System.out.println("Saldo em conta: " + saquedeposito);

			if (saldoCliente > 0) {

				System.out.println("Deposito realizado com sucesso");
			} else {
				System.out.println("Deposito negado procure o seu banco");

			}

			break;

		}

	}

}

