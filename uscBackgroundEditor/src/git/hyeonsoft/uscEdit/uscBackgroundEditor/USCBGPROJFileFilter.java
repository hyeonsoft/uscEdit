package git.hyeonsoft.uscEdit.uscBackgroundEditor;

import java.io.File;
import java.io.FilenameFilter;

public class USCBGPROJFileFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		return name.toLowerCase().endsWith(".uscbgproj");
	}

}
