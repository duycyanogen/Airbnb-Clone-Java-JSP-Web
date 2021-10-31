package WebApplication.AirBnb.service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import WebApplication.AirBnb.domain.TienNghi;



public interface TienNghiBLL {

	<S extends TienNghi> List<S> findAll(Example<S> example, Sort sort);

	<S extends TienNghi> List<S> findAll(Example<S> example);

	TienNghi getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends TienNghi> entities);

	TienNghi getOne(Long id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(TienNghi entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	long count();

	void deleteAllInBatch(Iterable<TienNghi> entities);

	<S extends TienNghi> boolean exists(Example<S> example);

	<S extends TienNghi> long count(Example<S> example);

	void deleteInBatch(Iterable<TienNghi> entities);

	<S extends TienNghi> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends TienNghi> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends TienNghi> S saveAndFlush(S entity);

	void flush();

	<S extends TienNghi> List<S> saveAll(Iterable<S> entities);

	Optional<TienNghi> findById(Long id);

	List<TienNghi> findAllById(Iterable<Long> ids);

	List<TienNghi> findAll(Sort sort);

	List<TienNghi> findAll();

	Page<TienNghi> findAll(Pageable pageable);

	<S extends TienNghi> Optional<S> findOne(Example<S> example);

	<S extends TienNghi> S save(S entity);

	

}
