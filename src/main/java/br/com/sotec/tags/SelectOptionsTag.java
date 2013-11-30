package br.com.sotec.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SelectOptionsTag extends BodyTagSupport {

	private static final long serialVersionUID = -678055215915090987L;
	private String name;
	private String target;
	private String sql;
	private String url;
	
	private JdbcTemplate jdbcTemplate;	
	
	@Override
	public int doStartTag() throws JspException {
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(pageContext.getServletContext());
		jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		return super.doStartTag();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	@Override
	public int doEndTag() throws JspException {
		try {
			pageContext.getOut().write("<select>" + getOptions() +"</select>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doEndTag();
	}

	public String getOptions(){
		System.out.println("select");
		String options = "";
		options = options + "<option value='" + jdbcTemplate.queryForObject("select 1", Integer.class) + "'>" + jdbcTemplate.queryForObject("select 'glauco'", String.class)+ "</option>"; 
		return options;
	}
}
