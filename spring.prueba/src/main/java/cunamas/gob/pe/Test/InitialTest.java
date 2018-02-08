package cunamas.gob.pe.Test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import cunamas.gob.pe.Dao.OperacionesDao;
import cunamas.gob.pe.Dao.OperacionesDaoImpl;
import cunamas.gob.pe.Service.OperacionesService;
import cunamas.gob.pe.Service.OperacionesServiceImpl;
import cunamas.gob.pe.dto.OperacionesDto;

public class InitialTest{
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	
	
	@Test
	public void test1() {
		OperacionesService operacionesService=new OperacionesServiceImpl();
		OperacionesDao operacionesDao=new OperacionesDaoImpl();
		OperacionesDto dto=new OperacionesDto();
		dto.setN1(2);
		dto.setN2(1);
		dto.setOperacion("/");
		operacionesService.setDao(operacionesDao);
		int resultado=operacionesService.resultado(dto);
		
		System.out.println(resultado);
	}

	@Test(expected = ArithmeticException.class)
    public void testDivisionWithException() {
		OperacionesService operacionesService=new OperacionesServiceImpl();
		OperacionesDao operacionesDao=new OperacionesDaoImpl();
		OperacionesDto dto=new OperacionesDto();
		dto.setN1(2);
		dto.setN2(1);
		dto.setOperacion("/");
		operacionesService.setDao(operacionesDao);
		int resultado=operacionesService.resultado(dto);
    }
}
