package org.ehris.water.services.impl;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.ehris.water.WaterPointRanking;
import org.ehris.water.WaterPoints;
import org.ehris.water.services.WaterPointsServices;


public class WaterPointsServicesImpl implements WaterPointsServices{

	public int countFunctionalWaterPoints(List<WaterPoints> waterPoints) {
		int count=0;
	    for (int i=0; i< waterPoints.size(); i++) {
	    	if(waterPoints.get(i).getWater_point_condition().equalsIgnoreCase("functioning")) {
	    		count++;
	    	}	    	
	    }
		
	    return count;
    }

	public Map<String, Integer> getWaterPointsPerVillage(List<WaterPoints> waterPoints) {
	    Map<String, Integer> waterPointsPerVillageMap = new HashMap<String, Integer>();
	    
	    for(int i=0; i<waterPoints.size();i++) {
	    	if(!(waterPointsPerVillageMap.containsKey(waterPoints.get(i).getCommunities_villages()))) {
	    		waterPointsPerVillageMap.get(waterPoints.get(i).getCommunities_villages());
	    		waterPointsPerVillageMap.put(waterPoints.get(i).getCommunities_villages(), countWaterPointsPerVillage(waterPoints.get(i).getCommunities_villages(),waterPoints));
	    		System.out.println(waterPoints.get(i).getCommunities_villages()+ " Village has " +countWaterPointsPerVillage(waterPoints.get(i).getCommunities_villages(),waterPoints)+ " waterpoints \n\n\n");
	    		System.out.println("----------------------------------------------");
	    	}
	    	
	    }
	    
	    return waterPointsPerVillageMap;
    }

		

	public List<WaterPointRanking> getCommunityRankingByPercentageOfBrokenWaterPoints(List<WaterPoints> waterPoints) {
		Map <String, WaterPointRanking> waterPointRankingsMap  = new HashMap<String, WaterPointRanking>();
		List <WaterPointRanking> waterPointRankingsList = new ArrayList<WaterPointRanking>() ;
		for(int i=0; i<waterPoints.size();i++) {
			if (!(waterPointRankingsMap.containsKey(waterPoints.get(i).getCommunities_villages()))) {
				WaterPointRanking wpr = new WaterPointRanking();
				int countWaterPoints = countWaterPointsPerVillage(waterPoints.get(i).getCommunities_villages(),waterPoints);
				int countBrokenWaterPoints = countBrokenWaterPointsPerVillage(waterPoints.get(i).getCommunities_villages(), waterPoints);
				float brokenWaterPointPercentage = (countBrokenWaterPoints*100)/(countWaterPoints);
				
				wpr.setNumberOfBrokenWaterPoints(countBrokenWaterPoints);
				wpr.setNumberOfWaterPoints(countWaterPoints);
				wpr.setBrokenWaterPointPercentage(brokenWaterPointPercentage);
				wpr.setVillageName(waterPoints.get(i).getCommunities_villages());
				
				waterPointRankingsList.add(wpr);
				waterPointRankingsMap.put(waterPoints.get(i).getCommunities_villages(), wpr);				
			}			
		}
		Collections.sort(waterPointRankingsList);
		
		for (int i = 1; i<=waterPointRankingsList.size();i++) {
			waterPointRankingsList.get(i-1).setRank(i);
			System.out.println("Village Rank Based On BrokenwaterPoint Percentage\n\n");
			System.out.println("Village Name : "+waterPointRankingsList.get(i-1).getVillageName()+" ,Broken Water Points: " +waterPointRankingsList.get(i-1).getNumberOfBrokenWaterPoints()+" ,Total Water Points: " +waterPointRankingsList.get(i-1).getNumberOfWaterPoints()+" ,Broken Waterpoint Percentage: "+ waterPointRankingsList.get(i-1).getBrokenWaterPointPercentage()+ " ,Rank: "+waterPointRankingsList.get(i-1).getRank() );
		}
		
		return waterPointRankingsList;
    }
	
	public int countBrokenWaterPointsPerVillage(String villageName, List<WaterPoints> waterPoints) {
		int count = 0;
		for(int i=0; i<waterPoints.size();i++) {
			if (waterPoints.get(i).getCommunities_villages().equalsIgnoreCase(villageName) && waterPoints.get(i).getWater_point_condition().equalsIgnoreCase("broken")) {
				count ++;
			}
		}
		return count;
    }

	

	public List<WaterPoints> getWaterPointsList(URL url) {
		List<WaterPoints> waterPoints = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
		    waterPoints = mapper.readValue(url, new TypeReference<List<WaterPoints>>(){});
		    
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	    return  waterPoints;
    }
	
	public int countWaterPointsPerVillage(String villageName, List<WaterPoints> waterPoints) {
		int count = 0;
		for(int i=0; i<waterPoints.size();i++) {
			if (waterPoints.get(i).getCommunities_villages().equalsIgnoreCase(villageName)) {
				count ++;
			}
		}
		return count;
	}
	
}
