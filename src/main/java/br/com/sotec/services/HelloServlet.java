package br.com.sotec.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.sotec.beans.Contato;

public class HelloServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Autowired
	private Contato contato;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void init() throws ServletException {
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = jdbcTemplate.queryForObject("select 1", Integer.class);
		System.out.println("hola");
	}

}
