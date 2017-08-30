package javacodigo;

import modelo.cliente;


/**
 * Aqui e apresentado o conceito de encapsulamento ou seja esconder a regra de negocio !  pivate and public  getter and setter 
 * isso e encapsulamento !
 * @author Israel
 *construtores devem ter o mesmo nome da classe.
 */

public class Conta {

	private int numero;
	private double saldo;
	private double limite;
	cliente titular;
	private static int numeroIncremental = 1;
	
	
	public Conta(int numero,double limite){
		this.numero = numero;
		this.limite = limite;
	}
	
	public Conta(){
		this.numero = numeroIncremental;
		numeroIncremental++;
	}

	public void saca(double valor) {

		if (valor > this.saldo) {
			System.out.println("saque invalido");
		} else {
			this.saldo = this.saldo - valor;
		}
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;

	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setLimite(double novoLimite){
		 this.limite = novoLimite;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public int getNumeroIncremental(){
		return this.numeroIncremental;
	}
}
