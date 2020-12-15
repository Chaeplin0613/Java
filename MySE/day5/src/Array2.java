
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [][]arr;
//		arr = new int[3][2];
//		System.out.println(arr.length); //3 
//		System.out.println(arr[0].length); //2
//		
//		System.out.println(arr); //참조 메모리 정보값만 들어있음
//		System.out.println(arr[0]); //참조 메모리 정보값만 들어있음
//		
//		System.out.println(arr[0][0]); //0 //0행 0열값 
//		System.out.println(arr[2][1]); //0 //2행 1열값 
		
//		arr[0][0] = 1;
//		arr[0][1] = 1;
//		
//		arr[1][0] = 2;
//		arr[1][1] = 2;
//		
//		arr[2][0] = 3;
//		arr[2][1] = 3;
		
		//내코드 
		//0행에는 1, 1행에는 2, 2행에는 3이 저장
		
//		int [][]arr;
//		arr = new int[3][2];
//		int rowSize = arr.length;
//		int colSize = arr[0].length;
//		int num=1;
//		for(int i = 0; i<rowSize; i++) {
//			for(int j = 0; j<colSize; j++) {
//				arr[i][j] = num;
//				num++;
//			}
//		}
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//
//		System.out.println(arr[2][0]);
//		System.out.println(arr[2][1]);
		
		//강사님 코드
//		int rowSize = arr.length;
//		int colSize = arr[0].length;
//		for(int row=0; row<rowSize; row++) {
//			arr[row][0] = row+1;
//			arr[row][1] = row+1
//		}
		
		//각 행 열에 알파벳 A부터 F까지로 채워넣기
//		char [][]cArr;
//		cArr = new char[3][2];
//		int rowSize = cArr.length;
//		int colSize = cArr[0].length;
//		
//		char c = 'A';
//		for(int i = 0; i<rowSize; i++) {
//			for(int j = 0; j<colSize; j++) {
//				cArr[i][j] = c;
//				c++;
//			}
//		}
//		System.out.println(cArr[0][0]);
//		System.out.println(cArr[0][1]);
//		System.out.println(cArr[1][0]);
//		System.out.println(cArr[1][1]);
//		System.out.println(cArr[2][0]);
//		System.out.println(cArr[2][1]);
//		
		
//		char[][] cArr2 = new char[5][];
//		cArr2[0] = new char[1]; //new char[n] n개만큼 열을 만들겠다.
//		cArr2[1] = new char[2];
//		cArr2[2] = new char[3];
//		cArr2[3] = new char[4];
//		cArr2[4] = new char[5];
		
		
		
		
		
															//★★★이해안됨//★★★
//		char[][] cArr2 = new char[5][ ];
//		
//		//열 만드는 작업
//		int rowSize = cArr2.length; //5
//		for(int row=0; row<rowSize; row++) {       
//			cArr2[row] = new char[row+1]; //0번행에 [0+1]개의 열을 만들겠다.
//		}
//		
//		//각 행 열에 ★ 삽입하는 작업
//		for(int row=0; row<rowSize; row++) {
//			for(int col=0; col<cArr2[row].length; col++) {
//				cArr2[row][col] = '★';
//			}
//		}
//		
//		for(int row=0; row<rowSize; row++) {
//			for(int col=0; col<cArr2[row].length; col++) {
//				System.out.print(cArr2[row][col]);
//			}
//			System.out.println();
//		}
		
		
		
		
		
			
		//파스칼의 삼각형 채워넣기      row col
//		int[][] arr3; //배열선언
//		arr3 = new int[7] [ ]; //생성시 행수지정
//		int rowSize = arr3.length;
//		int colSize = arr3[row].length;
//		for(int row=0; row<rowSize; row++) { //행별 열수지정
//			arr3[row] = new int[row+1];
//		}
//		
//		for(int row=0; row<rowSize; row++) { //행열에 값대입
//			colSize = arr3[row].length;
//			arr3[row][0] = 1;
//			arr3[row][colSize-1] = 1;
//			for(int col=0; col<colSize-1; col++) {
//				if(row>0) {
//					arr3[row][col] = arr3[row-1][col-1] + arr3[row-1][col];
//				}
//			}
//		}
//		for(int row = 0; row<colSize; row++) {
//			colSize = arr3[row].length;
//			for(int col=0; col<colSize; col++) {
//				System.out.println(arr3[row][col]);
//			}
//			System.out.println();
//		}

		//arr4의 값을 오른쪽으로 90도 회전시켜서 arr5에 삽입 
		//원본의 열값이 대상본의 행값으로 사용 //2-원본의 행값을 하면 대상본의 열값이 된다.
		//규칙 발견이 가장 중요
		//                  0행		1행           2행                                  //★★★이해안됨//★★★
//		int [][] arr4 = {{1,2,3},{4,5,6},{7,8,9}};
//		int [][] arr5 = new int[3][3];
//		int rowSize=arr4.length;
//		int colSize=arr4[0].length;
//		for(int row=0; row<rowSize; row++) {
//			for(int col=0; col<colSize; col++) {
//				arr5[col][(rowSize-1)-row] = arr4[row][col];
//			}
//		}
//		
//		for(int row=0; row<rowSize; row++) {
//			for(int col=0; col<colSize; col++) {
//				System.out.print(arr5[row][col]);
//			}
//			System.out.println();
//		}
//		
		
		

		}
	}

