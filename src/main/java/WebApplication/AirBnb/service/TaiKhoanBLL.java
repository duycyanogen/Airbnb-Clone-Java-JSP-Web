package WebApplication.AirBnb.service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import WebApplication.AirBnb.domain.TaiKhoan;
import WebApplication.AirBnb.model.TaiKhoanDTO;
import WebApplication.AirBnb.model.User_AccountDTO;


public interface TaiKhoanBLL {

	<S extends TaiKhoan> List<S> findAll(Example<S> example, Sort sort);

	<S extends TaiKhoan> List<S> findAll(Example<S> example);

	TaiKhoan getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends TaiKhoan> entities);

	TaiKhoan getOne(Long id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(TaiKhoan entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	long count();

	void deleteAllInBatch(Iterable<TaiKhoan> entities);

	<S extends TaiKhoan> boolean exists(Example<S> example);

	<S extends TaiKhoan> long count(Example<S> example);

	void deleteInBatch(Iterable<TaiKhoan> entities);

	<S extends TaiKhoan> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends TaiKhoan> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends TaiKhoan> S saveAndFlush(S entity);

	void flush();

	<S extends TaiKhoan> List<S> saveAll(Iterable<S> entities);

	Optional<TaiKhoan> findById(Long id);

	List<TaiKhoan> findAllById(Iterable<Long> ids);

	List<TaiKhoan> findAll(Sort sort);

	List<TaiKhoan> findAll();

	Page<TaiKhoan> findAll(Pageable pageable);

	<S extends TaiKhoan> Optional<S> findOne(Example<S> example);

	<S extends TaiKhoan> S save(S entity);

	boolean register(User_AccountDTO useracc);

	User_AccountDTO login(TaiKhoanDTO account);


}
