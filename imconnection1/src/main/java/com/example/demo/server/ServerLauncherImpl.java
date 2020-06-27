package com.example.demo.server;

import java.io.IOException;

import net.openmob.mobileimsdk.server.ServerLauncher;
import net.openmob.mobileimsdk.server.qos.QoS4ReciveDaemonC2S;
import net.openmob.mobileimsdk.server.qos.QoS4SendDaemonS2C;

public class ServerLauncherImpl  extends  ServerLauncher{
	static {
		ServerLauncher.appKey = "5418023dfd98c579b6001741";
		ServerLauncher.PORT = 7901;
		QoS4SendDaemonS2C.getInstance().setDebugable(true);
		QoS4ReciveDaemonC2S.getInstance().setDebugable(true);
		ServerLauncher.debug = true;
		ServerLauncher.bridgeEnabled = false;
	}
	
	public ServerLauncherImpl() throws IOException {
		final ServerLauncherImpl sli = new ServerLauncherImpl();
		try {
			sli.startup();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void initListeners() {
		// TODO Auto-generated method stub
		
	}

}
