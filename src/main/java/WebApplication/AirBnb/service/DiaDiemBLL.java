package WebApplication.AirBnb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import WebApplication.AirBnb.domain.DiaDiem;

public interface DiaDiemBLL {

	<S extends DiaDiem> List<S> findAll(Example<S> example, Sort sort);

	<S extends DiaDiem> List<S> findAll(Example<S> example);

	DiaDiem getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends DiaDiem> entities);

	DiaDiem getOne(Long id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(DiaDiem entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	long count();

	void deleteAllInBatch(Iterable<DiaDiem> entities);

	<S extends DiaDiem> boolean exists(Example<S> example);

	<S extends DiaDiem> long count(Example<S> example);

	void deleteInBatch(Iterable<DiaDiem> entities);

	<S extends DiaDiem> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends DiaDiem> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends DiaDiem> S saveAndFlush(S entity);

	void flush();

	<S extends DiaDiem> List<S> saveAll(Iterable<S> entities);

	Optional<DiaDiem> findById(Long id);

	List<DiaDiem> findAllById(Iterable<Long> ids);

	List<DiaDiem> findAll(Sort sort);

	List<DiaDiem> findAll();

	Page<DiaDiem> findAll(Pageable pageable);

	<S extends DiaDiem> Optional<S> findOne(Example<S> example);

	<S extends DiaDiem> S save(S entity);

	

}
