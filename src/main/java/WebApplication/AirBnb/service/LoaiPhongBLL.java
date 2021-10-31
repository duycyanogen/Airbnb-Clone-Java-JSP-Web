package WebApplication.AirBnb.service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import WebApplication.AirBnb.domain.LoaiPhong;



public interface LoaiPhongBLL {

	<S extends LoaiPhong> List<S> findAll(Example<S> example, Sort sort);

	<S extends LoaiPhong> List<S> findAll(Example<S> example);

	LoaiPhong getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends LoaiPhong> entities);

	LoaiPhong getOne(Long id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(LoaiPhong entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	long count();

	void deleteAllInBatch(Iterable<LoaiPhong> entities);

	<S extends LoaiPhong> boolean exists(Example<S> example);

	<S extends LoaiPhong> long count(Example<S> example);

	void deleteInBatch(Iterable<LoaiPhong> entities);

	<S extends LoaiPhong> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends LoaiPhong> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends LoaiPhong> S saveAndFlush(S entity);

	void flush();

	<S extends LoaiPhong> List<S> saveAll(Iterable<S> entities);

	Optional<LoaiPhong> findById(Long id);

	List<LoaiPhong> findAllById(Iterable<Long> ids);

	List<LoaiPhong> findAll(Sort sort);

	List<LoaiPhong> findAll();

	Page<LoaiPhong> findAll(Pageable pageable);

	<S extends LoaiPhong> Optional<S> findOne(Example<S> example);

	<S extends LoaiPhong> S save(S entity);

	

}
