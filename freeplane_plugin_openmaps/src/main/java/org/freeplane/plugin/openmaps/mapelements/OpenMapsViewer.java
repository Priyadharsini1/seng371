package org.freeplane.plugin.openmaps.mapelements;

import java.awt.Dimension;
import java.util.Collections;

import org.freeplane.core.util.FreeplaneVersion;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MemoryTileCache;
import org.openstreetmap.gui.jmapviewer.OsmTileLoader;

/**
 * @author Blair Archibald
 */
public class OpenMapsViewer extends JMapViewer {
	private static final long serialVersionUID = 1L;
	private static final int HEIGHT = 500;
	private static final int WIDTH = 800;

	public OpenMapsViewer () {
		 super(new MemoryTileCache());
		 setTileLoader(new OsmTileLoader(this, Collections.singletonMap("User-Agent", //
			 "Freeplane/"+FreeplaneVersion.getVersion().numberToString())));
		 this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

}
