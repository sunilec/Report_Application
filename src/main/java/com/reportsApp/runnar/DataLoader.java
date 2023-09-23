package com.reportsApp.runnar;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.reportsApp.entities.CitizenPlan;
import com.reportsApp.repository.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner{
	
	@Autowired
	private CitizenPlanRepository citizenPlanRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		citizenPlanRepository.deleteAll();
		
		// Cash Plan
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("John");
		c1.setGender("Male");
		c1.setPlaneName("Cash");
		c1.setPlanStatus("Approved!");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(50000.00);
		
		
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Smith");
		c2.setGender("Male");
		c2.setPlaneName("Cash");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("Resnt Income");
		
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Cathy");
		c3.setGender("Female");
		c3.setPlaneName("Cash");
		c3.setPlanStatus("Terminated!");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmt(50000.00);
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminationRsn("Employed");
		
		
		// Food Plan
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Devid");
		c4.setGender("Male");
		c4.setPlaneName("Food");
		c4.setPlanStatus("Approved!");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmt(4000.00);
		
		
		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Robert");
		c5.setGender("Male");
		c5.setPlaneName("Food");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("Property Income");
		
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Orlen");
		c6.setGender("Female");
		c6.setPlaneName("Food");
		c6.setPlanStatus("Terminated!");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenefitAmt(50000.00);
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminationRsn("Employed");
		
		
		// Medical Plan Data
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Prince");
		c7.setGender("Male");
		c7.setPlaneName("Medical");
		c7.setPlanStatus("Approved!");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmt(4000.00);
		
		
		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Karan");
		c8.setGender("Male");
		c8.setPlaneName("Medical");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("Property Income");
		
		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Morish");
		c9.setGender("Female");
		c9.setPlaneName("Food");
		c9.setPlanStatus("Terminated!");
		c9.setPlanStartDate(LocalDate.now().minusMonths(4));
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmt(50000.00);
		c9.setTerminatedDate(LocalDate.now());
		c9.setTerminationRsn("Govt Job");
		
		
		// Employment Plan Data
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Buttler");
		c10.setGender("Male");
		c10.setPlaneName("Employment");
		c10.setPlanStatus("Approved!");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenefitAmt(4000.00);
		
		
		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Steve");
		c11.setGender("Male");
		c11.setPlaneName("Employment");
		c11.setPlanStatus("Denied");
		c11.setDenialReason("Property Income");
		
		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("Kumali");
		c12.setGender("Female");
		c12.setPlaneName("Employment");
		c12.setPlanStatus("Terminated!");
		c12.setPlanStartDate(LocalDate.now().minusMonths(4));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBenefitAmt(50000.00);
		c12.setTerminatedDate(LocalDate.now());
		c12.setTerminationRsn("Govt Job");
		
		
		List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
		
		citizenPlanRepository.saveAll(list);
		
		
	}
	
}
