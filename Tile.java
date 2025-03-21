class Tile{
	public static void details(String tileName, String tileMaterial, String tileSize,String tileFinish, int tileCost){
		System.out.println("Running details for Tile");
		System.out.println("Tile Name: " + tileName);
		System.out.println("Tile Material: " + tileMaterial);
		System.out.println("Tile Size: " + tileSize);
		System.out.println("Tile Finish: " + tileFinish);
		System.out.println("Tile Cost: ₹" + tileCost + " per sq. ft.");
}

}