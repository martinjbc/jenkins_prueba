package cunamas.gob.pe.Dao;

import org.springframework.stereotype.Component;

import cunamas.gob.pe.dto.OperacionesDto;
@Component
public class OperacionesDaoImpl implements OperacionesDao {

	@Override
	public int resultado(OperacionesDto dto) {
		int resultado;
		if(dto.getOperacion().equals("+")) {
			resultado=dto.getN1()+dto.getN2();
		}else if(dto.getOperacion().equals("-")) {
			resultado=dto.getN1()-dto.getN2();
		}else if(dto.getOperacion().equals("/")) {
			resultado=dto.getN1()/dto.getN2();
		}else if(dto.getOperacion().equals("x")) {
			resultado=dto.getN1()*dto.getN2();
		}else {
			resultado=0;
		}
		return resultado;
	}

}
