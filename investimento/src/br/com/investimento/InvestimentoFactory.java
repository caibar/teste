package br.com.investimento;

import java.math.BigDecimal;
import java.util.Calendar;

public class InvestimentoFactory {

	private BigDecimal valorInicial;
	private double percentualJurosAnual;
	private Calendar dataAplicacao;
	private Calendar dataResgate;

	private InvestimentoFactory() {
	}

	public static InvestimentoFactory create() {
		return new InvestimentoFactory();
	}

	public InvestimentoFactory comValorInicial(BigDecimal valor) {
		this.valorInicial = valor;
		return this;
	}

	public InvestimentoFactory comPercentualJurosAnual(double percentualJurosAnual) {
		this.percentualJurosAnual = percentualJurosAnual;
		return this;
	}

	public InvestimentoFactory comDataAplicacao(Calendar dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
		return this;
	}

	public InvestimentoFactory comDataResgate(Calendar dataResgate) {
		this.dataResgate = dataResgate;
		return this;
	}

	public Investimento builder() {
		return new Investimento(valorInicial, percentualJurosAnual, dataAplicacao, dataResgate);
	}
}
