package cunamas.gob.pe.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cunamas.gob.pe.Dao.OperacionesDao;
import cunamas.gob.pe.dto.OperacionesDto;

@Service
public class OperacionesServiceImpl implements OperacionesService {

	@Autowired
	OperacionesDao operacionesDao;
	
	@Override
	public int resultado(OperacionesDto dto) {
		try {
			return operacionesDao.resultado(dto);
		}catch(Exception ex) {
			System.out.println(ex);
			return 0;
		}
		
		
	}

}
