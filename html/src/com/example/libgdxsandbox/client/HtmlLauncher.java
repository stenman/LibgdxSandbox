package com.example.libgdxsandbox.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.example.libgdxsandbox.LibgdxSandbox;

public class HtmlLauncher extends GwtApplication {

	@Override
	public GwtApplicationConfiguration getConfig() {
		return new GwtApplicationConfiguration(800, 480);
	}

	@Override
	public ApplicationListener getApplicationListener() {
		return new LibgdxSandbox();
	}
}