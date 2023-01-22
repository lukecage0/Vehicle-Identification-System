//Created by MyEclipse Struts
//XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

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
public class LoginPageAction extends Action {

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
		request.getSession().setAttribute("uid",username);
	
		LoginPageForm lpf=(LoginPageForm)form;
		LoginPageDAO ldao=new LoginPageDAO(getDataSource(request));
		System.out.println(ldao);
		String type=ldao.login(lpf);
		System.out.println(type);
		//if(type==null)
		
			//return mapping.findForward("notValid");
		if(type.equalsIgnoreCase("police"))
		{
			return mapping.findForward("police1");
		
		}
		else
		if(type.equalsIgnoreCase("insurance"))
		{
			return mapping.findForward("insurance1");
		}
		else
		if(type.equalsIgnoreCase("admin"))
		{
			return mapping.findForward("admin1");
		}
		
		
		if(type.equalsIgnoreCase("workshop"))
		{
			return mapping.findForward("workshop1");
		}
		//if(type==null)
		if(type.equalsIgnoreCase("staff"))
		{
			return mapping.findForward("staff1");
		}
		if(type.equalsIgnoreCase("customer"))
		{
			return mapping.findForward("customer1");
		}
		
		
		
		
		//if(type==null)
		
		if(type.equals("null"))
				return mapping.findForward("notValid");
		else
		  return null;
	
			
}
}
