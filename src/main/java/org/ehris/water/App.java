package org.ehris.water;

import java.net.URL;
import java.util.List;
import java.util.Map;

import org.ehris.water.services.impl.WaterPointsServicesImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {  	
    	
    	try {
    		WaterPointsServicesImpl waterPointsServices = new WaterPointsServicesImpl();
    		URL url = new URL("http://waterpoints-greid.rhcloud.com/api/waterfeed");
    		//String fileLocation = "C:\\Users\\maono.KEMRICDC\\Downloads\\water-points.json";
    		List <WaterPoints> waterPointsList = waterPointsServices.getWaterPointsList(url);
    		int numberOfFunctionalWaterPoints = waterPointsServices.countFunctionalWaterPoints(waterPointsList);
    		System.out.println("Number of Functional Water Points is :"+ numberOfFunctionalWaterPoints+" \n\n");
    		System.out.println("NUMBER OF WATER POINTS PER VILLAGE \n");
    		System.out.println("------------------------------------------- \n");
    		Map<String, Integer> waterPoinitsPerVillageMap = waterPointsServices.getWaterPointsPerVillage(waterPointsList);
    		List<WaterPointRanking> waterPointRanking = waterPointsServices.getCommunityRankingByPercentageOfBrokenWaterPoints(waterPointsList);
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
        
    }
}
