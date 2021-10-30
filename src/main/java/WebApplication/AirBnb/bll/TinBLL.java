package WebApplication.AirBnb.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebApplication.AirBnb.dao.TinDAO;
import WebApplication.AirBnb.model.Tin;

@Service
public class TinBLL {

	@Autowired
	private TinDAO repository;

	public Tin save(Tin Tin) {
		return repository.saveAndFlush(Tin);
	}

	public Tin findTin(long id) {
		Tin tin = repository.getById(id);
		return tin;
	}

	public List<Tin> findAll() {
		return repository.findAll();
	}

	public Tin update(Tin tin) {
		return repository.saveAndFlush(tin);
	}

	public void delete(Tin tin) {
		repository.delete(tin);
	}

}
