package ioc.circulardependence.po;

public class BService {
	private CService cService;

	public void setcService(CService cService) {
		this.cService = cService;
	}
}
