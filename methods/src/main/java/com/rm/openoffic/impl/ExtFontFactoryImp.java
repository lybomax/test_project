package com.rm.openoffic.impl;

import com.lowagie.text.FontFactoryImp;
import java.net.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtFontFactoryImp extends FontFactoryImp {
	private Logger logger = LoggerFactory.getLogger(ExtFontFactoryImp.class);

	public ExtFontFactoryImp() {
		super();

	}

	public int registerDirectories() {
		int i = 0;
		i += registerDirectory("c:/windows/fonts");
		i += registerDirectory("c:/winnt/fonts");
		i += registerDirectory("d:/windows/fonts");
		i += registerDirectory("d:/winnt/fonts");
		i += registerDirectory("/usr/share/X11/fonts", true);
		i += registerDirectory("/usr/X/lib/X11/fonts", true);
		i += registerDirectory("/usr/openwin/lib/X11/fonts", true);
		i += registerDirectory("/usr/share/fonts", true);
		i += registerDirectory("/usr/X11R6/lib/X11/fonts", true);
		i += registerDirectory("/Library/Fonts");
		i += registerDirectory("/System/Library/Fonts");
		URL resource = this.getClass().getResource("/templates/");
		logger.info("EXT FONT LIB:"+resource.getPath());
		i += registerDirectory(resource.getPath(), true);
		return i;

	}
	

}
