import java.util.*;
class Matrix{
    // sorting non boundary elements problem
    public static int[] bubbleSort( int a[] ){
        int temp;
        for(int i=0; i < a.length-1;i++){
            for(int x=0;x < a.length-i-1;x++){
                if(a[x+1] < a[x]){
                    temp=a[x];
                    a[x] = a[x+1];
                    a[x+1] = temp;
                }
            }
        }
        return a;
    }
 
    public static void displayMatrix(int A[][]){
        for( int row = 0 ; row < A.length; row++ ){
            for( int col = 0 ; col < A[ row ].length ; col++ ){
                System.out.print( "\t" + A[ row ][ col ]);
            }
            System.out.println();
        }
    }
 
    public static int displayMatrixDiagonals(int A[][]){
        int sumOfDiagonals=0;
        for( int row = 0 ; row < A.length; row++ ){
            for( int col = 0 ; col < A[ row ].length ; col++ ){
                System.out.print( "\t" );
                if( row == col || row == A.length - 1 - col ){ 
                    System.out.print(A[ row ][ col ]);
                    sumOfDiagonals += A[ row ][ col ];
                }else{ 
                    System.out.print( " " );
                }
            }
            System.out.println();
        }
        return sumOfDiagonals;
    }
 
    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );
        System.out.print( "INPUT : " );
        int M = sc.nextInt();
        if( M > 3 && M < 10 ){
            int A[][] = new int[M][M];
            int n[] = new int[ M*M - 2*M - 2*(M-2) ];
            int i=0;
            for( int row = 0 ; row < M; row++ ){
                for( int col = 0 ; col < M ; col++ ){
                    A[ row ][ col ] = sc.nextInt();
                    //check for non-border elements
                    if( row > 0 && row < M-1 && col > 0 && col < M-1 ){
                        //store non border elements in array n
                        n[ i++ ] = A[ row ][ col ];
                        System.err.print(row+", "+col+"\t");
                    }
 
                }
            }
            System.out.println( "ORIGINAL MATRIX : " );
            displayMatrix( A );
            //sort the array n
            n = bubbleSort( n );
            //display(n);
            i=0;
            for( int row = 1 ; row < M - 1  ; row++ ){
                for( int col = 1 ; col < M - 1  ; col++ ){
                    A[ row ][ col ] = n[ i++ ];
                }
            }
             
            System.out.println( "REARRANGED MATRIX : " );
            displayMatrix( A );
            System.out.println( "DIAGONAL ELEMENTS : " );
            int sumOfDiagonals = displayMatrixDiagonals(A);
            System.out.println( "SUM OF DIAGONAL ELEMENTS = " + sumOfDiagonals );
        }else{
            System.out.println( "OUTPUT: THE SIZE OF THE MATRIX IS OUT OF RANGE" );
        }
    }
}