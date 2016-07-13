package squaretriangle;
//Made by drkspace
public class Main {

	public static void main(String[] args) {

		double previous=0;
		double i = 0;
		
		while(true){
			i++;
			double squared = i*i;

			for(double k = previous; k<squared; k++){
				double triangle= ((k+1)*k)/2;
				
				if(triangle>squared) break;
				
				if(triangle==squared) {
					System.out.println(squared+": "+i+": "+k);
					previous=k;
					break;
				}
			}

		}

	}

}
