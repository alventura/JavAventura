package com.class23;

public class Test {

	public static void main(String[] args) {
		System.out.println("----Creating Employee object----");
		Employee emp=new Employee();
		System.out.println(Employee.department);
		Employee.work();
		//emp.work(); not preferred way
		emp.salary=90000;
		emp.getPaid();
		
		System.out.println("----Creating Scrum Team object----");
		ScrumTeam st=new ScrumTeam();
		ScrumTeam.work();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		st.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo,Sprint Retro,";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		System.out.println("---Creating Developer object---");
		Developer dev =new Developer();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprit backlog";
		dev.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();
		
		System.out.println("---Creating Tester object---");
		Tester qa =new Tester();
		qa.salary=100000;
		qa.getPaid();
		qa.artifacts="Sprit backlog";
		qa.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();
	
		System.out.println("---Creating Bussiness Analyst object---");
		BussinessAnalyst ba =new BussinessAnalyst();
		ba.salary=85000;
		ba.getPaid();
		ba.artifacts="Sprit backlog, Product Backlog";
		ba.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();
		
		System.out.println("---Creating Scrum Master object---");
		ScrumMaster sm =new ScrumMaster();
		sm.salary=90000;
		sm.getPaid();
		sm.artifacts="Burn Down Chart";
		sm.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.driveScrumMeetings();
		
		System.out.println("---Creating Product Owner object---");
		ProductOwner po =new ProductOwner();
		po.salary=150000;
		po.getPaid();
		po.artifacts="Sprit backlog, Product Backlog";
		po.ceremonies="Sprit grooming, Sprint Planning, Sprint Demo";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBacklog();
		po.talkToTheClient();
		
		System.out.println("---Creating Automation tester object---");
		AutomationTester auto =new AutomationTester();
		auto.salary=90000;
		auto.getPaid();
		auto.artifacts="Sprit backlog";
		auto.ceremonies="Sprit grooming, Sprint Planning, Sprint Demo";
		auto.workOnArtifacts();
		auto.attendScrumMeetings();
		auto.codeInJava();
		
		System.out.println("---Creating Automation Manual tester object---");
		manualTester manual =new manualTester();
		manual.salary=90000;
		manual.getPaid();
		manual.artifacts="Sprint backlog";
		manual.ceremonies="Sprit grooming, Sprint Planning, Sprint Demo";
		manual.workOnArtifacts();
		manual.attendScrumMeetings();
		manual.testManually();
		
		
	}

}
