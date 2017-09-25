package com.internousdev.choitabi.util;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.internousdev.choitabi.dao.LogoutDAO;



public class ChoitabiHttpSessionListener implements HttpSessionListener{


	public void sessionCreated(HttpSessionEvent se){

	}

	public void sessionDestroyed(HttpSessionEvent se){
		HttpSession session = se.getSession();
		LogoutDAO dao = new LogoutDAO();
		dao.update((int)session.getAttribute("userId"),0);

	}


}
