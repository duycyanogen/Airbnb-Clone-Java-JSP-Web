package WebApplication.AirBnb.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebApplication.AirBnb.dao.ChiTietTienNghiDAO;
import WebApplication.AirBnb.model.ChiTietTienNghi;
import WebApplication.AirBnb.model.ChiTietTienNghiID;


@Service
public class ChiTietTienNghiBLL {

	@Autowired
	private ChiTietTienNghiDAO repository;

	public ChiTietTienNghi save(ChiTietTienNghi chiTietTienNghi) {
		return repository.saveAndFlush(chiTietTienNghi);
	}

	public ChiTietTienNghi findChiTietTienNghi(ChiTietTienNghiID id) {
		ChiTietTienNghi ChiTietTienNghi = repository.getById(id);
		return ChiTietTienNghi;
	}

	public List<ChiTietTienNghi> findAll() {
		return repository.findAll();
	}

	public ChiTietTienNghi update(ChiTietTienNghi chiTietTienNghi) {
		return repository.saveAndFlush(chiTietTienNghi);
	}

	public void delete(ChiTietTienNghi chiTietTienNghi) {
		repository.delete(chiTietTienNghi);
	}

}
