/**
 * 
 */
package com.bcj.playground;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Method;

import org.junit.Test;

import com.bcj.playground.PrivateTestReflectionAPI;

/**
 * @author Boot Camp User 008
 *
 */
public class TestClass {
	
	
	private PrivateTestReflectionAPI ref;
	
	@Test
	public void shouldGetSum() throws Exception{
		
		Class<?> c = Class.forName("com.bcj.playground.PrivateTestReflectionAPI");
		
		PrivateTestReflectionAPI ref = (PrivateTestReflectionAPI) c.newInstance();
		
		Method m = c.getDeclaredMethod("sum");
		
		m.setAccessible(true);
		
		int sum = (int) m.invoke(ref, 1,2);
		
		assertEquals(3,sum);
		
	}

}
