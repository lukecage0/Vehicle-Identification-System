
package com.nit.vehicle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/** 
* MyEclipse Struts
* Creation date: 01-30-2007
* 
* XDoclet definition:
* @struts:action validate="true"
*/
public class WorkshopLoginAction extends Action {

	// --------------------------------------------------------- Instance Variables

	// --------------------------------------------------------- Methods

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response) throws Exception{
				
		
		String username=request.getParameter("username");
		System.out.println(request.getParameter("username"));
		String password=request.getParameter("password");
		System.out.println(request.getParameter("password"));
		
	 WorkshopLoginForm wlf=(WorkshopLoginForm)form;
	 WorkshopLoginDAO wdao=new WorkshopLoginDAO(getDataSource(request));
		System.out.println(wdao);
		boolean result=wdao.workshoplogin(wlf);
		System.out.println(result);
		if(result==true)
		return mapping.findForward("success");
		return mapping.findForward("fail");
	}
			
	}



