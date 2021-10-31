package WebApplication.AirBnb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import WebApplication.AirBnb.domain.CoSoKhachSan;

public interface CoSoKhachSanBLL {

	<S extends CoSoKhachSan> List<S> findAll(Example<S> example, Sort sort);

	<S extends CoSoKhachSan> List<S> findAll(Example<S> example);

	CoSoKhachSan getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends CoSoKhachSan> entities);

	CoSoKhachSan getOne(Long id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(CoSoKhachSan entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	long count();

	void deleteAllInBatch(Iterable<CoSoKhachSan> entities);

	<S extends CoSoKhachSan> boolean exists(Example<S> example);

	<S extends CoSoKhachSan> long count(Example<S> example);

	void deleteInBatch(Iterable<CoSoKhachSan> entities);

	<S extends CoSoKhachSan> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends CoSoKhachSan> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends CoSoKhachSan> S saveAndFlush(S entity);

	void flush();

	<S extends CoSoKhachSan> List<S> saveAll(Iterable<S> entities);

	Optional<CoSoKhachSan> findById(Long id);

	List<CoSoKhachSan> findAllById(Iterable<Long> ids);

	List<CoSoKhachSan> findAll(Sort sort);

	List<CoSoKhachSan> findAll();

	Page<CoSoKhachSan> findAll(Pageable pageable);

	<S extends CoSoKhachSan> Optional<S> findOne(Example<S> example);

	<S extends CoSoKhachSan> S save(S entity);

	
}
