package br.com.investimento;

import java.math.BigDecimal;
import java.util.Calendar;

public final class InvestimentoBuilder {

	private BigDecimal valorInicial;
	private double percentualJurosAnual;
	private Calendar dataAplicacao;
	private Calendar dataResgate;

	public InvestimentoBuilder comValorInicial(BigDecimal valor) {
		this.valorInicial = valor;
		return this;
	}

	public InvestimentoBuilder comPercentualJurosAnual(double percentualJurosAnual) {
		this.percentualJurosAnual = percentualJurosAnual;
		return this;
	}

	public InvestimentoBuilder comDataAplicacao(Calendar dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
		return this;
	}

	public InvestimentoBuilder comDataResgate(Calendar dataResgate) {
		this.dataResgate = dataResgate;
		return this;
	}

	public Investimento builder() {
		return new Investimento(valorInicial, percentualJurosAnual, dataAplicacao, dataResgate);
	}
}
