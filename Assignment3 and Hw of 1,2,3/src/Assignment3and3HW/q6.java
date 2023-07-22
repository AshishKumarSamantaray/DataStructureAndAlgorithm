package Assignment3and3HW;

public class q6 {

	public static void main(String[] args) {
		Box<Double> a= new Box<>(1.9,2.2);//an object created like this
		Box<Integer> b= new Box<Integer>(1,2);// also like this
		Box<String> c= new Box<>("Hello","Hi");
		Box<Double> d= new Box<>(1.9,2.2);
		B f = new B();
		B g = new B();
		Box<B> e= new Box<>(f,g);//object type generics
	}

}

class Box<T>{
	T a;
	T b;
	Box(T a, T b)
	{this.a = a;this.b=b;}
}

class B{
	B(){System.out.println("Just for Demo");}
}