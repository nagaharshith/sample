import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;



@ManagedBean
@ViewScoped
public class EnvService {

	
	List<Service> list=new ArrayList<Service>();

	public List<Service> getList() {
		return list;
	}

	public void setList(List<Service> list) {
		this.list = list;
	}

	public Service selectedService;
	
	
	public Service getSelectedService() {
		return selectedService;
	}

	public void setSelectedService(Service selectedService) {
		this.selectedService = selectedService;
	}

	public void gwtService()
	{
		
		list.add(new Service("1","one","one","one"));
		list.add(new Service("2","one","one","one"));
		list.add(new Service("3","one","one","one"));
		list.add(new Service("4","one","one","one"));
		list.add(new Service("5","one","one","one"));
		list.add(new Service("6","one","one","one"));
		list.add(new Service("7","one","one","one"));
		list.add(new Service("8","one","one","one"));
		list.add(new Service("9","one","one","one"));
		
		
	}
	
	public void update(ActionEvent event)
	{
		
		System.out.println(selectedService.getServiceName());
	}
}
