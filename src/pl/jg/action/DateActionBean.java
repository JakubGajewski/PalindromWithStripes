package pl.jg.action;

import java.util.Date;

import org.joda.time.DateTime;

import net.sourceforge.stripes.action.*;

public class DateActionBean implements ActionBean {
	
	private static final String VIEW = "/WEB-INF/jsp/day.jsp";
	private ActionBeanContext context;
	private DateTime today;
	private String dayOfTheWeek;
	
	public DateTime getToday() {
		return today;
	}

	public void setToday(DateTime today) {
		this.today = today;
	}

	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}

	public void setDayOfTheWeek(String dayOfTheWeek) {
		this.dayOfTheWeek = dayOfTheWeek;
	}

	@Override
	public ActionBeanContext getContext() {
		return this.context;
	}

	@Override
	public void setContext(ActionBeanContext context) {
		this.context = context;
	}

	@DefaultHandler	
	public Resolution checkTheDay() {
		today = new DateTime();
		dayOfTheWeek = today.dayOfWeek().getAsText();
		return new ForwardResolution(VIEW);
	}
}
