package WebApplication.AirBnb.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebApplication.AirBnb.dao.QuyenDAO;
import WebApplication.AirBnb.model.Quyen;


@Service
public class QuyenBLL {

	@Autowired
	private QuyenDAO repository;

	public Quyen save(Quyen quyen) {
		return repository.saveAndFlush(quyen);
	}

	public Quyen findQuyen(long id) {
		Quyen quyen = repository.getById(id);
		return quyen;
	}

	public List<Quyen> findAll() {
		return repository.findAll();
	}

	public Quyen update(Quyen quyen) {
		return repository.saveAndFlush(quyen);
	}

	public void delete(Quyen quyen) {
		repository.delete(quyen);
	}

}
