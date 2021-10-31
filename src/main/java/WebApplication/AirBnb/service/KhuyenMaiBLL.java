package WebApplication.AirBnb.service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import WebApplication.AirBnb.domain.KhuyenMai;



public interface KhuyenMaiBLL {

	<S extends KhuyenMai> List<S> findAll(Example<S> example, Sort sort);

	<S extends KhuyenMai> List<S> findAll(Example<S> example);

	KhuyenMai getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends KhuyenMai> entities);

	KhuyenMai getOne(Long id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(KhuyenMai entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	long count();

	void deleteAllInBatch(Iterable<KhuyenMai> entities);

	<S extends KhuyenMai> boolean exists(Example<S> example);

	<S extends KhuyenMai> long count(Example<S> example);

	void deleteInBatch(Iterable<KhuyenMai> entities);

	<S extends KhuyenMai> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends KhuyenMai> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends KhuyenMai> S saveAndFlush(S entity);

	void flush();

	<S extends KhuyenMai> List<S> saveAll(Iterable<S> entities);

	Optional<KhuyenMai> findById(Long id);

	List<KhuyenMai> findAllById(Iterable<Long> ids);

	List<KhuyenMai> findAll(Sort sort);

	List<KhuyenMai> findAll();

	Page<KhuyenMai> findAll(Pageable pageable);

	<S extends KhuyenMai> Optional<S> findOne(Example<S> example);

	<S extends KhuyenMai> S save(S entity);



}
