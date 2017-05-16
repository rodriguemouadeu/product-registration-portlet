package com.inkwell.internet.productregistration.registration.portlet;

import java.util.ArrayList;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.inkwell.internet.productregistration.model.PRProduct;
import com.inkwell.internet.productregistration.service.PRProductLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class productAdminPortlet extends MVCPortlet {

	public void addProduct(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
		ThemeDisplay themeDisplay =(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		PRProduct product = ActionUtil.productFromRequest(request);
		ArrayList<String> errors = new ArrayList<>();
		
		if(ProdRegValidator.validateProduct(product, errors)){
			PRProductLocalServiceUtil.addPRProduct(product, themeDisplay.getUserId());
			SessionMessages.add(request, "product-saved-successfully");
		} else {
			SessionErrors.add(request, "fields-required");
		}
	}
}
