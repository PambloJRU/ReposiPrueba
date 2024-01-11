package ej1;

public class IsTriangle {

	public static boolean isATriangle(int SideA,int SideB,int SideC) {
		
		if(triangleVerifications(SideA,SideB,SideC))
		return SideA+SideB > SideC && SideB+SideC > SideA && SideC+SideA > SideB;
		else
			return false;
	}
	
	public static boolean triangleVerifications(int SideA,int SideB,int SideC) {
		
		return SideA >= 1 && SideB >= 1 && SideC >= 1;
		
	}
	
	private static int return5() {
		return 5;
	}
	
}
