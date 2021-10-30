package WebApplication.AirBnb.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebApplication.AirBnb.dao.TienNghiDAO;
import WebApplication.AirBnb.model.TienNghi;


@Service
public class TienNghiBLL {

	@Autowired
	private TienNghiDAO repository;

	public TienNghi save(TienNghi Tin) {
		return repository.saveAndFlush(Tin);
	}

	public TienNghi findTienNghi(long id) {
		TienNghi tienNghi = repository.getById(id);
		return tienNghi;
	}

	public List<TienNghi> findAll() {
		return repository.findAll();
	}

	public TienNghi update(TienNghi tienNghi) {
		return repository.saveAndFlush(tienNghi);
	}

	public void delete(TienNghi tienNghi) {
		repository.delete(tienNghi);
	}

}
