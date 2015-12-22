package com.liferay.blade.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class ServicesTests {
	private static boolean isPortalStarting = false; 

	@Before
	public void testConnect() throws Exception{
		String[] result = new ServicesCommand(new bladenofail(),new ServicesOptionAdapter(null)).execute();
		if(result != null){
			isPortalStarting = true;
		}
	}

	@Test
	public void getServiceBundle() throws Exception{
		String[] serviceBundle = new ServicesCommand(new bladenofail(),
				new ServicesOptionAdapter("com.liferay.bookmarks.service.BookmarksEntryLocalService")).execute();
		String[] serviceBundleNoExportPackage = new ServicesCommand(new bladenofail(),
				new ServicesOptionAdapter("com.liferay.site.teams.web.upgrade.SiteTeamsWebUpgrade")).execute();

		if(isPortalStarting){

		assertEquals("com.liferay.bookmarks.api", serviceBundle[0]);
		assertEquals("1.0.0", serviceBundle[1]);

		assertEquals("com.liferay.site.teams.web", serviceBundleNoExportPackage[0]);
		assertEquals("1.0.0", serviceBundleNoExportPackage[1]);

		} else {
			assertNull(serviceBundle);
			assertNull(serviceBundleNoExportPackage);
		}

	}
}
