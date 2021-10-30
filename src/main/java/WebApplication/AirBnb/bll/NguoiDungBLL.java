package WebApplication.AirBnb.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebApplication.AirBnb.dao.NguoiDungDAO;
import WebApplication.AirBnb.model.NguoiDung;


@Service
public class NguoiDungBLL {

	@Autowired
	private NguoiDungDAO repository;

	public NguoiDung save(NguoiDung nguoiDung) {
		return repository.saveAndFlush(nguoiDung);
	}

	public NguoiDung findNguoiDung(long id) {
		NguoiDung NguoiDung = repository.getById(id);
		return NguoiDung;
	}

	public List<NguoiDung> findAll() {
		return repository.findAll();
	}

	public NguoiDung update(NguoiDung nguoiDung) {
		return repository.saveAndFlush(nguoiDung);
	}

	public void delete(NguoiDung nguoiDung) {
		repository.delete(nguoiDung);
	}

}
