package com.hbs.helper;

import java.io.Serializable;

import org.hibernate.CallbackException;
import org.hibernate.EntityMode;
import org.hibernate.Interceptor;
import org.hibernate.Transaction;
import org.hibernate.type.Type;

public class CustomInterceptor implements Interceptor {

	@Override
	public void afterTransactionBegin(Transaction arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterTransactionCompletion(Transaction transaction) {
		transaction.getClass().getName();
		System.out.println("afterTransactionCompletion: " + transaction);
	}

	@Override
	public void beforeTransactionCompletion(Transaction arg0) {

	}

	@Override
	public int[] findDirty(Object arg0, Serializable arg1, Object[] arg2, Object[] arg3, String[] arg4, Type[] arg5) {
		return null;
	}

	@Override
	public Object getEntity(String arg0, Serializable arg1) throws CallbackException {
		return null;
	}

	@Override
	public String getEntityName(Object arg0) throws CallbackException {
		return null;
	}

	@Override
	public Object instantiate(String arg0, EntityMode arg1, Serializable arg2) throws CallbackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isTransient(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCollectionRecreate(Object arg0, Serializable arg1) throws CallbackException {
		// TODO Auto-generated method stub

	}

	@Override
	public void onCollectionRemove(Object arg0, Serializable arg1) throws CallbackException {
		// TODO Auto-generated method stub

	}

	@Override
	public void onCollectionUpdate(Object arg0, Serializable arg1) throws CallbackException {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDelete(Object arg0, Serializable arg1, Object[] arg2, String[] arg3, Type[] arg4)
			throws CallbackException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onFlushDirty(Object arg0, Serializable arg1, Object[] arg2, Object[] arg3, String[] arg4,
			Type[] arg5) throws CallbackException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onLoad(Object arg0, Serializable arg1, Object[] arg2, String[] arg3, Type[] arg4)
			throws CallbackException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String onPrepareStatement(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean onSave(Object arg0, Serializable arg1, Object[] arg2, String[] arg3, Type[] arg4)
			throws CallbackException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void postFlush(@SuppressWarnings("rawtypes") java.util.Iterator arg0) throws CallbackException {
		// TODO Auto-generated method stub

	}

	@Override
	public void preFlush(@SuppressWarnings("rawtypes") java.util.Iterator arg0) throws CallbackException {
		// TODO Auto-generated method stub

	}
}
