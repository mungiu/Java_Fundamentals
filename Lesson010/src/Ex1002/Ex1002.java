package Ex1002;

import java.text.DecimalFormat;

public class Ex1002
{
	public static void main(String[] args)
	{
		DecimalFormat format = new DecimalFormat();

		double[] chessBoard = new double[64];
		double grainsPerSquare = 1;
		int squarePosition = 0;

		double numberOfGrainsTotal = 0;

		// every next square is double the previous sequare
		do
		{
			for (squarePosition = 0; squarePosition < chessBoard.length; squarePosition++)
			{
				if (squarePosition == 0)
					chessBoard[squarePosition] = grainsPerSquare;
				else if (squarePosition >= 1)
					chessBoard[squarePosition] = grainsPerSquare *= 2;
			}
		} while (squarePosition < chessBoard.length);

		for (double d : chessBoard)
			numberOfGrainsTotal += d;

		System.out.printf("%.02f\n", chessBoard[63]);
		System.out.println(format.format(numberOfGrainsTotal));
	}
}
