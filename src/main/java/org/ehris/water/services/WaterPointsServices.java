package org.ehris.water.services;

import java.net.URL;
import java.util.List;
import java.util.Map;

import org.ehris.water.WaterPointRanking;
import org.ehris.water.WaterPoints;


public interface WaterPointsServices {
	public int countFunctionalWaterPoints(List<WaterPoints> waterPoints);
	
	public Map<String, Integer> getWaterPointsPerVillage(List<WaterPoints> waterPoints);
	
	public List<WaterPointRanking> getCommunityRankingByPercentageOfBrokenWaterPoints(List<WaterPoints> waterPoints);
	
	public List<WaterPoints> getWaterPointsList(URL fileLocation);
	
}
