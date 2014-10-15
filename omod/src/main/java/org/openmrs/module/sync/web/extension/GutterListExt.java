package org.openmrs.module.sync.web.extension;

import org.openmrs.module.web.extension.LinkExt;

public class GutterListExt extends LinkExt {

	@Override
	public String getLabel() {
		return "sync.config.server.synchronizeNow";
	}

	@Override
	public String getRequiredPrivilege() {
		return "View Synchronization Status";
	}

	@Override
	public String getUrl() {
		return "module/sync/status.list?mode=SEND_WEB";
	}

}
