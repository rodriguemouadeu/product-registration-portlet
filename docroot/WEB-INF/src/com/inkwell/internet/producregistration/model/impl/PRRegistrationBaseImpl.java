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

package com.inkwell.internet.producregistration.model.impl;

import com.inkwell.internet.producregistration.model.PRRegistration;
import com.inkwell.internet.producregistration.service.PRRegistrationLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the PRRegistration service. Represents a row in the &quot;PR_PRRegistration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PRRegistrationImpl}.
 * </p>
 *
 * @author Rich Sezov
 * @see PRRegistrationImpl
 * @see com.inkwell.internet.producregistration.model.PRRegistration
 * @generated
 */
public abstract class PRRegistrationBaseImpl extends PRRegistrationModelImpl
	implements PRRegistration {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a p r registration model instance should use the {@link PRRegistration} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PRRegistrationLocalServiceUtil.addPRRegistration(this);
		}
		else {
			PRRegistrationLocalServiceUtil.updatePRRegistration(this);
		}
	}
}