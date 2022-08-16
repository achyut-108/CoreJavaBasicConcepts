package com.datetime.concepts;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class LocalDateTimeDateComparison {

	static String incomingStartDate = "09-Dec-2020 16:45:43";
	static String dateFormat = "dd-MMM-yyyy HH:mm:ss";
	public static void main(String[] args) {
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat);
		LocalDateTime l_incomingStartDate = LocalDateTime.parse(incomingStartDate, dateTimeFormatter);
		
		System.out.println("l_incomingStartDate : " + l_incomingStartDate);
	}

	private boolean interestedPartyMappingForAParticularRange(String incomingStartDate, String incomingEndDate,
			Date existingStartDate, Date existingEndDate) {
		// The ip is associated for infinite duration
		// can not reduce the duration of the IP in this upload. Need to delete the IP
		// and then upload with new end date.
		// can not update the start date by this upload. Need to delete the IP and then
		// upload with new start date.
		if (existingStartDate == null || existingEndDate == null || incomingEndDate == null || incomingEndDate == null)
			return true;

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss");
		LocalDateTime defaultVal = LocalDateTime.now();
		LocalDateTime l_incomingStartDate = null;
		LocalDateTime l_existingStartDate = null;
		LocalDateTime l_incomingEndDate = null;
		LocalDateTime l_existingEndDate = null;

		if (Objects.nonNull(incomingStartDate)) {
			l_incomingStartDate = LocalDateTime.parse(incomingStartDate, dateTimeFormatter);
		}

		if (Objects.nonNull(incomingEndDate)) {
			l_incomingEndDate = LocalDateTime.parse(incomingEndDate, dateTimeFormatter);
		}

		if (Objects.nonNull(existingStartDate)) {
			l_existingStartDate = new java.sql.Timestamp(existingStartDate.getTime()).toLocalDateTime();
		}

		if (Objects.nonNull(existingEndDate)) {
			l_existingEndDate = new java.sql.Timestamp(existingEndDate.getTime()).toLocalDateTime();
		}

		// The incoming start date lies between the existing range (inclusive)
		// If incoming start date is smaller or equal to the existing start date
		// If incoming end date is smaller or equal to the existing end date
		if (l_incomingStartDate.compareTo(l_existingEndDate) <= 0
				|| l_incomingStartDate.compareTo(l_existingStartDate) <= 0
				|| l_incomingEndDate.compareTo(l_existingEndDate) <= 0) {
			return true;
		}

		return false;
	}

}
