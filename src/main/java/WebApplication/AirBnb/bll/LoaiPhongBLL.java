package WebApplication.AirBnb.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebApplication.AirBnb.dao.LoaiPhongDAO;
import WebApplication.AirBnb.model.LoaiPhong;


@Service
public class LoaiPhongBLL {

	@Autowired
	private LoaiPhongDAO repository;

	public LoaiPhong save(LoaiPhong loaiPhong) {
		return repository.saveAndFlush(loaiPhong);
	}

	public LoaiPhong findLoaiPhong(long id) {
		LoaiPhong LoaiPhong = repository.getById(id);
		return LoaiPhong;
	}

	public List<LoaiPhong> findAll() {
		return repository.findAll();
	}

	public LoaiPhong update(LoaiPhong loaiPhong) {
		return repository.saveAndFlush(loaiPhong);
	}

	public void delete(LoaiPhong loaiPhong) {
		repository.delete(loaiPhong);
	}

}
