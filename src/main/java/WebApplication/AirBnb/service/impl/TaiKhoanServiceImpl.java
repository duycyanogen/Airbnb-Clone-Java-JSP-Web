package WebApplication.AirBnb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import WebApplication.AirBnb.domain.NguoiDung;
import WebApplication.AirBnb.domain.Quyen;
import WebApplication.AirBnb.domain.TaiKhoan;
import WebApplication.AirBnb.model.TaiKhoanDTO;
import WebApplication.AirBnb.model.User_AccountDTO;
import WebApplication.AirBnb.repository.NguoiDungDAO;
import WebApplication.AirBnb.repository.TaiKhoanDAO;
import WebApplication.AirBnb.service.TaiKhoanBLL;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanBLL {
	@Autowired
	private TaiKhoanDAO repository;
	@Autowired
	private NguoiDungDAO repository1;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public <S extends TaiKhoan> S save(S entity) {
		entity.setPassword(bCryptPasswordEncoder.encode(entity.getPassword()));
		return repository.save(entity);
	}

	@Override
	public boolean register(User_AccountDTO useracc) {
		try {
			TaiKhoan entity = new TaiKhoan();
			entity.setMail(useracc.getMail());			
			entity.setPassword(bCryptPasswordEncoder.encode(useracc.getPassword()));
			Quyen quyen = new Quyen();
			quyen.setIDQuyen(2l);
			entity.setQuyen(quyen);
			repository.save(entity);
			NguoiDung entity1 = new NguoiDung();
			entity1.setTen(useracc.getTen());
			entity1.setSDT(useracc.getSDT());
			entity1.setDiaChi(useracc.getDiaChi());
			entity1.setGioiTinh(useracc.getGioiTinh());
			entity1.setNgaySinh(useracc.getNgaySinh());
			entity1.setCCCD(useracc.getCCCD());
			entity1.setAnhDaiDien(useracc.getAnhDaiDien());
			// BeanUtils.copyProperties(nd, entity1);
			entity1.setTaiKhoan(entity);
			repository1.save(entity1);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public User_AccountDTO login(TaiKhoanDTO account) {
		try {
			User_AccountDTO result = new User_AccountDTO();
			result = repository.getUserAccountByMail(account.getMail());
			if (result != null) {
				if (bCryptPasswordEncoder.matches(account.getPassword(), result.getPassword()))
					return result;
				else
					return null;
			} else
				return null;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public <S extends TaiKhoan> Optional<S> findOne(Example<S> example) {
		return repository.findOne(example);
	}

	@Override
	public Page<TaiKhoan> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public List<TaiKhoan> findAll() {
		return repository.findAll();
	}

	@Override
	public List<TaiKhoan> findAll(Sort sort) {
		return repository.findAll(sort);
	}

	@Override
	public List<TaiKhoan> findAllById(Iterable<Long> ids) {
		return repository.findAllById(ids);
	}

	@Override
	public Optional<TaiKhoan> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public <S extends TaiKhoan> List<S> saveAll(Iterable<S> entities) {
		return repository.saveAll(entities);
	}

	@Override
	public void flush() {
		repository.flush();
	}

	@Override
	public <S extends TaiKhoan> S saveAndFlush(S entity) {
		return repository.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Long id) {
		return repository.existsById(id);
	}

	@Override
	public <S extends TaiKhoan> List<S> saveAllAndFlush(Iterable<S> entities) {
		return repository.saveAllAndFlush(entities);
	}

	@Override
	public <S extends TaiKhoan> Page<S> findAll(Example<S> example, Pageable pageable) {
		return repository.findAll(example, pageable);
	}

	@Override
	public void deleteInBatch(Iterable<TaiKhoan> entities) {
		repository.deleteInBatch(entities);
	}

	@Override
	public <S extends TaiKhoan> long count(Example<S> example) {
		return repository.count(example);
	}

	@Override
	public <S extends TaiKhoan> boolean exists(Example<S> example) {
		return repository.exists(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<TaiKhoan> entities) {
		repository.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return repository.count();
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		repository.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(TaiKhoan entity) {
		repository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		repository.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		repository.deleteAllInBatch();
	}

	@Override
	public TaiKhoan getOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public void deleteAll(Iterable<? extends TaiKhoan> entities) {
		repository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

	@Override
	public TaiKhoan getById(Long id) {
		return repository.getById(id);
	}

	@Override
	public <S extends TaiKhoan> List<S> findAll(Example<S> example) {
		return repository.findAll(example);
	}

	@Override
	public <S extends TaiKhoan> List<S> findAll(Example<S> example, Sort sort) {
		return repository.findAll(example, sort);
	}

}
