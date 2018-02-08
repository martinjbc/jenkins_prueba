package cunamas.gob.pe.Service;

import cunamas.gob.pe.Dao.OperacionesDao;
import cunamas.gob.pe.dto.OperacionesDto;

public interface OperacionesService {
	int resultado(OperacionesDto dto);
	void setDao(OperacionesDao d);
}
