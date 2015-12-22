package com.liferay.blade.cli;

import aQute.lib.getopt.Description;
import aQute.lib.getopt.Options;

public interface ServicesOptions extends Options{

	@Description("Get bundle name of this service")
	public String servicename();
}
