package org.tum.gis.minisos.observation;


import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tum.gis.minisos.interfaces.Interface;
import org.tum.gis.minisos.interfaces.Rest52n.ListObservation52n;
import org.tum.gis.minisos.interfaces.SosOM.GetObservationResponse;


@RestController
public class ObservationController {

	// timeseries/id/observations
	// observationService.getObservation(id);
	
	@Autowired
	private ObservationService observationService;
	
	@RequestMapping(value = "/timeseries/{id}/observations" , produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Observation> getObservationList(@PathVariable int id) throws IOException{
		return observationService.getObservationList(id);
	}
	
	@RequestMapping(value = "/timeseries/{id}/observations", params = {"start", "end"} , produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Observation> getObservationList(@PathVariable int id,
												@RequestParam (value = "start") String startTime,
												@RequestParam (value = "end") String endTime) throws ParseException, IOException{
		return observationService.getObservationList(id,startTime,endTime);
	}
	
	@RequestMapping(value = "/timeseries/{id}/observations", params = {"start", "end", "format"}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ListObservation52n getObservationList(@PathVariable int id,
												@RequestParam (value = "start") String startTime,
												@RequestParam (value = "end") String endTime,
												@RequestParam (value = "format") String format) throws ParseException, IOException{
		//find a way to take only Rest52n as input to the value of format
		//then, create multiple functions with same name returning different types
		return observationService.getObservationList(id,startTime,endTime,format);
	}
	
	/*@RequestMapping(value = "/timeseries/{id}/observations", params = {"start", "end", "format"} , produces = {MediaType.APPLICATION_XML_VALUE})
	public GetObservationResponse getObservationList(@PathVariable int id,
												@RequestParam (value = "start") String startTime,
												@RequestParam (value = "end") String endTime,
												@RequestParam (value = "format") String format) throws ParseException, IOException{
		//find a way to take only Rest52n as input to the value of format
		//then, create multiple functions with same name returning different types
		return observationService.getObservationList(id,startTime,endTime,format);
	}*/
	
	
	
}
