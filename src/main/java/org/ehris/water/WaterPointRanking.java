package org.ehris.water;


public class WaterPointRanking implements Comparable<WaterPointRanking>{
	private String villageName;
	private int numberOfBrokenWaterPoints;
	private int numberOfWaterPoints;
	private float brokenWaterPointPercentage;
	
    /**
     * @return the brokenWaterPointPercentage
     */
    public float getBrokenWaterPointPercentage() {
    	return brokenWaterPointPercentage;
    }

	
    /**
     * @param brokenWaterPointPercentage2 the brokenWaterPointPercentage to set
     */
    public void setBrokenWaterPointPercentage(float brokenWaterPointPercentage2) {
    	this.brokenWaterPointPercentage = brokenWaterPointPercentage2;
    }

	private int rank;
	
    /**
     * @return the villageName
     */
    public String getVillageName() {
    	return villageName;
    }
	
    /**
     * @param villageName the villageName to set
     */
    public void setVillageName(String villageName) {
    	this.villageName = villageName;
    }
	
    /**
     * @return the numberOfBrokenWaterPoints
     */
    public int getNumberOfBrokenWaterPoints() {
    	return numberOfBrokenWaterPoints;
    }
	
    /**
     * @param numberOfBrokenWaterPoints the numberOfBrokenWaterPoints to set
     */
    public void setNumberOfBrokenWaterPoints(int numberOfBrokenWaterPoints) {
    	this.numberOfBrokenWaterPoints = numberOfBrokenWaterPoints;
    }
	
    /**
     * @return the numberOfWaterPoints
     */
    public int getNumberOfWaterPoints() {
    	return numberOfWaterPoints;
    }
	
    /**
     * @param numberOfWaterPoints the numberOfWaterPoints to set
     */
    public void setNumberOfWaterPoints(int numberOfWaterPoints) {
    	this.numberOfWaterPoints = numberOfWaterPoints;
    }
	
    /**
     * @return the rank
     */
    public int getRank() {
    	return rank;
    }
	
    /**
     * @param rank the rank to set
     */
    public void setRank(int rank) {
    	this.rank = rank;
    }
    
    public WaterPointRanking (){
    	
    }


	public int compareTo(WaterPointRanking waterPointRanking) {
	    float comparePercentages = ((WaterPointRanking)waterPointRanking).getBrokenWaterPointPercentage();
	    //ascending order
	  		return (int) ( comparePercentages - this.brokenWaterPointPercentage);
	  		
  		//descending order
  		//return compareQuantity - this.quantity;
	 
    }
}
