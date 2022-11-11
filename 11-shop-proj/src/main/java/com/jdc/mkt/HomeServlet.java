package com.jdc.mkt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/edit_category", "/edit_item", "/sale" })
public class HomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var path = switch (req.getServletPath()) {
		case "/edit_category" -> "/edits/edit_category.jsp";
		case "/edit_item" -> "/edits/edit_item.jsp";
		case "/sale" -> "/edits/sale.jsp";
		default -> null;
		};

		req.getRequestDispatcher(path).forward(req, resp);
	}

}
