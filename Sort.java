	import java.util.Arrays;
	import java.util.Comparator;
	

	public class Sort
	{
	  public static void selectionSort(int[] arr)
	  {
	    for (int i = 0; i < arr.length - 1; ++i)
	    {
	      int minIndex = i;
	      for (int j = i + 1; j < arr.length; ++j)
	      {
	        if (arr[j] < arr[minIndex])
	        {
	          minIndex = j;
	        }
	      }
	      int temp = arr[i];
	      arr[i] = arr[minIndex];
	      arr[minIndex] = temp;
	    }

		}

	  }


