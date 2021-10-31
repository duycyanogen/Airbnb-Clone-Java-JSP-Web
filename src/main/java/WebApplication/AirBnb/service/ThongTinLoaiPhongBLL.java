package WebApplication.AirBnb.service;


import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import WebApplication.AirBnb.domain.ThongTinLoaiPhong;


public interface ThongTinLoaiPhongBLL {

	<S extends ThongTinLoaiPhong> List<S> findAll(Example<S> example, Sort sort);

	<S extends ThongTinLoaiPhong> List<S> findAll(Example<S> example);

	ThongTinLoaiPhong getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends ThongTinLoaiPhong> entities);

	ThongTinLoaiPhong getOne(Long id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(ThongTinLoaiPhong entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	long count();

	void deleteAllInBatch(Iterable<ThongTinLoaiPhong> entities);

	<S extends ThongTinLoaiPhong> boolean exists(Example<S> example);

	<S extends ThongTinLoaiPhong> long count(Example<S> example);

	void deleteInBatch(Iterable<ThongTinLoaiPhong> entities);

	<S extends ThongTinLoaiPhong> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends ThongTinLoaiPhong> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends ThongTinLoaiPhong> S saveAndFlush(S entity);

	void flush();

	<S extends ThongTinLoaiPhong> List<S> saveAll(Iterable<S> entities);

	Optional<ThongTinLoaiPhong> findById(Long id);

	List<ThongTinLoaiPhong> findAllById(Iterable<Long> ids);

	List<ThongTinLoaiPhong> findAll(Sort sort);

	List<ThongTinLoaiPhong> findAll();

	Page<ThongTinLoaiPhong> findAll(Pageable pageable);

	<S extends ThongTinLoaiPhong> Optional<S> findOne(Example<S> example);

	<S extends ThongTinLoaiPhong> S save(S entity);

	

}
