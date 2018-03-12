package com.experience.dto;

import java.sql.Time;
import java.util.Date;

public class ReminderOrNoteDto {

	Integer reminderId;
	Date reminderDate;
	Time reminderTime;
	String message;

	public Integer getReminderId() {
		return reminderId;
	}

	public void setReminderId(Integer reminderId) {
		this.reminderId = reminderId;
	}

	public Date getReminderDate() {
		return reminderDate;
	}

	public void setReminderDate(Date reminderDate) {
		this.reminderDate = reminderDate;
	}

	public Time getReminderTime() {
		return reminderTime;
	}

	public void setReminderTime(Time reminderTime) {
		this.reminderTime = reminderTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

}
