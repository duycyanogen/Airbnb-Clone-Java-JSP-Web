package WebApplication.AirBnb.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebApplication.AirBnb.dao.TaiKhoanDAO;
import WebApplication.AirBnb.model.TaiKhoan;


@Service
public class TaiKhoanBLL {

	@Autowired
	private TaiKhoanDAO repository;

	public TaiKhoan save(TaiKhoan taiKhoan) {
		return repository.saveAndFlush(taiKhoan);
	}

	public TaiKhoan findTaiKhoan(long id) {
		TaiKhoan taiKhoan = repository.getById(id);
		return taiKhoan;
	}

	public List<TaiKhoan> findAll() {
		return repository.findAll();
	}

	public TaiKhoan update(TaiKhoan taiKhoan) {
		return repository.saveAndFlush(taiKhoan);
	}

	public void delete(TaiKhoan taiKhoan) {
		repository.delete(taiKhoan);
	}

}
