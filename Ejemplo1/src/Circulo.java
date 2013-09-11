//fichero Circulo.java

public class Circulo extends Geometria{
    static int numCirculos=0;
    public static final double PI=3.14159265358979323846;
    public double x,y,r;
    public Circulo(double x, double y, double r){
	this.x=x;
	this.y=y;
	this.r=r;
	numCirculos++;
    }
    public Circulo(Double r){
	this(0.0,0.0,r);
    }
    public Circulo(Circulo c){
	this(c.x,c.y,c.r);
    }
    public Circulo(){
	this(0.0,0.0,1.0);
    }
    public double perimetro(){
	return 2.0*PI*r;
    }
    public double area(){
	return PI*r*r;
    }
    //metodo del objeto para comparar circulos
    public Circulo elMayor(Circulo c){
	if(this.r>=c.r) return this;
	else return c;
    }
    //metodo de clase para comparar circulos
    public static Circulo elMayor(Circulo c, Circulo d){
	if(c.r>=d.r) return c;
	else return d;
    }
}//fin de la clase Circulo