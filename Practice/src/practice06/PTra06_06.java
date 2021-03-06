package practice06;

/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□1.2.3.4.5
		 * ■□□□□6.7.8.9.10
		 * ■■□□□11,12.13.14.15
		 * ■■■□□16,17,18.19.20
		 * ■■■■□21,22,23,24.25
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("■");
			}
			for (int j = 5; j > i; j--) {
				System.out.print("□");
			}
			System.out.println();
		}
	}
}
