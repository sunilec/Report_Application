package com.reportsApp.service;

import java.util.List;

import com.reportsApp.entities.CitizenPlan;
import com.reportsApp.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanName();
	
	public List<String> getPlanStatus();
	
	// For filter we take SearchRequest as parameter
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportPdf();
	
	
	
}
