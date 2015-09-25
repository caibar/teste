package br.com.investimento;

import java.math.BigDecimal;
import java.util.Calendar;

public final class Investimento {

	private final BigDecimal valorInicial;
	private final double percentualJurosAnual;
	private final Calendar dataAplicacao;
	private final Calendar dataResgate;

	/*
	 * public static class InvestimentoBuilder {
	 * 
	 * private BigDecimal valorInicial; private double percentualJurosAnual;
	 * private Calendar dataAplicacao; private Calendar dataResgate;
	 * 
	 * private InvestimentoBuilder() { }
	 * 
	 * public static InvestimentoBuilder create() { return new
	 * InvestimentoBuilder(); }
	 * 
	 * public InvestimentoBuilder comValorInicial(BigDecimal valor) {
	 * this.valorInicial = valor; return this; }
	 * 
	 * public InvestimentoBuilder comPercentualJurosAnual(double
	 * percentualJurosAnual) { this.percentualJurosAnual = percentualJurosAnual;
	 * return this; }
	 * 
	 * public InvestimentoBuilder comDataAplicacao(Calendar dataAplicacao) {
	 * this.dataAplicacao = dataAplicacao; return this; }
	 * 
	 * public InvestimentoBuilder comDataResgate(Calendar dataResgate) {
	 * this.dataResgate = dataResgate; return this; }
	 * 
	 * public Investimento builder() { return new Investimento(this); } }
	 * 
	 * private Investimento(InvestimentoBuilder builder) { this.valorInicial =
	 * builder.valorInicial; this.percentualJurosAnual =
	 * builder.percentualJurosAnual; this.dataAplicacao = builder.dataAplicacao;
	 * this.dataResgate = builder.dataResgate; }
	 */

	public Investimento(BigDecimal valorInicial, double percentualJurosAnual, Calendar dataAplicacao,
			Calendar dataResgate) {
		this.valorInicial = valorInicial;
		this.percentualJurosAnual = percentualJurosAnual;
		this.dataAplicacao = dataAplicacao;
		this.dataResgate = dataResgate;
	}

	public BigDecimal getValorInicial() {
		return valorInicial;
	}

	public double getPercentualJurosAnual() {
		return percentualJurosAnual;
	}

	public Calendar getDataAplicacao() {
		return dataAplicacao;
	}

	public Calendar getDataResgate() {
		return dataResgate;
	}

}
