package com.ohgiraffers.section01.override;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.ohgiraffers.model.dto.MemberDto;

@WebServlet("/receive/override")
public class ReceiveDTOServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		MemberDto member = new MemberDto("get", "squirrel", "nam", 200);
		
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		// out.print(member.toString()); 와 같다
		out.print(member);
		out.close();
		
	}
}
