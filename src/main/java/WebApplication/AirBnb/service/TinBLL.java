package WebApplication.AirBnb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import WebApplication.AirBnb.domain.Tin;

public interface TinBLL {

	<S extends Tin> List<S> findAll(Example<S> example, Sort sort);

	<S extends Tin> List<S> findAll(Example<S> example);

	Tin getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends Tin> entities);

	Tin getOne(Long id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(Tin entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	long count();

	void deleteAllInBatch(Iterable<Tin> entities);

	<S extends Tin> boolean exists(Example<S> example);

	<S extends Tin> long count(Example<S> example);

	void deleteInBatch(Iterable<Tin> entities);

	<S extends Tin> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends Tin> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends Tin> S saveAndFlush(S entity);

	void flush();

	<S extends Tin> List<S> saveAll(Iterable<S> entities);

	Optional<Tin> findById(Long id);

	List<Tin> findAllById(Iterable<Long> ids);

	List<Tin> findAll(Sort sort);

	List<Tin> findAll();

	Page<Tin> findAll(Pageable pageable);

	<S extends Tin> Optional<S> findOne(Example<S> example);

	<S extends Tin> S save(S entity);

	

}
