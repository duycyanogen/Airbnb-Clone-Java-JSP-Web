package WebApplication.AirBnb.service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import WebApplication.AirBnb.domain.Quyen;


public interface QuyenBLL {

	<S extends Quyen> List<S> findAll(Example<S> example, Sort sort);

	<S extends Quyen> List<S> findAll(Example<S> example);

	Quyen getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends Quyen> entities);

	Quyen getOne(Long id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(Quyen entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	long count();

	void deleteAllInBatch(Iterable<Quyen> entities);

	<S extends Quyen> boolean exists(Example<S> example);

	<S extends Quyen> long count(Example<S> example);

	void deleteInBatch(Iterable<Quyen> entities);

	<S extends Quyen> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends Quyen> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends Quyen> S saveAndFlush(S entity);

	void flush();

	<S extends Quyen> List<S> saveAll(Iterable<S> entities);

	Optional<Quyen> findById(Long id);

	List<Quyen> findAllById(Iterable<Long> ids);

	List<Quyen> findAll(Sort sort);

	List<Quyen> findAll();

	Page<Quyen> findAll(Pageable pageable);

	<S extends Quyen> Optional<S> findOne(Example<S> example);

	<S extends Quyen> S save(S entity);

	
}
