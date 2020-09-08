package com.example.test;

import com.example.test.entity.Territorio;
import com.example.test.repository.TerritorioRepository;
import com.example.test.service.TerritorioService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.properties")
class TestApplicationTests {

	@Autowired
	private TerritorioRepository territorioRepository;

	@Test
	public void test() {
		Territorio territorio = territorioRepository.findById(1L).orElse(null);
		System.out.println(territorio);
	}

}
