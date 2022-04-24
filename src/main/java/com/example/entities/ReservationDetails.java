package com.example.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ReservationDetails {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		int ReservationID;
		int ResourceID;
		int UserID;
		String GroupID;
		String Type;
		LocalDate StartDate;
		LocalDate EndDate;
		LocalDateTime StartTime;
		LocalDateTime EndTime;
		String Status;
		public ReservationDetails() {
			
		}
		public ReservationDetails(int reservationID, int resourceID, int userid, String groupID, String type,
				LocalDate startDate, LocalDate endDate, LocalDateTime startTime, LocalDateTime endTime, String status) {
			super();
			ReservationID = reservationID;
			ResourceID = resourceID;
			UserID = userid;
			GroupID = groupID;
			Type = type;
			StartDate = startDate;
			EndDate = endDate;
			StartTime = startTime;
			EndTime = endTime;
			Status = status;
		}
		public int getReservationID() {
			return ReservationID;
		}
		public void setReservationID(int reservationID) {
			ReservationID = reservationID;
		}
		public int getResourceID() {
			return ResourceID;
		}
		public void setResourceID(int resourceID) {
			ResourceID = resourceID;
		}
		public int getUserid() {
			return UserID;
		}
		public void setUserid(int userid) {
			UserID = userid;
		}
		public String getGroupID() {
			return GroupID;
		}
		public void setGroupID(String groupID) {
			GroupID = groupID;
		}
		public String getType() {
			return Type;
		}
		public void setType(String type) {
			Type = type;
		}
		public LocalDate getStartDate() {
			return StartDate;
		}
		public void setStartDate(LocalDate startDate) {
			StartDate = startDate;
		}
		public LocalDate getEndDate() {
			return EndDate;
		}
		public void setEndDate(LocalDate endDate) {
			EndDate = endDate;
		}
		public LocalDateTime getStartTime() {
			return StartTime;
		}
		public void setStartTime(LocalDateTime startTime) {
			StartTime = startTime;
		}
		public LocalDateTime getEndTime() {
			return EndTime;
		}
		public void setEndTime(LocalDateTime endTime) {
			EndTime = endTime;
		}
		public String getStatus() {
			return Status;
		}
		public void setStatus(String status) {
			Status = status;
		}
		@Override
		public String toString() {
			return "ReservationDetails [ReservationID=" + ReservationID + ", ResourceID=" + ResourceID + ", Userid="
					+ UserID + ", GroupID=" + GroupID + ", Type=" + Type + ", StartDate=" + StartDate + ", EndDate="
					+ EndDate + ", StartTime=" + StartTime + ", EndTime=" + EndTime + ", Status=" + Status + "]";
		}

}