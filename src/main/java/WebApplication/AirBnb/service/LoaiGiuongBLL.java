package WebApplication.AirBnb.service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import WebApplication.AirBnb.domain.LoaiGiuong;


public interface LoaiGiuongBLL {

	<S extends LoaiGiuong> List<S> findAll(Example<S> example, Sort sort);

	<S extends LoaiGiuong> List<S> findAll(Example<S> example);

	LoaiGiuong getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends LoaiGiuong> entities);

	LoaiGiuong getOne(Long id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(LoaiGiuong entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	long count();

	void deleteAllInBatch(Iterable<LoaiGiuong> entities);

	<S extends LoaiGiuong> boolean exists(Example<S> example);

	<S extends LoaiGiuong> long count(Example<S> example);

	void deleteInBatch(Iterable<LoaiGiuong> entities);

	<S extends LoaiGiuong> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends LoaiGiuong> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends LoaiGiuong> S saveAndFlush(S entity);

	void flush();

	<S extends LoaiGiuong> List<S> saveAll(Iterable<S> entities);

	Optional<LoaiGiuong> findById(Long id);

	List<LoaiGiuong> findAllById(Iterable<Long> ids);

	List<LoaiGiuong> findAll(Sort sort);

	List<LoaiGiuong> findAll();

	Page<LoaiGiuong> findAll(Pageable pageable);

	<S extends LoaiGiuong> Optional<S> findOne(Example<S> example);

	<S extends LoaiGiuong> S save(S entity);

	

}
