package WebApplication.AirBnb.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebApplication.AirBnb.dao.ChiTietLoaiGiuongDAO;
import WebApplication.AirBnb.model.ChiTietLoaiGiuong;
import WebApplication.AirBnb.model.ChiTietLoaiGiuongID;


@Service
public class ChiTietLoaiGiuongBLL {

	@Autowired
	private ChiTietLoaiGiuongDAO repository;

	public ChiTietLoaiGiuong save(ChiTietLoaiGiuong chiTietLoaiGiuong) {
		return repository.saveAndFlush(chiTietLoaiGiuong);
	}

	public ChiTietLoaiGiuong findChiTietLoaiGiuong(ChiTietLoaiGiuongID id) {
		ChiTietLoaiGiuong ChiTietLoaiGiuong = repository.getById(id);
		return ChiTietLoaiGiuong;
	}

	public List<ChiTietLoaiGiuong> findAll() {
		return repository.findAll();
	}

	public ChiTietLoaiGiuong update(ChiTietLoaiGiuong chiTietLoaiGiuong) {
		return repository.saveAndFlush(chiTietLoaiGiuong);
	}

	public void delete(ChiTietLoaiGiuong chiTietLoaiGiuong) {
		repository.delete(chiTietLoaiGiuong);
	}

}
