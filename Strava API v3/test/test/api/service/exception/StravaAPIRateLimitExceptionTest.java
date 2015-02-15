package test.api.service.exception;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import stravajava.api.v3.model.StravaResponse;
import stravajava.api.v3.service.exception.StravaAPIRateLimitException;

public class StravaAPIRateLimitExceptionTest {

	/**
	 * Test constructor
	 */
	@Test
	public void testConstructor_normal() {
		StravaAPIRateLimitException e = new StravaAPIRateLimitException("Test",new StravaResponse(),new IllegalArgumentException());
		try {
			throw e;
		} catch (StravaAPIRateLimitException ex) {
			// Expected
			return;
		}
	}
	
	@Test
	public void testConstructor_nullSafety() {
		new StravaAPIRateLimitException(null, null, null);
	}
	
	@Test
	public void testGetSetResponse() {
		StravaResponse response = new StravaResponse();
		response.setMessage("Test");
		StravaAPIRateLimitException e = new StravaAPIRateLimitException("Test",new StravaResponse(),null);
		e.setResponse(response);
		StravaResponse testResponse = e.getResponse();
		assertEquals(response,testResponse);
	}

}
