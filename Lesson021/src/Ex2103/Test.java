package Ex2103;

public class Test
{
	public static void main(String[] args)
	{
		Toy[] toysArr = new Toy[3];

		Football ft = new Football(2, 10);
		Handball hb = new Handball(5, 10);
		Lego lg = new Lego(10, 1000);

		toysArr[0] = ft;
		toysArr[1] = hb;
		toysArr[2] = lg;

		for (int i = 0; i < toysArr.length; i++)
			System.out.println(toysArr[i].play());
	}
}
