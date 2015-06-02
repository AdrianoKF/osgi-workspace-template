package test.integration;

import static org.amdatu.testing.configurator.TestConfigurator.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IntegrationTest {
	@Before
	public void setup() {
		configure(this)
		// Uncomment the following line to declare a service dependency
		// .add(serviceDependency(Object.class))
				.apply();
	}

	@After
	public void teardown() {
		cleanUp(this);
	}

	@Test
	public void testCase() {
	}
}
