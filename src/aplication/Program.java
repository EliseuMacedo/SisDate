package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {

		// Simple Date Format e padrão ISO 8601
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//Formato GMT
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		// para criar data com horário atual
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		// 1 seg tem 1000 miliseg
		Date x4 = new Date(1000L * 60L * 60L * 5L);

		// Data padrão iso
		Date x5 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		// Inserir nova string de data
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		System.out.println("--------Sem formato---------------");
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("x5: " + x5);

		System.out.println("----------Hora Brasil-------------");
		System.out.println("y1: " + sdf1.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("x5: " + sdf2.format(x5));

		System.out.println("----------Hora GMT-------------");
		System.out.println("y1: " + sdf1.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("x5: " + sdf3.format(x5));

	}

}
