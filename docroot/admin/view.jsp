<%
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
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:actionURL name="addProduct" var="addProductURL" />

<aui:form action="<%= addProductURL.toString() %>" method="post">
	<liferay-ui:success key="product-saved" message="product-saved-successfully"/>
	<liferay-ui:success key="productDeleted" message="product-deleted"/>
	<liferay-ui:success key="productUpdated" message="product-updated"/>
	<liferay-ui:error key="fields-required" message="fields-required"/>
	<liferay-ui:error key="error-deleting" message="error-deleting"/>
	<liferay-ui:error key="error-updating" message="error-updating"/>

	<aui:fieldset>
		<aui:input name="productName" size="45" />
		<aui:input name="productSerial" size="45" />
		<aui:button-row>
			<aui:button type="submit" />
		</aui:button-row>		
	</aui:fieldset>
</aui:form>