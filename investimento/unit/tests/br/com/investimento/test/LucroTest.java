package br.com.investimento.test;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

import br.com.investimento.Investimento;
import br.com.investimento.InvestimentoFactory;

public class LucroTest {

	@Test
	public void test() {
//		Investimento investimento = Investimento.InvestimentoBuilder.create()
//				.comValorInicial(BigDecimal.valueOf(1000.00d))
//				.comPercentualJurosAnual(0.2)
//				.comDataAplicacao(new GregorianCalendar(2014, Calendar.AUGUST, 25))
//				.comDataResgate(new GregorianCalendar(2014, Calendar.AUGUST, 25))
//				.builder();

		Investimento investimento = InvestimentoFactory.create()
				.comValorInicial(BigDecimal.valueOf(1000.00d))
				.comPercentualJurosAnual(0.2)
				.comDataAplicacao(new GregorianCalendar(2014, Calendar.AUGUST, 25))
				.comDataResgate(new GregorianCalendar(2014, Calendar.AUGUST, 25))
				.builder();
		
		Assert.assertNotNull(investimento);
	}

}
