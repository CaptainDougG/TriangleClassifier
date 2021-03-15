
public class TriangleClassifier {

	public static boolean isValidTriangle(int aOne, int aTwo, int aThree) {
		if((aOne + aTwo + aThree == 180) && (aOne > 0 && aTwo > 0 && aThree > 0)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String classifyByAngle(int aOne, int aTwo, int aThree) {
		if(aOne == aTwo && aOne == aTwo) {
			return "acute";
		}
		if(aOne == 90 || aTwo == 90 || aThree ==90) {
			return "right";
		}
		else {
			return "obtuse";
		}
	}
	
	public static String classifyBySide(int aOne, int aTwo, int aThree) {
		if(aOne == aTwo && aOne == aThree) {
			return "equilateral";
		}
		if(aThree == aOne || aThree == aTwo || aOne == aTwo) {
			return "isosceles";
		}
		else {
			return "scalene";
		}
	}
	
	public static String getClassification(int aOne, int aTwo, int aThree) {
		if ((aOne == 90 || aTwo == 90 || aThree ==90) && (aOne != aTwo && aOne != aThree)) {
			return "right scalene";
		}
		if ((aThree == aOne || aThree == aTwo || aOne == aTwo) && (aOne == 90 || aTwo == 90 || aThree ==90)) {
			return "right isosceles";
		}
		if ((aThree == aOne || aThree == aTwo || aOne == aTwo) && (aOne > 90 || aTwo > 90 || aThree > 90)) {
			return "obtuse isosceles";
		}
		if ((aOne != aTwo && aOne != aThree) && (aOne > 90 || aTwo > 90 || aThree > 90)) {
			return "obtuse scalene";
		}
		if (aOne == aTwo && aOne == aThree) {
			return "equilateral";
		}
		if ((aOne < 90 || aTwo < 90 || aThree < 90) && (aThree == aOne || aThree == aTwo || aOne == aTwo)) {
			return "acute isosceles";
		}
		if ((aOne < 90 || aTwo < 90 || aThree < 90) && (aOne != aTwo && aOne != aThree)) {
			return "acute scalene";
		}
	}
}
