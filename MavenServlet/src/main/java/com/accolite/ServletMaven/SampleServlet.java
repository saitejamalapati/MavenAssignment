package com.accolite.ServletMaven;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accolite.ChildMaven.SampleClass;

public class SampleServlet extends HttpServlet {

	private static final long serialVersionUID = 2638191254753807919L;
	static SampleClass store = new SampleClass();


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println(store.get((String) req.getParameter("key")));
		resp.getWriter().flush();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String key = req.getParameter("key");
		String value = req.getParameter("value");
		store.put(key, value);
	}
}