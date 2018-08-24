package Testing;

import java.util.Arrays;
import java.util.Comparator;

public class Main
{
	public static void main(String[] args)
	{
		Object[][] arrayOfArrays2 = new Object[][] {};

		// Object[][] arrayOfArrays2 = new Object[][]
		// {
		// { 2, 0, 4, 3, 4, 2, 3 },
		// { 2, 2, 2 },
		// { 4 },
		// { 2, 1, 0, 4, 2 }, { },
		// { 2, 0, 4, 2, 0, 4 },
		// { 1, 4 },
		// { 2, 3, 2, 1, 2, 1, 4, 0 },
		// { 4, 4, 0, 2, 3, 4, 1, 1, 1 } };

		// Object[][] arrayOfArrays = new Object[4][];
		//
		// Object[] objArr1 = new Object[1];
		// objArr1[0] = new TestClass();
		//
		// Object[] objArr2 = new Object[2];
		// objArr2[0] = new TestClass();
		// objArr2[1] = new TestClass();
		//
		// Object[] objArr4 = new Object[4];
		// objArr4[0] = new TestClass();
		// objArr4[1] = new TestClass();
		// objArr4[2] = new TestClass();
		// objArr4[3] = new TestClass();
		//
		// arrayOfArrays[0] = objArr1;
		// arrayOfArrays[1] = objArr2;
		// arrayOfArrays[2] = null;
		// arrayOfArrays[3] = objArr4;

		// checking for null
		System.out.println(checkArray(arrayOfArrays2));

	}

	public static int checkArray(Object[][] arrayOfArrays)
	{
		// checking if the entire arrayList is null or if it has any index that is null
		if (arrayOfArrays == null || arrayOfArrays.length == 0)
			return 0;

		for (int i = 0; i < arrayOfArrays.length; i++)
			if (arrayOfArrays[i].length == 0 || arrayOfArrays[i] == null)
				return 0;

		// sorting the arrays by using an overridden compare() method
		Arrays.sort(arrayOfArrays, new Comparator<Object[]>()
		{
			public int compare(Object[] a, Object[] b)
			{
				return Integer.compare(a.length, b.length);
			}
		});

		// finding missing array
		for (int i = 0; i < arrayOfArrays.length - 1; i++)
			if (arrayOfArrays[i + 1].length - 1 > arrayOfArrays[i].length)
				return arrayOfArrays[i].length + 1;

		return 0;
	}
}
