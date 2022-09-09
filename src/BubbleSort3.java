
import java.util.Arrays;

public class BubbleSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,3,2,6};
		bubblesort3(arr);

	}
	static void bubblesort3(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        System.out.println(Arrays.toString(arr));
    }
	

}