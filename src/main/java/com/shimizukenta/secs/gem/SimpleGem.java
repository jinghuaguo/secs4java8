package com.shimizukenta.secs.gem;

import com.shimizukenta.secs.AbstractSecsCommunicator;

public class SimpleGem extends AbstractGem {

	public SimpleGem(AbstractSecsCommunicator communicator, GemConfig config) {
		super(communicator, config);
	}

	@Override
	public DynamicEventReportConfig newDynamicEventReportConfig() {
		return new SimpleDynamicEventReportConfig(this);
	}
}