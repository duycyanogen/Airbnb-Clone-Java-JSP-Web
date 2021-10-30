package WebApplication.AirBnb.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebApplication.AirBnb.dao.DiaDiemDAO;
import WebApplication.AirBnb.model.DiaDiem;


@Service
public class DiaDiemBLL {

	@Autowired
	private DiaDiemDAO repository;

	public DiaDiem save(DiaDiem diaDiem) {
		return repository.saveAndFlush(diaDiem);
	}

	public DiaDiem findDiaDiem(long id) {
		DiaDiem DiaDiem = repository.getById(id);
		return DiaDiem;
	}

	public List<DiaDiem> findAll() {
		return repository.findAll();
	}

	public DiaDiem update(DiaDiem diaDiem) {
		return repository.saveAndFlush(diaDiem);
	}

	public void delete(DiaDiem diaDiem) {
		repository.delete(diaDiem);
	}

}
