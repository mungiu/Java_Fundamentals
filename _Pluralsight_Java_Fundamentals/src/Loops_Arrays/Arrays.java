package Loops_Arrays;

public class Arrays
{
	public static void main(String[] args)
	{
		float[] floatArr = new float[3];
		floatArr[0] = 1;
		floatArr[1] = 2;
		floatArr[2] = 3;

		float sum = 0.0f;

		// sum of all array elements
		for (int i = 0; i < floatArr.length; i++)
			sum += floatArr[i];

		System.out.println(sum);
		// ========================================================================================
		// SHORT VERSION
		float sum2 = 0.0f;
		float[] floatArrShort =
		{ 0, 1, 2, 3 };

		for (int i = 0; i < floatArrShort.length; i++)
			sum2 += floatArrShort[i];

		System.out.println(sum2);

		// =========================================================================================
		// (for each) loop

		// printing out every element of the array
		for (float f : floatArrShort)
			System.out.println(f);
	}
}
