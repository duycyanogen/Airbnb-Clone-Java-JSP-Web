package WebApplication.AirBnb.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebApplication.AirBnb.dao.LoaiGiuongDAO;
import WebApplication.AirBnb.model.LoaiGiuong;


@Service
public class LoaiGiuongBLL {

	@Autowired
	private LoaiGiuongDAO repository;

	public LoaiGiuong save(LoaiGiuong loaiGiuong) {
		return repository.saveAndFlush(loaiGiuong);
	}

	public LoaiGiuong findLoaiGiuong(long id) {
		LoaiGiuong LoaiGiuong = repository.getById(id);
		return LoaiGiuong;
	}

	public List<LoaiGiuong> findAll() {
		return repository.findAll();
	}

	public LoaiGiuong update(LoaiGiuong loaiGiuong) {
		return repository.saveAndFlush(loaiGiuong);
	}

	public void delete(LoaiGiuong loaiGiuong) {
		repository.delete(loaiGiuong);
	}

}
