package pe.globalhub.rest;

import java.util.Random;

public abstract class utilRnd {
	
	public static int i=0;
	
	public utilRnd(){
	}
	
	public static void chocolatear()
	{
		random = new Random();
		rn=random.nextInt(10);
		rln=random.nextInt(10);
		rd=random.nextInt(49);
		rprice=random.nextInt(387);
		ri=random.nextInt(4);
		rp=random.nextInt(8257);
		rqty=random.nextInt(5);
	}
	
	public static Random random = new Random();
	public static String[] possibleNames={"Willy","Manuel","Liliana","Francisco","Zancho","Alba","Pedro","Juan","Sandra","María"};
	public static int rn=random.nextInt(10);
	public static String[] possibleLastname={"Castro","Vergara","Davila","Juarez","Rodriguez","Bejarano","Perez","Casado","García","Delgado"};
	public static int rln=random.nextInt(10);
	public static String[] possibleDistricts={"Alava			",
			"Albacete       ",
			"Alicante       ",
			"Almeria        ",
			"Avila          ",
			"Badajoz		",
			"Islas Baleares ",
			"Barcelona      ",
			"Burgos         ",
			"Caceres        ",
			"Cadiz          ",
			"Castellon      ",
			"Ciudad Real    ",
			"Cordoba        ",
			"Coruña         ",
			"Cuenca         ",
			"Girona         ",
			"Granada        ",
			"Guadalajara    ",
			"Guipuzkoa      ",
			"Huelva         ",
			"Huesca         ",
			"Jaen           ",
			"Leon           ",
			"Lleida         ",
			"La Rioja       ",
			"Lugo           ",
			"Madrid         ",
			"Malaga         ",
			"Murcia         ",
			"Navarra        ",
			"Ourense        ",
			"Asturias       ",
			"Palencia       ",
			"Pontevedra     ",
			"Salamanca      ",
			"Cantabria      ",
			"Segovia        ",
			"Sevilla        ",
			"Soria          ",
			"Tarragona      ",
			"Teruel         ",
			"Toledo         ",
			"Valencia       ",
			"Valladolid     ",
			"Bizkaia        ",
			"Zamora         ",
			"Zaragoza       ",
			"Andorra        "};
	public static int rd=random.nextInt(49);
	
	public static int rprice=random.nextInt(387);
	public static int ri=random.nextInt(4);
	public static int rp=random.nextInt(8257);
	public static int rqty=random.nextInt(5);
	
	public static String name()
	{
		chocolatear();
		return possibleNames[rn];
	}
	
	public static String lastName()
	{
		chocolatear();
		return possibleLastname[rln];
	}
	
	public static String district()
	{
		chocolatear();
		return possibleDistricts[rd].trim();
	}
	
	public static String calle()
	{
		chocolatear();
		return possibleDistricts[rln].trim();
	}
	
	public static String nroCalle()
	{
		chocolatear();
		return rd+"";
	}
	
	public static double price()
	{
		chocolatear();
		return rprice==0?1L:Double.parseDouble(rprice+"");
	}
	
	public static int itemNumber()
	{
		chocolatear();
		return ri==0?1:ri;
	}
	
	public static int codProd()
	{
		chocolatear();
		return rp==0?1:rp;
	}
	
	public static int qty()
	{
		chocolatear();
		return rqty==0?1:rqty;
	}
	
	public static int cont()
	{
		return ++i;
	}
	
	public static int actual()
	{
		return i;
	}
}
