package WebApplication.AirBnb.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebApplication.AirBnb.dao.ThongTinLoaiPhongDAO;
import WebApplication.AirBnb.model.ThongTinLoaiPhong;


@Service
public class ThongTinLoaiPhongBLL {

	@Autowired
	private ThongTinLoaiPhongDAO repository;

	public ThongTinLoaiPhong save(ThongTinLoaiPhong thongTinLoaiPhong) {
		return repository.saveAndFlush(thongTinLoaiPhong);
	}

	public ThongTinLoaiPhong findThongTinLoaiPhong(long id) {
		ThongTinLoaiPhong thongTinLoaiPhong = repository.getById(id);
		return thongTinLoaiPhong;
	}

	public List<ThongTinLoaiPhong> findAll() {
		return repository.findAll();
	}

	public ThongTinLoaiPhong update(ThongTinLoaiPhong thongTinLoaiPhong) {
		return repository.saveAndFlush(thongTinLoaiPhong);
	}

	public void delete(ThongTinLoaiPhong thongTinLoaiPhong) {
		repository.delete(thongTinLoaiPhong);
	}

}
