package no.imr.geoexplorer.admindatabase.mybatis.pojo;

public class HovedtemaEnNo {
	private long hovedtemaerId;
	private String title;
	private String alternateTitle; 
	private String abstracts;
	
	public long getHovedtemaerId() {
		return hovedtemaerId;
	}
	public void setHovedtemaerId(long hovedtemaerId) {
		this.hovedtemaerId = hovedtemaerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAlternateTitle() {
		return alternateTitle;
	}
	public void setAlternateTitle(String alternateTitle) {
		this.alternateTitle = alternateTitle;
	}
	public String getAbstracts() {
		return abstracts;
	}
	public void setAbstracts(String abstracts) {
		this.abstracts = abstracts;
	}
}
