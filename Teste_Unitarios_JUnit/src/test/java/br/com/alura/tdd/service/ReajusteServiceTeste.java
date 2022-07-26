package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

class ReajusteServiceTeste {

	private ReajusteService service;
	private Funcionario funcionario;

	@BeforeEach
	public void inicializar() {
		System.out.println("inicializado");
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Thiago", LocalDate.now(), new BigDecimal("1000.00"));
	}

	@AfterEach
	public void finalizado() {
		System.out.println("fim");
	}

	@BeforeAll
	public static void antesDeTodos() {
		System.out.println("Ante de todos!!");
	}

	@AfterAll
	public static void depoisDeTodos() {
		System.out.println("Depois de Todos!!");
	}

	@Test
	public void reajusteDeveriaSerTresPorCentoQuandoEstaAbaixo() {
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDezPorCentoQuandoEstaMedio() {
		service.concederReajuste(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("1100.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerVintePorCentoQuandoEstaAlto() {
		service.concederReajuste(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}

}
