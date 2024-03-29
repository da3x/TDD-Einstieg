package de.binaris.HaraldBaseball.integration;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import de.binaris.HaraldBaseball.errors.NoPilotException;
import de.binaris.HaraldBaseball.impl.Drehen;
import de.binaris.HaraldBaseball.impl.Sehen;
import de.binaris.HaraldBaseball.integration.common.BaseIntegrationTest;
import lejos.remote.ev3.RemoteRequestSampleProvider;
import lejos.robotics.Color;
import robot.BotEV3;

class DrehenIntegrationTest extends BaseIntegrationTest {

	@Test
	void testeDrehen() throws NoPilotException {

		Drehen drehen = new Drehen(pilot);

		drehen.dreheLinks();
		drehen.dreheRechts();
	}

	@Test
	void teste4xLinks() throws NoPilotException {
	    
	    Drehen drehen = new Drehen(pilot);
	    
	    drehen.dreheLinks();
	    drehen.dreheLinks();
	    drehen.dreheLinks();
	    drehen.dreheLinks();
	}

	@Test
	void teste4xRechts() throws NoPilotException {
	    
	    Drehen drehen = new Drehen(pilot);
	    
	    drehen.dreheRechts();
	    drehen.dreheRechts();
	    drehen.dreheRechts();
	    drehen.dreheRechts();
	}
}
