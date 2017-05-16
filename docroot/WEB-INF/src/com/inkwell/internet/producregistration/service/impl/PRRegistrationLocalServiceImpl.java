/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.inkwell.internet.producregistration.service.impl;

import java.util.List;

import com.inkwell.internet.producregistration.model.PRRegistration;
import com.inkwell.internet.producregistration.service.base.PRRegistrationLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the p r registration local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.inkwell.internet.producregistration.service.PRRegistrationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Rich Sezov
 * @see com.inkwell.internet.producregistration.service.base.PRRegistrationLocalServiceBaseImpl
 * @see com.inkwell.internet.producregistration.service.PRRegistrationLocalServiceUtil
 */
public class PRRegistrationLocalServiceImpl
	extends PRRegistrationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.inkwell.internet.producregistration.service.PRRegistrationLocalServiceUtil} to access the p r registration local service.
	 */
	
	@SuppressWarnings("deprecation")
	public PRRegistration addRegistration(PRRegistration prRegistration) throws SystemException, PortalException{
		PRRegistration registration = prRegistrationPersistence.create(counterLocalService.increment(PRRegistration.class.getName()));
		
		resourceLocalService.addResources(prRegistration.getCompanyId(), prRegistration.getGroupId(), PRRegistration.class.getName(), false);
		
		registration.setCompanyId(prRegistration.getCompanyId());
		registration.setDatePurchased(prRegistration.getDatePurchased());
		registration.setGroupId(prRegistration.getGroupId());
		prRegistration.setHowHear(prRegistration.getHowHear());
		registration.setProductId(prRegistration.getProductId());
		registration.setPrUserId(prRegistration.getPrUserId());
		registration.setSerialNumber(prRegistration.getSerialNumber());
		registration.setWherePurchased(prRegistration.getWherePurchased());
		
		return prRegistrationPersistence.update(prRegistration, false);
	}
	
	public List<PRRegistration> getAllRegistrations(long groupId) throws SystemException {
			return prRegistrationPersistence.findByGroupId(groupId);
	}
	
}