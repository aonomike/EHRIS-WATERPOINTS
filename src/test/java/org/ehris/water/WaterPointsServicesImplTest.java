package org.ehris.water;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.ehris.water.services.impl.WaterPointsServicesImpl;
import org.junit.Test;


public class WaterPointsServicesImplTest {
	
	@Test
	public void testCountBrokenWaterPointsPerVillage() {
		List<WaterPoints> waterPointsList = new ArrayList<WaterPoints>();
		WaterPoints waterPointOne = new WaterPoints ();
		waterPointOne.setCommunities_villages("Kisumu");
		waterPointOne.setWater_point_condition("functioning");
		
		WaterPoints waterPointTwo = new WaterPoints ();
		waterPointTwo.setCommunities_villages("Kisumu");
		waterPointTwo.setWater_point_condition("broken");
		
		WaterPoints waterPointThree = new WaterPoints ();
		waterPointThree.setCommunities_villages("Ukwala");
		waterPointThree.setWater_point_condition("broken");
		
		WaterPoints waterPointFour = new WaterPoints ();
		waterPointFour.setCommunities_villages("Kisumu");
		waterPointFour.setWater_point_condition("broken");
		
		waterPointsList.add(waterPointFour);
		waterPointsList.add(waterPointThree);
		waterPointsList.add(waterPointTwo);
		waterPointsList.add(waterPointOne);
		
		WaterPointsServicesImpl waterPointServicesImpl = new  WaterPointsServicesImpl();
		int brokenWaterPoints = waterPointServicesImpl.countBrokenWaterPointsPerVillage("Kisumu",waterPointsList);
		assertEquals(brokenWaterPoints,2);
	}
	
	@Test
	public void testCountWaterPointsPerVillage(){
		List<WaterPoints> waterPointsList = new ArrayList<WaterPoints>();
		WaterPoints waterPointOne = new WaterPoints ();
		waterPointOne.setCommunities_villages("Kisumu");
		waterPointOne.setWater_point_condition("functioning");
		
		WaterPoints waterPointTwo = new WaterPoints ();
		waterPointTwo.setCommunities_villages("Kisumu");
		waterPointTwo.setWater_point_condition("broken");
		
		WaterPoints waterPointThree = new WaterPoints ();
		waterPointThree.setCommunities_villages("Ukwala");
		waterPointThree.setWater_point_condition("broken");
		
		WaterPoints waterPointFour = new WaterPoints ();
		waterPointFour.setCommunities_villages("Kisumu");
		waterPointFour.setWater_point_condition("broken");
		
		waterPointsList.add(waterPointFour);
		waterPointsList.add(waterPointThree);
		waterPointsList.add(waterPointTwo);
		waterPointsList.add(waterPointOne);
		
		WaterPointsServicesImpl waterPointServicesImpl = new  WaterPointsServicesImpl();
		int brokenWaterPoints = waterPointServicesImpl.countBrokenWaterPointsPerVillage("Ukwala",waterPointsList);
		assertEquals(brokenWaterPoints,1);
	}
	
	@Test
	public void testGetWaterPointsList() throws MalformedURLException {
		URL url = new URL("http://waterpoints-greid.rhcloud.com/api/waterfeed");
		WaterPointsServicesImpl waterPointsServicesImpl = new WaterPointsServicesImpl();
		List<WaterPoints> waterPoints = waterPointsServicesImpl.getWaterPointsList(url);
		assertNotNull(waterPoints);
	}
	
