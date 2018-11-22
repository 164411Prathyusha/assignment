package com.practice.date;

public  class TestRecord {
  MyDate startdate;
   MyDate enddate;
    int actualdifference;



public TestRecord(MyDate startdate,MyDate enddate,int actualdifference) {
	super();
	this.startdate=startdate;
	this.enddate=enddate;
	this.actualdifference=actualdifference;
}

public  MyDate getStartdate() {
	return startdate;
}

public  void setStartdate(MyDate startdate) {
	this.startdate = startdate;
}

public  MyDate getEnddate() {
	return enddate;
}

public  void setEnddate(MyDate enddate) {
	this.enddate = enddate;
}

public  int getActualdifference() {
	return actualdifference;
}

public void setActualdifference(int actualdifference) {
	this.actualdifference = actualdifference;
}

@Override
public String toString() {
	return "TestRecord [startdate=" + startdate + ", enddate=" + enddate
			+ ", actualdifference=" + actualdifference + "]";
}
   
}
