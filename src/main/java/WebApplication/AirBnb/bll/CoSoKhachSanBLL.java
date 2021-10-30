package WebApplication.AirBnb.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebApplication.AirBnb.dao.CoSoKhachSanDAO;
import WebApplication.AirBnb.model.CoSoKhachSan;


@Service
public class CoSoKhachSanBLL {

	@Autowired
	private CoSoKhachSanDAO repository;

	public CoSoKhachSan save(CoSoKhachSan coSoKhachSan) {
		return repository.saveAndFlush(coSoKhachSan);
	}

	public CoSoKhachSan findCoSoKhachSan(long id) {
		CoSoKhachSan CoSoKhachSan = repository.getById(id);
		return CoSoKhachSan;
	}

	public List<CoSoKhachSan> findAll() {
		return repository.findAll();
	}

	public CoSoKhachSan update(CoSoKhachSan coSoKhachSan) {
		return repository.saveAndFlush(coSoKhachSan);
	}

	public void delete(CoSoKhachSan coSoKhachSan) {
		repository.delete(coSoKhachSan);
	}

}
