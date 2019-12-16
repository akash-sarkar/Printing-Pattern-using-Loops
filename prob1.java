import java.util.Scanner;

class prob1{
    static int size(int n){
        int x=1;
        for(int i=0;i<n-1;i++){
            x+=2;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int s=size(n);
        int arr[][]=new int[s][s];
        int x=n;
        for(int i=0;i<n;i++){
            for(int j=i;j<s-i;j++){
                arr[i][j]=x;
                arr[j][i]=x;
                arr[j][s-i-1]=x;
                arr[s-i-1][j]=x;
            }
            x--;
        }
        for(int q = 0; q<s; q++)
        {
            for(int w = 0; w<s; w++)
            {
                System.out.print(arr[q][w]+" ");
            }
            System.out.println();
        }
}
}