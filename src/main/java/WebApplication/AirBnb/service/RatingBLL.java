package WebApplication.AirBnb.service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


import WebApplication.AirBnb.domain.Rating;


public interface RatingBLL {

	<S extends Rating> List<S> findAll(Example<S> example, Sort sort);

	<S extends Rating> List<S> findAll(Example<S> example);

	Rating getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends Rating> entities);

	Rating getOne(Long id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(Rating entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	long count();

	void deleteAllInBatch(Iterable<Rating> entities);

	<S extends Rating> boolean exists(Example<S> example);

	<S extends Rating> long count(Example<S> example);

	void deleteInBatch(Iterable<Rating> entities);

	<S extends Rating> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends Rating> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends Rating> S saveAndFlush(S entity);

	void flush();

	<S extends Rating> List<S> saveAll(Iterable<S> entities);

	Optional<Rating> findById(Long id);

	List<Rating> findAllById(Iterable<Long> ids);

	List<Rating> findAll(Sort sort);

	List<Rating> findAll();

	Page<Rating> findAll(Pageable pageable);

	<S extends Rating> Optional<S> findOne(Example<S> example);

	<S extends Rating> S save(S entity);

	

}
