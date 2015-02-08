import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;



@RequestScoped
@ManagedBean
public class EnvBean implements Serializable{

	String env;

	public String getEnv() {
		return env;
	}

	Env selectedEnv;
	 public Env getSelectedEnv() {
		return selectedEnv;
	}

	public void setSelectedEnv(Env selectedEnv) {
		this.selectedEnv = selectedEnv;
	}

	List<Env> list = new ArrayList<Env>();
	
	List<Env> orch1 = new ArrayList<Env>();
	
	public List<Env> getOrch1() {
		return orch1;
	}

	public void setOrch1(List<Env> orch1) {
		this.orch1 = orch1;
	}

	public List<Env> getList() {
		return list;
	}

	public void setList(List<Env> list) {
		this.list = list;
	}

	public void setEnv(String env) {
		System.out.println(env+"   settingggg");
		this.env = env;
	}
	
	@PostConstruct
	public void init()
	{
		
		System.out.println("iiiiiiiii");
	}
	
	public EnvBean()
	{
		System.out.println("aaaaaa"+getEnv());
		Map<String,String> params=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();		
		this.env=params.get("env")		;
		System.out.println("Bbbbbbbbb"+env);
		selectedEnv=  new Env();
		selectedEnv.setEnv(env);
		selectedEnv.setBuild("19191-2334-34343-34344-3434");
		selectedEnv.setDesc("mye own envvv");
		selectedEnv.setRepdb("ADSDSDS");
		selectedEnv.setServicecount(102);
		
	        list.add(new Env("fs","fileserver","fileserver"));
	        list.add(new Env("mxls","mxlsserver","mxlsserver"));
	        list.add(new Env("hub","hubservice","hubserver"));
	        list.add(new Env("launcher","launcher","launcher"));
	        list.add(new Env("murexnet","murexnet","murexnet"));
	        
	 orch1.add(new Env("xldn93332@swwiss.com"));
	 orch1.add(new Env("xldn93443@swwiss.com"));
	 orch1.add(new Env("xldn93358@swwiss.com"));
	 
	}
	
}
