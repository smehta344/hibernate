package com.ja.helper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NeftFundTransService implements InvocationHandler {
	private Object target;

	public NeftFundTransService(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(proxy.getClass().getName());
		System.out.println(method.getName());
		args = method.getParameters();
		Object result=method.invoke(target, args);

		return result;

	}

}
