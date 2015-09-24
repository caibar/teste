package br.com.investimento;

import java.math.BigDecimal;
import java.util.Calendar;

public final class Investimento {

	private final BigDecimal valorInicial;
	private final double percentualJurosAnual;
	private final Calendar dataAplicacao;
	private final Calendar dataResgate;

	protected Investimento(BigDecimal valorInicial, double percentualJurosAnual, Calendar dataAplicacao,
			Calendar dataResgate) {
		this.valorInicial = valorInicial;
		this.percentualJurosAnual = percentualJurosAnual;
		this.dataAplicacao = dataAplicacao;
		this.dataResgate = dataResgate;
	}

}
