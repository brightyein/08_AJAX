package com.ohgiraffers.json.section03.jsonarrary;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/receive/jsonarray")
public class ReceiveJsonArrayServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("application/json; charset=UTF-8"); // 헤더 세팅함
		
		PrintWriter out = response.getWriter();
		
		out.print("[{\"type\":\"get\",\"firstname\":\"squirrel\",\"lastname\":\"nam\",\"height\":200}"
				+ "{\"type\":\"get\",\"firstname\":\"pig\",\"lastname\":\"jung\",\"height\":500},"
				+ "{\"type\":\"get\",\"firstname\":\"tiger\",\"lastname\":\"kim\",\"height\":300},"
				+ "{\"type\":\"get\",\"firstname\":\"sheep\",\"lastname\":\"woo\",\"height\":170}]");
		out.close();
	}
}
