package WebApplication.AirBnb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import WebApplication.AirBnb.domain.NguoiDung;




public interface NguoiDungBLL {

	<S extends NguoiDung> List<S> findAll(Example<S> example, Sort sort);

	<S extends NguoiDung> List<S> findAll(Example<S> example);

	NguoiDung getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends NguoiDung> entities);

	NguoiDung getOne(Long id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(NguoiDung entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	long count();

	void deleteAllInBatch(Iterable<NguoiDung> entities);

	<S extends NguoiDung> boolean exists(Example<S> example);

	<S extends NguoiDung> long count(Example<S> example);

	void deleteInBatch(Iterable<NguoiDung> entities);

	<S extends NguoiDung> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends NguoiDung> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends NguoiDung> S saveAndFlush(S entity);

	void flush();

	<S extends NguoiDung> List<S> saveAll(Iterable<S> entities);

	Optional<NguoiDung> findById(Long id);

	List<NguoiDung> findAllById(Iterable<Long> ids);

	List<NguoiDung> findAll(Sort sort);

	List<NguoiDung> findAll();

	Page<NguoiDung> findAll(Pageable pageable);

	<S extends NguoiDung> Optional<S> findOne(Example<S> example);

	<S extends NguoiDung> S save(S entity);

	

}
