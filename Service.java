import javax.faces.bean.ManagedBean;


public class Service {

	public String env;
	public String serviceName;
	public String serverName;
	public String serviceDesc;
	public String getEnv() {
		return env;
	}
	public void setEnv(String env) {
		this.env = env;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getServiceDesc() {
		return serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}
	public Service(String serviceName, String env, String serverName,
			String serviceDesc) {

		this.serviceName = serviceName;
		this.env = env;
		this.serverName = serverName;
		this.serviceDesc = serviceDesc;
	}
	public Service(){}
	
}
