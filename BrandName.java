package in.nit.workshop;

public class BrandName {

	public static void main(String[] args) {
		
		//declare array
		String BrandName[] = {"puma","mrf","kingfisher"};
	    for (int index = 0; index <BrandName.length; index++){
		System.out.println(BrandName[index]);
				}
		//declare array
	    System.out.println("reverse array elements");
		for (int index = BrandName.length-1; index>=0; index--){
		System.out.println(BrandName[index]);

	}
	}
}

