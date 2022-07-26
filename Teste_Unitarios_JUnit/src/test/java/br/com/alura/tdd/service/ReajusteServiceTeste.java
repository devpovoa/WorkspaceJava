package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

class ReajusteServiceTeste {

	@Test
	public void reajusteDeveriaSerTresPorCentoQuandoEstaAbaixo() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Thiago", LocalDate.now(), new BigDecimal("1000.00"));

		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDezPorCentoQuandoEstaMedio() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Thiago", LocalDate.now(), new BigDecimal("1000.00"));

		service.concederReajuste(funcionario, Desempenho.BOM);

		assertEquals(new BigDecimal("1100.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerVintePorCentoQuandoEstaAlto() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Thiago", LocalDate.now(), new BigDecimal("1000.00"));

		service.concederReajuste(funcionario, Desempenho.OTIMO);

		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}

}
