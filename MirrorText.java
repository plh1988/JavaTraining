import java.util.*;
import java.lang.*;
public class MirrorText{

	public static void main(String [] args){
		System.out.println("Input Character Sequance");
		Scanner sc = new Scanner(System.in);
		String seqOriginal = sc.nextLine();
		//System.out.println(seqOriginal);

		char[] charSeq = seqOriginal.toCharArray();
		int seqLength = charSeq.length;
                List<String> mirroredTexts = new ArrayList<>();


		for(int a=0 ; a<seqLength-1 ; a++){
			int firstCharIndex = a;
		       	int secondCharIndex = a+1;
			//StringBuilder tempString = new StringBuilder();

			if(charSeq[firstCharIndex] == charSeq[secondCharIndex]){
				System.out.println("equal test "+charSeq[firstCharIndex]);

				boolean isMirrorEnd = false;
				StringBuilder checkedString = new StringBuilder();
				int index= firstCharIndex;
				int changer=0;
				while(!isMirrorEnd && (index-changer>=0)){
					if(charSeq[index-changer] == charSeq[index+1+changer]){
						checkedString.append(charSeq[index-changer]);
					}
					else{
						isMirrorEnd = true;
					}
					changer++;
				}
				String mirroredText = checkedString.toString();
				//System.out.println(mirroredText);
				if(mirroredText.length() > 2){
					mirroredTexts.add(mirroredText);
				}

			}
		}
		System.out.println("Mirrored texts : ");	
		for(String e:mirroredTexts){
			System.out.println(e);
		}	
	
	}
}
