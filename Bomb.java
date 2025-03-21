class Bomb{
	public static void details(String bombName, String explosiveType, int blastRadius, String detonationMethod, float weight, String fuseType, int activationTime, String originCountry, int shockwaveSpeed, float destructivePower){
		System.out.println("Running displayBombInfo for Bomb");
		System.out.println("Bomb Name: " + bombName);
		System.out.println("Explosive Type: " + explosiveType);
		System.out.println("Blast Radius: " + blastRadius + " meters");
		System.out.println("Detonation Method: " + detonationMethod);
		System.out.println("Weight: " + weight + " kg");
		System.out.println("Fuse Type: " + fuseType);
		System.out.println("Activation Time: " + activationTime + " seconds");
		System.out.println("Origin Country: " + originCountry);
		System.out.println("Shockwave Speed: " + shockwaveSpeed + " m/s");
		System.out.println("Destructive Power: " + destructivePower + " kilotons/megajoules");
	}

}