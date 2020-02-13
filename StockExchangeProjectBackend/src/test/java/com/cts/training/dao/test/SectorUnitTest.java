package com.cts.training.dao.test;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cts.training.bean.Sector;
import com.cts.training.dao.SectorDAO;
import jdk.nashorn.internal.ir.annotations.Ignore;
public class SectorUnitTest {



	
	private static AnnotationConfigApplicationContext context;
	private static  SectorDAO sectorDAO;
	
	private static Sector sector1;
	@BeforeClass
	public static void init()
	{ 
		context = new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		sector1=(Sector) context.getBean("sector");
		sectorDAO = (SectorDAO) context.getBean("sectorDAO"); 
		
		
	}
	@Test
	@Ignore
	public void testGetAllSector() {
		
		List<Sector> sector = sectorDAO.displayAllSectors();
		assertEquals(2, sector.size()); 
	
	}
	}