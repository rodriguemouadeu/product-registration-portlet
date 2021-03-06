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

package com.inkwell.internet.productregistration.service.persistence;

import com.inkwell.internet.productregistration.model.PRRegistration;
import com.inkwell.internet.productregistration.service.PRRegistrationLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Rich Sezov
 * @generated
 */
public abstract class PRRegistrationActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public PRRegistrationActionableDynamicQuery() throws SystemException {
		setBaseLocalService(PRRegistrationLocalServiceUtil.getService());
		setClass(PRRegistration.class);

		setClassLoader(com.inkwell.internet.productregistration.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("registrationId");
	}
}