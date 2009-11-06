package com.aptana.radrails.editor.common;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.aptana.radrails.editor.common.theme.ColorManager;

/**
 * The activator class controls the plug-in life cycle
 */
public class CommonEditorPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.aptana.radrails.editor.common";

	// The shared instance
	private static CommonEditorPlugin plugin;
	
	private ColorManager _colorManager;
	
	/**
	 * The constructor
	 */
	public CommonEditorPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static CommonEditorPlugin getDefault() {
		return plugin;
	}

	
	/**
	 * getColorManager
	 * 
	 * @return
	 */
	public ColorManager getColorManager()
	{
		if (this._colorManager == null)
		{
			this._colorManager = new ColorManager();
		}

		return this._colorManager;
	}
}
