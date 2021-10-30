package WebApplication.AirBnb.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebApplication.AirBnb.dao.KhuyenMaiDAO;
import WebApplication.AirBnb.model.KhuyenMai;


@Service
public class KhuyenMaiBLL {

	@Autowired
	private KhuyenMaiDAO repository;

	public KhuyenMai save(KhuyenMai khuyenMai) {
		return repository.saveAndFlush(khuyenMai);
	}

	public KhuyenMai findKhuyenMai(long id) {
		KhuyenMai KhuyenMai = repository.getById(id);
		return KhuyenMai;
	}

	public List<KhuyenMai> findAll() {
		return repository.findAll();
	}

	public KhuyenMai update(KhuyenMai khuyenMai) {
		return repository.saveAndFlush(khuyenMai);
	}

	public void delete(KhuyenMai khuyenMai) {
		repository.delete(khuyenMai);
	}

}
