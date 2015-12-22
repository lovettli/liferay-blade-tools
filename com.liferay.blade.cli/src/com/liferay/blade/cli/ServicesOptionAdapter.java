package com.liferay.blade.cli;

import java.util.List;
import java.util.Map;

import aQute.lib.getopt.CommandLine;

public class ServicesOptionAdapter implements ServicesOptions{
	private String _servicename;

	public ServicesOptionAdapter(String servicename) {
		_servicename = servicename;
	}
	@Override
	public List<String> _() {
		return null;
	}

	@Override
	public List<String> _arguments() {
		return null;
	}

	@Override
	public CommandLine _command() {
		return null;
	}

	@Override
	public Map<String, String> _properties() {
		return null;
	}

	@Override
	public boolean _ok() {
		return false;
	}

	@Override
	public boolean _help() {
		return false;
	}

	@Override
	public String servicename() {
		return _servicename;
	}

}
