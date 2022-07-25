import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2026, Month.JUNE, 5);
		
//		int anos = olimpiadasRio.getYear() - hoje.getYear();
//		System.out.println(anos);
		
//		Period periodo = Period.between(hoje, olimpiadasRio);
//		System.out.println(periodo.getDays());
		
		LocalDate proximasOli = olimpiadasRio.plusDays(4);
//		System.out.println(proximasOli);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String format = proximasOli.format(formatador);
		System.out.println(format);
		
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		
	}

}
