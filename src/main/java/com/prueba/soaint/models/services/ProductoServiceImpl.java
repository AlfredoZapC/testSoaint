package com.prueba.soaint.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.soaint.models.dao.ProductoDAO;
import com.prueba.soaint.models.entity.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoDAO productoDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Producto> findAll() {
		return productoDao.findAll();
	}

	@Override
	public Producto findById(Long id) {
		return productoDao.findById(id).orElse(null);
	}
	
	@Override
	public Producto save(Producto producto) {
		return productoDao.save(producto);
	}

	@Override
	public void delete(Long id) {
		productoDao.deleteById(id);
	}

}
