package test.api.model;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.danshannon.strava.api.model.Split;

/**
 * @author dshannon
 *
 */
public class SplitTest {

	@Test
	public void test() {
		new BeanTester().testBean(Split.class);
	}

	@Test
	public void testEqualsMethod() {
		EqualsVerifier.forClass(Split.class).suppress(Warning.STRICT_INHERITANCE,Warning.NONFINAL_FIELDS).verify();
	}
}