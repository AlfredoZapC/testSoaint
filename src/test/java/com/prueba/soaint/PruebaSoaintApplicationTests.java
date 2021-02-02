package com.prueba.soaint;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.prueba.soaint.models.dao.ClienteDAO;
import com.prueba.soaint.models.entity.Cliente;
import com.prueba.soaint.models.services.ClienteService;

@RunWith(SpringRunner.class)
@SpringBootTest
class PruebaSoaintApplicationTests {

	@Autowired
	private ClienteService clienteService;
	
	@MockBean
	private ClienteDAO clienteDao;
	
	@Test
	public void getClientes() {
		when(clienteDao.findAll()).thenReturn(Stream
				.of(new Cliente((long) 10,"Alfredo","Zapata",28,"986999666","azapata@gmail.com")).collect(Collectors.toList()));
		assertEquals(1, clienteService.findAll().size());
	}

}
