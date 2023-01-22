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
* Creation date: 01-10-2007
* 
* XDoclet definition:
* @struts:action validate="true"
*/
public class AddVehicleDetailsAction extends Action 
  {

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
			HttpServletResponse response) throws Exception
			{
		  		
		  			
		  		
		  	
		AddVehicleDetailsDAO  adao = new AddVehicleDetailsDAO(getDataSource(request));
		AddVehicleDetailsForm  af =(AddVehicleDetailsForm)form;
		    String result= adao.insertvehicle(af);
			
		    if(result.equals("true"))
		    return  mapping.findForward("success");
	        return  mapping.findForward("fail");
			
			}
			
	
	}			
			
			
					
			
