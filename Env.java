import java.io.Serializable;


public class Env implements Serializable {

	public String env;
	public String server;
	public String service;
	public String desc;
	public String owner;
	public String sessions;
	public String fndb;
	public String repdb;
	public String jdbcfn;
	public String jdbcdm;
	public String build;
	public String version;
	public int servicecount;
	public boolean status;
	String orch1Server;
	String orch2Server;
	String session;
	public String getOrch1Server() {
		return orch1Server;
	}
	public void setOrch1Server(String orch1Server) {
		this.orch1Server = orch1Server;
	}
	public String getOrch2Server() {
		return orch2Server;
	}
	public void setOrch2Server(String orch2Server) {
		this.orch2Server = orch2Server;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}



	
	public String getEnv() {
		return env;
	}
	public void setEnv(String env) {
		this.env = env;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getSessions() {
		return sessions;
	}
	public void setSessions(String sessions) {
		this.sessions = sessions;
	}
	public String getFndb() {
		return fndb;
	}
	public void setFndb(String fndb) {
		this.fndb = fndb;
	}
	public String getRepdb() {
		return repdb;
	}
	public void setRepdb(String repdb) {
		this.repdb = repdb;
	}
	public String getJdbcfn() {
		return jdbcfn;
	}
	public void setJdbcfn(String jdbcfn) {
		this.jdbcfn = jdbcfn;
	}
	public String getJdbcdm() {
		return jdbcdm;
	}
	public void setJdbcdm(String jdbcdm) {
		this.jdbcdm = jdbcdm;
	}
	public String getBuild() {
		return build;
	}
	public void setBuild(String build) {
		this.build = build;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getServicecount() {
		return servicecount;
	}
	public void setServicecount(int servicecount) {
		this.servicecount = servicecount;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	public  Env (){}
	
	public Env(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
		
		
		this.service=string;
	this.server=string2;
	this.desc=string3;
	}
	public Env(String server) {
		
		this.server=server;
	}
	
	
	
}
