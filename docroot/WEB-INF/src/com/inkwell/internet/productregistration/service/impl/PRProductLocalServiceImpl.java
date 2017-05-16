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

package com.inkwell.internet.productregistration.service.impl;

import java.util.List;

import com.inkwell.internet.productregistration.NoSuchProductException;
import com.inkwell.internet.productregistration.model.PRProduct;
import com.inkwell.internet.productregistration.service.base.PRProductLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ResourceConstants;

/**
 * The implementation of the p r product local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.inkwell.internet.productregistration.service.PRProductLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Rich Sezov
 * @see com.inkwell.internet.productregistration.service.base.PRProductLocalServiceBaseImpl
 * @see com.inkwell.internet.productregistration.service.PRProductLocalServiceUtil
 */
public class PRProductLocalServiceImpl extends PRProductLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.inkwell.internet.productregistration.service.PRProductLocalServiceUtil} to access the p r product local service.
	 */
	
	
	public List<PRProduct> getAllProducts(long groupId) throws SystemException{
		List<PRProduct> products = prProductPersistence.findByGroupId(groupId);
		return products;
	}
	
	@SuppressWarnings("deprecation")
	public PRProduct addPRProduct(PRProduct prProduct, long userId) throws SystemException, PortalException {
		// create product
		PRProduct product = prProductPersistence.create(counterLocalService.increment(PRProduct.class.getName()));
		// persist product
		resourceLocalService.addResources(prProduct.getCompanyId(), prProduct.getGroupId(), userId, PRProduct.class.getName(), product.getPrimaryKey(), false, true, true);
		// update product
		product.setProductName(prProduct.getProductName());
		product.setSerialNumber(prProduct.getSerialNumber());
		product.setCompanyId(prProduct.getCompanyId());
		product.setGroupId(prProduct.getGroupId());
		return prProductPersistence.update(prProduct, false);
	}
	
	public void deleteProduct(long productId) throws NoSuchProductException, PortalException, SystemException {

		PRProduct product = prProductPersistence.findByPrimaryKey(productId);
		deletePRProduct(product);
	}
	
	public void deleteProduct(PRProduct prProduct) throws SystemException, PortalException {
		resourceLocalService.deleteResource(prProduct.getCompanyId(),  PRProduct.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, prProduct.getPrimaryKey());
		prProductPersistence.remove(prProduct);
	}
}