	@Test
	public void testGetCommunityRankingByPercentageOfBrokenWaterPoints() {
		List<WaterPoints> waterPointsList = new ArrayList<WaterPoints>();
		
		WaterPoints waterPointOne = new WaterPoints ();
		waterPointOne.setCommunities_villages("Kisumu");
		waterPointOne.setWater_point_condition("functioning");
		
		WaterPoints waterPointTwo = new WaterPoints ();
		waterPointTwo.setCommunities_villages("Kisumu");
		waterPointTwo.setWater_point_condition("broken");
		
		WaterPoints waterPointThree = new WaterPoints ();
		waterPointThree.setCommunities_villages("Ukwala");
		waterPointThree.setWater_point_condition("broken");
		
		WaterPoints waterPointFive = new WaterPoints ();
		waterPointFive.setCommunities_villages("Ukwala");
		waterPointFive.setWater_point_condition("abandoned");
		
		WaterPoints waterPointSix = new WaterPoints ();
		waterPointSix.setCommunities_villages("Bumala");
		waterPointSix.setWater_point_condition("broken");
		
		WaterPoints waterPointSeven = new WaterPoints ();
		waterPointSeven.setCommunities_villages("Kisumu");
		waterPointSeven.setWater_point_condition("broken");
		
		WaterPoints waterPointFour = new WaterPoints ();
		waterPointFour.setCommunities_villages("Kisumu");
		waterPointFour.setWater_point_condition("broken");
		
		WaterPoints waterPointEight = new WaterPoints ();
		waterPointEight.setCommunities_villages("Kisumu");
		waterPointEight.setWater_point_condition("broken");
		
		waterPointsList.add(waterPointFour);
		waterPointsList.add(waterPointThree);
		waterPointsList.add(waterPointTwo);
		waterPointsList.add(waterPointOne);
		waterPointsList.add(waterPointSeven);
		waterPointsList.add(waterPointSix);
		waterPointsList.add(waterPointFive);
		waterPointsList.add(waterPointEight);
		
		WaterPointsServicesImpl waterPointServicesImpl = new  WaterPointsServicesImpl();
		
		assertNotNull(waterPointServicesImpl.getCommunityRankingByPercentageOfBrokenWaterPoints(waterPointsList));
		
	}
	
	@Test
	public void testCountFunctionalWaterPoints() {
		List<WaterPoints> waterPointsList = new ArrayList<WaterPoints>();
		WaterPoints waterPointOne = new WaterPoints ();
		waterPointOne.setCommunities_villages("Kisumu");
		waterPointOne.setWater_point_condition("functioning");
		
		WaterPoints waterPointTwo = new WaterPoints ();
		waterPointTwo.setCommunities_villages("Kisumu");
		waterPointTwo.setWater_point_condition("broken");
		
		WaterPoints waterPointThree = new WaterPoints ();
		waterPointThree.setCommunities_villages("Ukwala");
		waterPointThree.setWater_point_condition("broken");
		
		WaterPoints waterPointFive = new WaterPoints ();
		waterPointFive.setCommunities_villages("Ukwala");
		waterPointFive.setWater_point_condition("abandoned");
		
		WaterPoints waterPointSix = new WaterPoints ();
		waterPointThree.setCommunities_villages("Bumala");
		waterPointThree.setWater_point_condition("broken");
		
		WaterPoints waterPointSeven = new WaterPoints ();
		waterPointSeven.setCommunities_villages("Kisumi");
		waterPointSeven.setWater_point_condition("broken");
		
		WaterPoints waterPointFour = new WaterPoints ();
		waterPointFour.setCommunities_villages("Kisumu");
		waterPointFour.setWater_point_condition("broken");
		
		WaterPoints waterPointEight = new WaterPoints ();
		waterPointEight.setCommunities_villages("Kisumu");
		waterPointEight.setWater_point_condition("functioning");
		
		waterPointsList.add(waterPointFour);
		waterPointsList.add(waterPointThree);
		waterPointsList.add(waterPointTwo);
		waterPointsList.add(waterPointOne);
		waterPointsList.add(waterPointSeven);
		waterPointsList.add(waterPointSix);
		waterPointsList.add(waterPointFive);
		waterPointsList.add(waterPointEight);
		
		WaterPointsServicesImpl waterPointServicesImpl = new  WaterPointsServicesImpl();
		
		assertEquals(waterPointServicesImpl.countFunctionalWaterPoints(waterPointsList),2);
		
	}
	
}
