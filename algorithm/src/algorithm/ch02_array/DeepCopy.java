package algorithm.ch02_array;

import java.util.Arrays;

public class DeepCopy {
	public static void main(String[] args) {
		String[] folderA = {"myComputer", "myDocument"};
		String[] folderB = new String[folderA.length];
		System.out.println("복사전");
		System.out.println("folderA"+Arrays.toString(folderA));
		System.out.println("folderB"+Arrays.toString(folderB));
		System.out.println();
		for(int i = 0; i<folderA.length;i++) {
			folderB[i]=folderA[i];
		}
		System.out.println("복사후");
		System.out.println("folderA"+Arrays.toString(folderA));
		System.out.println("folderB"+Arrays.toString(folderB));
		System.out.println();
		
		folderB[0]="newBcomputer";
		folderB[1]="newBdocument";
		System.out.println("folderB 변경 후");
		System.out.println("folderA"+Arrays.toString(folderA));
		System.out.println("folderB"+Arrays.toString(folderB));
	}
}
