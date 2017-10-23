package com.bcj.pbsregent.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcj.pbsregent.entity.Address;
import com.bcj.pbsregent.entity.Company;
import com.bcj.pbsregent.entity.Tenant;
import com.bcj.pbsregent.service.RegistrationService;

/**
 * Servlet implementation class RegistrationServlet
 */

 @WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	// @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/**
		 * Getting form parameters of Company details
		 */
		String comName = request.getParameter("CompanyName");
		String email = request.getParameter("CompanyEmailId");
		String phone = request.getParameter("CompanyPhoneNo");
		String user = request.getParameter("User");
		System.out.println(user);
		String password = request.getParameter("Password");

		/**
		 * Getting form parameters of Address of Company
		 */

		String addrLine1 = request.getParameter("AddressLine1");
		String addrLine2 = request.getParameter("AddressLine2");
		String city = request.getParameter("City");
		String state = request.getParameter("State");
		String zip = request.getParameter("ZipCode");

		/**
		 * Getting form parameters of Contact Details
		 */

		String firstName = request.getParameter("FirstName");
		String lastName = request.getParameter("LastName");
		String emailId = request.getParameter("EmaiId");
		String contactNo = request.getParameter("ContactNo");

		/**
		 * Getting form parameters of Address of Tenant
		 */

		String addr1 = request.getParameter("Address1");
		String addr2 = request.getParameter("Address2");
		String city1 = request.getParameter("City1");
		String state1 = request.getParameter("State1");
		String zip1 = request.getParameter("ZipCode1");

		/**
		 * Loading the values of form parameters to entity classes
		 */

		Address cAddr = new Address(addrLine1, addrLine2, city, state, zip);
		Address tAddr = new Address(addr1, addr2, city1, state1, zip1);
		Tenant tent = new Tenant(firstName, lastName, emailId, contactNo, tAddr);
		Company company = new Company(comName, email, phone, user, password, cAddr, tent);

		int cid = RegistrationService.saveCompanyDetails(company);

		if (cid > 0) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			out.print("<html> <body>");
			out.println("<h3 text-align :center;> Thank you for Registering  </h3>");
			out.print(" <h3>Your account number is : </h3> " + cid);
			out.println("<h3>Login to for further process </h3>");
			out.print("<a href=\"login.html\"> login</a>");
			out.print("</body> </html>");

		} else {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<html> <body>");
			out.print("<h3 text-align :center;> Registration  failed </h3>");
			out.print("<a href=\"register.html\">register again </a>");
			out.print("</body> </html>");

		}
		System.out.println(cid);

	}

}
