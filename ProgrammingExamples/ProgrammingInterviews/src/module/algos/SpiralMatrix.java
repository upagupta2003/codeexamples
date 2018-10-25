package module.algos;

public class SpiralMatrix {
	
	public static int[] spiralMatrix(int[][] matrix){ //[[1,2]]
		int columnLength = matrix[0].length;  //2
		int rowLength = matrix.length;  //1
		int[] result = new int[rowLength*columnLength]; //size = 2
		
		int elements = rowLength*columnLength; //2
		int rowStart=0, columnStart=0;  
		int rowEnd=rowLength-1, columnEnd=columnLength-1; //0,1
		int current=0;
		while(current<elements){ //0<2
			System.out.println("left to right");
			for(int i=columnStart; i<=columnEnd; i++){ // col : 0 -->1, rows: 0
				result[current] = matrix[rowStart][i];
				current++;
			}
			rowStart++;   							//rows: 1
			
			System.out.println("top to bottom");
			for(int i=rowStart ; i<=rowEnd; i++){       //colE: 1, row: 1 --> 1
				result[current] = matrix[i][columnEnd];
				current++;
			}
			columnEnd--;
			
//			System.out.println(rowStart+" "+rowEnd);
			if(rowStart<=rowEnd){
				System.out.println("right to left");
				for(int i=columnEnd; i>=columnStart; i--){
					result[current] = matrix[rowEnd][i];
					current++;
				}
				rowEnd--;
				System.out.println("bottom to up");
				for(int i=rowEnd; i>=rowStart ; i--){
					result[current] = matrix[i][columnStart];
					current++;
				}
				columnStart++;
			}
				
		}
		return result;
	}
		
	public static void main(String[] args){
		
		int[][] arr = new int[2][1];
		arr[0][0] = 1;
		arr[0][1] = 2;  //1 2
		arr[1][0] = 3;	//3 4 
		arr[1][1] = 4;	//5 6
		arr[2][0] = 5;
		arr[2][1] = 6;
//		
		int[] res = spiralMatrix(arr);
		
		for(int i=0; i<res.length; i++){
			System.out.print(res[i]+" ");
		}
	}

}
