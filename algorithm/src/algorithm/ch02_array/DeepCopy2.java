package algorithm.ch02_array;

import java.util.Arrays;

public class DeepCopy2 {
	public static void main(String[] args) {
		//깊은복사를 도와주는 메서드
		// clone();
		//System.arraycopy(원본 배열 객체, 원본 배열에서 복사할 시작점, 사본 배열객체, 사본 배열에서 복사할 시작점, 원본 배열의 요소를 복사할 개수);
		//Arrays.copyOf(...), Arrays.copyRange(...)는 System.arraycopy 오버로딩하여 구현한 함수
		String[] folderA = {"myComputer", "myDocument","rescycleBin"};
		System.out.println("clone()메서드 호출");
		String[] folderB = folderA.clone();
		folderB[0] ="newFolder";
		System.out.println("clone()메서드 결과");
		System.out.println("원본배열: "+Arrays.toString(folderA));
		System.out.println("사본배열: "+Arrays.toString(folderB));
		
		System.out.println("\n system.arrayCopy()메서드 호출");
		
		String[] folderC = new String[folderA.length];
		System.arraycopy(folderA, 0, folderC, 0, 2);
		folderC[0] ="newFolder";
		System.out.println("system,arrayCopy()메서드 결과");
		System.out.println("원본배열: "+Arrays.toString(folderA));
		System.out.println("사본배열: "+Arrays.toString(folderC));
			
		
	}
}
