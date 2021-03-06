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

package com.inkwell.internet.productregistration.model.impl;

import com.inkwell.internet.productregistration.model.PRUser;
import com.inkwell.internet.productregistration.model.PRUserModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the PRUser service. Represents a row in the &quot;PR_PRUser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.inkwell.internet.productregistration.model.PRUserModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PRUserImpl}.
 * </p>
 *
 * @author Rich Sezov
 * @see PRUserImpl
 * @see com.inkwell.internet.productregistration.model.PRUser
 * @see com.inkwell.internet.productregistration.model.PRUserModel
 * @generated
 */
public class PRUserModelImpl extends BaseModelImpl<PRUser>
	implements PRUserModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a p r user model instance should use the {@link com.inkwell.internet.productregistration.model.PRUser} interface instead.
	 */
	public static final String TABLE_NAME = "PR_PRUser";
	public static final Object[][] TABLE_COLUMNS = {
			{ "prUserId", Types.BIGINT },
			{ "firstname", Types.VARCHAR },
			{ "lastName", Types.VARCHAR },
			{ "address1", Types.VARCHAR },
			{ "address2", Types.VARCHAR },
			{ "city", Types.VARCHAR },
			{ "state_", Types.VARCHAR },
			{ "postalCode", Types.VARCHAR },
			{ "country", Types.VARCHAR },
			{ "phoneNumber", Types.VARCHAR },
			{ "email", Types.VARCHAR },
			{ "birthDate", Types.TIMESTAMP },
			{ "male", Types.BOOLEAN },
			{ "userId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table PR_PRUser (prUserId LONG not null primary key,firstname VARCHAR(75) null,lastName VARCHAR(75) null,address1 VARCHAR(75) null,address2 VARCHAR(75) null,city VARCHAR(75) null,state_ VARCHAR(75) null,postalCode VARCHAR(75) null,country VARCHAR(75) null,phoneNumber VARCHAR(75) null,email VARCHAR(75) null,birthDate DATE null,male BOOLEAN,userId LONG,companyId LONG,groupId LONG)";
	public static final String TABLE_SQL_DROP = "drop table PR_PRUser";
	public static final String ORDER_BY_JPQL = " ORDER BY prUser.lastName ASC";
	public static final String ORDER_BY_SQL = " ORDER BY PR_PRUser.lastName ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.inkwell.internet.productregistration.model.PRUser"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.inkwell.internet.productregistration.model.PRUser"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.inkwell.internet.productregistration.model.PRUser"),
			true);
	public static long EMAIL_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long LASTNAME_COLUMN_BITMASK = 4L;
	public static long USERID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.inkwell.internet.productregistration.model.PRUser"));

	public PRUserModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _prUserId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPrUserId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _prUserId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return PRUser.class;
	}

	@Override
	public String getModelClassName() {
		return PRUser.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("prUserId", getPrUserId());
		attributes.put("firstname", getFirstname());
		attributes.put("lastName", getLastName());
		attributes.put("address1", getAddress1());
		attributes.put("address2", getAddress2());
		attributes.put("city", getCity());
		attributes.put("state", getState());
		attributes.put("postalCode", getPostalCode());
		attributes.put("country", getCountry());
		attributes.put("phoneNumber", getPhoneNumber());
		attributes.put("email", getEmail());
		attributes.put("birthDate", getBirthDate());
		attributes.put("male", getMale());
		attributes.put("userId", getUserId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long prUserId = (Long)attributes.get("prUserId");

		if (prUserId != null) {
			setPrUserId(prUserId);
		}

		String firstname = (String)attributes.get("firstname");

		if (firstname != null) {
			setFirstname(firstname);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String address1 = (String)attributes.get("address1");

		if (address1 != null) {
			setAddress1(address1);
		}

		String address2 = (String)attributes.get("address2");

		if (address2 != null) {
			setAddress2(address2);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String postalCode = (String)attributes.get("postalCode");

		if (postalCode != null) {
			setPostalCode(postalCode);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		String phoneNumber = (String)attributes.get("phoneNumber");

		if (phoneNumber != null) {
			setPhoneNumber(phoneNumber);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Date birthDate = (Date)attributes.get("birthDate");

		if (birthDate != null) {
			setBirthDate(birthDate);
		}

		Boolean male = (Boolean)attributes.get("male");

		if (male != null) {
			setMale(male);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}
	}

	@Override
	public long getPrUserId() {
		return _prUserId;
	}

	@Override
	public void setPrUserId(long prUserId) {
		_prUserId = prUserId;
	}

	@Override
	public String getPrUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getPrUserId(), "uuid", _prUserUuid);
	}

	@Override
	public void setPrUserUuid(String prUserUuid) {
		_prUserUuid = prUserUuid;
	}

	@Override
	public String getFirstname() {
		if (_firstname == null) {
			return StringPool.BLANK;
		}
		else {
			return _firstname;
		}
	}

	@Override
	public void setFirstname(String firstname) {
		_firstname = firstname;
	}

	@Override
	public String getLastName() {
		if (_lastName == null) {
			return StringPool.BLANK;
		}
		else {
			return _lastName;
		}
	}

	@Override
	public void setLastName(String lastName) {
		_columnBitmask = -1L;

		if (_originalLastName == null) {
			_originalLastName = _lastName;
		}

		_lastName = lastName;
	}

	public String getOriginalLastName() {
		return GetterUtil.getString(_originalLastName);
	}

	@Override
	public String getAddress1() {
		if (_address1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _address1;
		}
	}

	@Override
	public void setAddress1(String address1) {
		_address1 = address1;
	}

	@Override
	public String getAddress2() {
		if (_address2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _address2;
		}
	}

	@Override
	public void setAddress2(String address2) {
		_address2 = address2;
	}

	@Override
	public String getCity() {
		if (_city == null) {
			return StringPool.BLANK;
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		_city = city;
	}

	@Override
	public String getState() {
		if (_state == null) {
			return StringPool.BLANK;
		}
		else {
			return _state;
		}
	}

	@Override
	public void setState(String state) {
		_state = state;
	}

	@Override
	public String getPostalCode() {
		if (_postalCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _postalCode;
		}
	}

	@Override
	public void setPostalCode(String postalCode) {
		_postalCode = postalCode;
	}

	@Override
	public String getCountry() {
		if (_country == null) {
			return StringPool.BLANK;
		}
		else {
			return _country;
		}
	}

	@Override
	public void setCountry(String country) {
		_country = country;
	}

	@Override
	public String getPhoneNumber() {
		if (_phoneNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _phoneNumber;
		}
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}

	@Override
	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_columnBitmask |= EMAIL_COLUMN_BITMASK;

		if (_originalEmail == null) {
			_originalEmail = _email;
		}

		_email = email;
	}

	public String getOriginalEmail() {
		return GetterUtil.getString(_originalEmail);
	}

	@Override
	public Date getBirthDate() {
		return _birthDate;
	}

	@Override
	public void setBirthDate(Date birthDate) {
		_birthDate = birthDate;
	}

	@Override
	public boolean getMale() {
		return _male;
	}

	@Override
	public boolean isMale() {
		return _male;
	}

	@Override
	public void setMale(boolean male) {
		_male = male;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			PRUser.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public PRUser toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (PRUser)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PRUserImpl prUserImpl = new PRUserImpl();

		prUserImpl.setPrUserId(getPrUserId());
		prUserImpl.setFirstname(getFirstname());
		prUserImpl.setLastName(getLastName());
		prUserImpl.setAddress1(getAddress1());
		prUserImpl.setAddress2(getAddress2());
		prUserImpl.setCity(getCity());
		prUserImpl.setState(getState());
		prUserImpl.setPostalCode(getPostalCode());
		prUserImpl.setCountry(getCountry());
		prUserImpl.setPhoneNumber(getPhoneNumber());
		prUserImpl.setEmail(getEmail());
		prUserImpl.setBirthDate(getBirthDate());
		prUserImpl.setMale(getMale());
		prUserImpl.setUserId(getUserId());
		prUserImpl.setCompanyId(getCompanyId());
		prUserImpl.setGroupId(getGroupId());

		prUserImpl.resetOriginalValues();

		return prUserImpl;
	}

	@Override
	public int compareTo(PRUser prUser) {
		int value = 0;

		value = getLastName().compareToIgnoreCase(prUser.getLastName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PRUser)) {
			return false;
		}

		PRUser prUser = (PRUser)obj;

		long primaryKey = prUser.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		PRUserModelImpl prUserModelImpl = this;

		prUserModelImpl._originalLastName = prUserModelImpl._lastName;

		prUserModelImpl._originalEmail = prUserModelImpl._email;

		prUserModelImpl._originalUserId = prUserModelImpl._userId;

		prUserModelImpl._setOriginalUserId = false;

		prUserModelImpl._originalGroupId = prUserModelImpl._groupId;

		prUserModelImpl._setOriginalGroupId = false;

		prUserModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<PRUser> toCacheModel() {
		PRUserCacheModel prUserCacheModel = new PRUserCacheModel();

		prUserCacheModel.prUserId = getPrUserId();

		prUserCacheModel.firstname = getFirstname();

		String firstname = prUserCacheModel.firstname;

		if ((firstname != null) && (firstname.length() == 0)) {
			prUserCacheModel.firstname = null;
		}

		prUserCacheModel.lastName = getLastName();

		String lastName = prUserCacheModel.lastName;

		if ((lastName != null) && (lastName.length() == 0)) {
			prUserCacheModel.lastName = null;
		}

		prUserCacheModel.address1 = getAddress1();

		String address1 = prUserCacheModel.address1;

		if ((address1 != null) && (address1.length() == 0)) {
			prUserCacheModel.address1 = null;
		}

		prUserCacheModel.address2 = getAddress2();

		String address2 = prUserCacheModel.address2;

		if ((address2 != null) && (address2.length() == 0)) {
			prUserCacheModel.address2 = null;
		}

		prUserCacheModel.city = getCity();

		String city = prUserCacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			prUserCacheModel.city = null;
		}

		prUserCacheModel.state = getState();

		String state = prUserCacheModel.state;

		if ((state != null) && (state.length() == 0)) {
			prUserCacheModel.state = null;
		}

		prUserCacheModel.postalCode = getPostalCode();

		String postalCode = prUserCacheModel.postalCode;

		if ((postalCode != null) && (postalCode.length() == 0)) {
			prUserCacheModel.postalCode = null;
		}

		prUserCacheModel.country = getCountry();

		String country = prUserCacheModel.country;

		if ((country != null) && (country.length() == 0)) {
			prUserCacheModel.country = null;
		}

		prUserCacheModel.phoneNumber = getPhoneNumber();

		String phoneNumber = prUserCacheModel.phoneNumber;

		if ((phoneNumber != null) && (phoneNumber.length() == 0)) {
			prUserCacheModel.phoneNumber = null;
		}

		prUserCacheModel.email = getEmail();

		String email = prUserCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			prUserCacheModel.email = null;
		}

		Date birthDate = getBirthDate();

		if (birthDate != null) {
			prUserCacheModel.birthDate = birthDate.getTime();
		}
		else {
			prUserCacheModel.birthDate = Long.MIN_VALUE;
		}

		prUserCacheModel.male = getMale();

		prUserCacheModel.userId = getUserId();

		prUserCacheModel.companyId = getCompanyId();

		prUserCacheModel.groupId = getGroupId();

		return prUserCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{prUserId=");
		sb.append(getPrUserId());
		sb.append(", firstname=");
		sb.append(getFirstname());
		sb.append(", lastName=");
		sb.append(getLastName());
		sb.append(", address1=");
		sb.append(getAddress1());
		sb.append(", address2=");
		sb.append(getAddress2());
		sb.append(", city=");
		sb.append(getCity());
		sb.append(", state=");
		sb.append(getState());
		sb.append(", postalCode=");
		sb.append(getPostalCode());
		sb.append(", country=");
		sb.append(getCountry());
		sb.append(", phoneNumber=");
		sb.append(getPhoneNumber());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", birthDate=");
		sb.append(getBirthDate());
		sb.append(", male=");
		sb.append(getMale());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.inkwell.internet.productregistration.model.PRUser");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>prUserId</column-name><column-value><![CDATA[");
		sb.append(getPrUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>firstname</column-name><column-value><![CDATA[");
		sb.append(getFirstname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastName</column-name><column-value><![CDATA[");
		sb.append(getLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address1</column-name><column-value><![CDATA[");
		sb.append(getAddress1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address2</column-name><column-value><![CDATA[");
		sb.append(getAddress2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city</column-name><column-value><![CDATA[");
		sb.append(getCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state</column-name><column-value><![CDATA[");
		sb.append(getState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postalCode</column-name><column-value><![CDATA[");
		sb.append(getPostalCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>country</column-name><column-value><![CDATA[");
		sb.append(getCountry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phoneNumber</column-name><column-value><![CDATA[");
		sb.append(getPhoneNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthDate</column-name><column-value><![CDATA[");
		sb.append(getBirthDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>male</column-name><column-value><![CDATA[");
		sb.append(getMale());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = PRUser.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { PRUser.class };
	private long _prUserId;
	private String _prUserUuid;
	private String _firstname;
	private String _lastName;
	private String _originalLastName;
	private String _address1;
	private String _address2;
	private String _city;
	private String _state;
	private String _postalCode;
	private String _country;
	private String _phoneNumber;
	private String _email;
	private String _originalEmail;
	private Date _birthDate;
	private boolean _male;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _columnBitmask;
	private PRUser _escapedModel;
}