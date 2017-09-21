package com.internousdev.choitabi.dto.test;

import java.math.BigDecimal;

import org.junit.Test;

import com.internousdev.choitabi.dto.TourDTO;

import junit.framework.TestCase;


public class TourDTOTest extends TestCase {



	public TourDTOTest(String name) {
		super(name);
	}


/*●・○・●・○・●・○・●・○*/
/*【int】settour_id*/
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・*/

	public void testGettour_id1() {
		TourDTO dto = new TourDTO();
		int expected = 0;
		dto.setTour_id(expected);
		assertEquals(expected, dto.getTour_id());

	}
	public void testGettour_id2() {
		TourDTO dto = new TourDTO();
		int expected = 2147483647;
		dto.setTour_id(expected);
		assertEquals(expected, dto.getTour_id());
	}
	public void testGettour_id3() {
		TourDTO dto = new TourDTO();
		int expected = -2147483647;
		dto.setTour_id(expected);
		assertEquals(expected, dto.getTour_id());
	}
	public void testGettour_id4() throws Exception  {
		TourDTO dto= new TourDTO();
		try {
		     int postalMin =Integer.parseInt("-2147483649");
		     dto.setTour_id(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	public void testGettour_id5() throws Exception {
		TourDTO dto= new TourDTO();
	    try{
	    	int postalMax= Integer.parseInt("2147483648");
	    	dto.setTour_id(postalMax);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(),"For input string: \"2147483648\"");
	    }

	}


	private void assertThat(String message, String string) {
		assertEquals(message, string);
	}

	public void testSettour_id1() {
		TourDTO dto = new TourDTO();
		int expected = 0;

		dto.setTour_id(expected);
		int actual= dto.getTour_id();

		assertEquals(expected, actual);
	}

	public void testSettour_id2() {
		TourDTO dto = new TourDTO();
		int expected = 2147483647;

		dto.setTour_id(expected);
		int actual= dto.getTour_id();

		assertEquals(expected, actual);
	}

	public void testSettour_id3() {
		TourDTO dto = new TourDTO();
		int expected = -2147483647;

		dto.setTour_id(expected);
		int actual=dto.getTour_id();

		assertEquals(expected, actual);
	}

	public void testSettour_id4()throws Exception {
		TourDTO dto= new TourDTO();
		try {
			int postalMin= Integer.parseInt("-2147483649");
			dto.setTour_id(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	public void testSettour_id5() throws Exception {
		TourDTO dto= new TourDTO();
	    try{
	    	int postalMax= Integer.parseInt("2147483648");
	    	dto.setTour_id(postalMax);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(),"For input string: \"2147483648\"");
	    }
	}

/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・*/




/*●・○・●・○・●・○・●・○*/
/*【int】setTour_name*/
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・*/

	public void testGetpersons1() {
		TourDTO dto = new TourDTO();
		int expected = 0;
		dto.setPersons(expected);
		assertEquals(expected, dto.getPersons());

	}
	public void testGetpersons2() {
		TourDTO dto = new TourDTO();
		int expected = 2147483647;
		dto.setPersons(expected);
		assertEquals(expected, dto.getPersons());
	}
	public void testGetpersons3() {
		TourDTO dto = new TourDTO();
		int expected = -2147483647;
		dto.setPersons(expected);
		assertEquals(expected, dto.getPersons());
	}
	public void testGetpersons4() throws Exception  {
		TourDTO dto= new TourDTO();
		try {
		     int postalMin =Integer.parseInt("-2147483649");
		     dto.setPersons(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	public void testGetpersons5() throws Exception {
		TourDTO dto= new TourDTO();
	    try{
	    	int postalMax= Integer.parseInt("2147483648");
	    	dto.setPersons(postalMax);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(),"For input string: \"2147483648\"");
	    }

	}


	public void testSetpersons1() {
		TourDTO dto = new TourDTO();
		int expected = 0;

		dto.setPersons(expected);
		int actual= dto.getPersons();

		assertEquals(expected, actual);
	}

	public void testSetpersons2() {
		TourDTO dto = new TourDTO();
		int expected = 2147483647;

		dto.setPersons(expected);
		int actual= dto.getPersons();

		assertEquals(expected, actual);
	}

	public void testSetpersons3() {
		TourDTO dto = new TourDTO();
		int expected = -2147483647;

		dto.setPersons(expected);
		int actual=dto.getPersons();

		assertEquals(expected, actual);
	}

	public void testSetpersons4()throws Exception {
		TourDTO dto= new TourDTO();
		try {
			int postalMin= Integer.parseInt("-2147483649");
			dto.setPersons(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	public void testSetpersons5() throws Exception {
		TourDTO dto= new TourDTO();
	    try{
	    	int postalMax= Integer.parseInt("2147483648");
	    	dto.setPersons(postalMax);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(),"For input string: \"2147483648\"");
	    }
	}

/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・*/



/*●・○・●・○・●・○・●・○*/
/*【int】setindex*/
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・*/

	public void testGetindex1() {
		TourDTO dto = new TourDTO();
		int expected = 0;
		dto.setIndex(expected);
		assertEquals(expected, dto.getIndex());

	}
	public void testGetindex2() {
		TourDTO dto = new TourDTO();
		int expected = 2147483647;
		dto.setIndex(expected);
		assertEquals(expected, dto.getIndex());
	}
	public void testGetindex3() {
		TourDTO dto = new TourDTO();
		int expected = -2147483647;
		dto.setIndex(expected);
		assertEquals(expected, dto.getIndex());
	}
	public void testGetindex4() throws Exception  {
		TourDTO dto= new TourDTO();
		try {
		     int postalMin =Integer.parseInt("-2147483649");
		     dto.setIndex(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	public void testGetindex5() throws Exception {
		TourDTO dto= new TourDTO();
	    try{
	    	int postalMax= Integer.parseInt("2147483648");
	    	dto.setIndex(postalMax);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(),"For input string: \"2147483648\"");
	    }

	}


	public void testSetindex1() {
		TourDTO dto = new TourDTO();
		int expected = 0;

		dto.setIndex(expected);
		int actual= dto.getIndex();

		assertEquals(expected, actual);
	}

	public void testSetindex2() {
		TourDTO dto = new TourDTO();
		int expected = 2147483647;

		dto.setIndex(expected);
		int actual= dto.getIndex();

		assertEquals(expected, actual);
	}

	public void testSetindex3() {
		TourDTO dto = new TourDTO();
		int expected = -2147483647;

		dto.setIndex(expected);
		int actual=dto.getIndex();

		assertEquals(expected, actual);
	}

	public void testSetindex4()throws Exception {
		TourDTO dto= new TourDTO();
		try {
			int postalMin= Integer.parseInt("-2147483649");
			dto.setIndex(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	public void testSetindex5() throws Exception {
		TourDTO dto= new TourDTO();
	    try{
	    	int postalMax= Integer.parseInt("2147483648");
	    	dto.setIndex(postalMax);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(),"For input string: \"2147483648\"");
	    }
	}

/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・*/





/*●・○・●・○・●・○・●・○*/
/*【string】setTour_name*/
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/
	public void testGetTour_name1() {
		TourDTO dto= new TourDTO();
		String expected=null;

		dto.setTour_name(expected);
		String actual=dto.getTour_name();

		assertEquals(expected,actual);
	}

	public void testGetTour_name2() {
		TourDTO dto= new TourDTO();
		String expected="";

		dto.setTour_name(expected);
		String actual= dto.getTour_name();

		assertEquals(expected, actual);
	}
    public void testGetTour_name3() {
    	TourDTO dto=new TourDTO();
    	String expected=" ";

    	dto.setTour_name(expected);
    	String actual=dto.getTour_name();

    	assertEquals(expected, actual);
    }
    public void testGetTour_name4() {
    	TourDTO dto= new TourDTO();
    	String expected ="　";

    	dto.setTour_name(expected);
    	String actual= dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testGetTour_name5() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123";

    	dto.setTour_name(expected);
    	String actual= dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testGetTour_name6() {
    	TourDTO dto= new TourDTO();
    	String expected ="あいう１２３";

    	dto.setTour_name(expected);
    	String actual= dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testGetTour_name7() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123あいう１２３";

    	dto.setTour_name(expected);
    	String actual= dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testGetTour_name8() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123あいう１２３漢字";

    	dto.setTour_name(expected);
    	String actual= dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testSetTour_name() {
    	TourDTO dto= new TourDTO();
    	String expected=null;

    	dto.setTour_name(expected);
    	String actual= dto.getTour_name();

    	assertEquals(expected,actual);
    }

    public void testSetTour_name2() {
    	TourDTO dto= new TourDTO();
    	String expected="";

    	dto.setTour_name(expected);
    	String actual= dto.getTour_name();

    	assertEquals(expected,actual);
    }

    public void testSetTour_name3() {
    	TourDTO dto= new TourDTO();
    	String expected=" ";

    	dto.setTour_name(expected);
    	String actual= dto.getTour_name();

    	assertEquals(expected,actual);
    }

    public void testSetTour_name4() {
    	TourDTO dto= new TourDTO();
    	String expected="　";

    	dto.setTour_name(expected);
    	String actual= dto.getTour_name();

    	assertEquals(expected,actual);
    }

    public void testSetTour_name5() {
    	TourDTO dto= new TourDTO();
    	String expected="abc123";

    	dto.setTour_name(expected);
    	String actual= dto.getTour_name();

    	assertEquals(expected,actual);
    }

    public void testSetTour_name6(){
    	TourDTO dto= new TourDTO();
    	String expected= "あいう１２３";

    	dto.setTour_name(expected);
    	String actual=dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testSetTour_name7() {
    	TourDTO dto= new  TourDTO();
    	String expected= "abc123あいう１２３";

    	dto.setTour_name(expected);
    	String actual= dto.getTour_name();

    	assertEquals(expected,actual);
    }

    public void testSetTour_name8() {
    	TourDTO dto= new TourDTO();
    	String expected= "abc１２３あいう漢字";

    	dto.setTour_name(expected);
    	String actual=dto.getTour_name();

    	assertEquals(expected,actual);
          }
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/







/*●・○・●・○・●・○・●・○*/
/*【string】setDeparture*/
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/
	public void testGetDeparture1() {
		TourDTO dto= new TourDTO();
		String expected=null;

		dto.setDeparture(expected);
		String actual=dto.getDeparture();

		assertEquals(expected,actual);
	}

	public void testGetDeparture2() {
		TourDTO dto= new TourDTO();
		String expected="";

		dto.setDeparture(expected);
		String actual= dto.getDeparture();

		assertEquals(expected, actual);
	}
    public void testGetDeparture3() {
    	TourDTO dto=new TourDTO();
    	String expected=" ";

    	dto.setDeparture(expected);
    	String actual=dto.getDeparture();

    	assertEquals(expected, actual);
    }
    public void testGetDeparture4() {
    	TourDTO dto= new TourDTO();
    	String expected ="　";

    	dto.setDeparture(expected);
    	String actual= dto.getDeparture();

    	assertEquals(expected, actual);
    }

    public void testGetDeparture5() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123";

    	dto.setDeparture(expected);
    	String actual= dto.getDeparture();

    	assertEquals(expected, actual);
    }

    public void testGetDeparture6() {
    	TourDTO dto= new TourDTO();
    	String expected ="あいう１２３";

    	dto.setDeparture(expected);
    	String actual= dto.getDeparture();

    	assertEquals(expected, actual);
    }

    public void testGetDeparture7() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123あいう１２３";

    	dto.setDeparture(expected);
    	String actual= dto.getDeparture();

    	assertEquals(expected, actual);
    }

    public void testGetDeparture8() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123あいう１２３漢字";

    	dto.setDeparture(expected);
    	String actual= dto.getDeparture();

    	assertEquals(expected, actual);
    }

    public void testSetDeparture() {
    	TourDTO dto= new TourDTO();
    	String expected=null;

    	dto.setDeparture(expected);
    	String actual= dto.getDeparture();

    	assertEquals(expected,actual);
    }

    public void testSetDeparture2() {
    	TourDTO dto= new TourDTO();
    	String expected="";

    	dto.setDeparture(expected);
    	String actual= dto.getDeparture();

    	assertEquals(expected,actual);
    }

    public void testSetDeparture3() {
    	TourDTO dto= new TourDTO();
    	String expected=" ";

    	dto.setDeparture(expected);
    	String actual= dto.getDeparture();

    	assertEquals(expected,actual);
    }

    public void testSetDeparture4() {
    	TourDTO dto= new TourDTO();
    	String expected="　";

    	dto.setDeparture(expected);
    	String actual= dto.getDeparture();

    	assertEquals(expected,actual);
    }

    public void testSetDeparture5() {
    	TourDTO dto= new TourDTO();
    	String expected="abc123";

    	dto.setDeparture(expected);
    	String actual= dto.getDeparture();

    	assertEquals(expected,actual);
    }

    public void testSetDeparture6(){
    	TourDTO dto= new TourDTO();
    	String expected= "あいう１２３";

    	dto.setDeparture(expected);
    	String actual=dto.getDeparture();

    	assertEquals(expected, actual);
    }

    public void testSetDeparture7() {
    	TourDTO dto= new  TourDTO();
    	String expected= "abc123あいう１２３";

    	dto.setDeparture(expected);
    	String actual= dto.getDeparture();

    	assertEquals(expected,actual);
    }

    public void testSetDeparture8() {
    	TourDTO dto= new TourDTO();
    	String expected= "abc１２３あいう漢字";

    	dto.setDeparture(expected);
    	String actual=dto.getDeparture();

    	assertEquals(expected,actual);
          }
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/






/*●・○・●・○・●・○・●・○*/
/*【string】setRegion*/
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/
	public void testGetRegion1() {
		TourDTO dto= new TourDTO();
		String expected=null;

		dto.setRegion(expected);
		String actual=dto.getRegion();

		assertEquals(expected,actual);
	}

	public void testGetRegion2() {
		TourDTO dto= new TourDTO();
		String expected="";

		dto.setRegion(expected);
		String actual= dto.getRegion();

		assertEquals(expected, actual);
	}
    public void testGetRegion3() {
    	TourDTO dto=new TourDTO();
    	String expected=" ";

    	dto.setRegion(expected);
    	String actual=dto.getRegion();

    	assertEquals(expected, actual);
    }
    public void testGetRegion4() {
    	TourDTO dto= new TourDTO();
    	String expected ="　";

    	dto.setRegion(expected);
    	String actual= dto.getRegion();

    	assertEquals(expected, actual);
    }

    public void testGetRegion5() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123";

    	dto.setRegion(expected);
    	String actual= dto.getRegion();

    	assertEquals(expected, actual);
    }

    public void testGetRegion6() {
    	TourDTO dto= new TourDTO();
    	String expected ="あいう１２３";

    	dto.setRegion(expected);
    	String actual= dto.getRegion();

    	assertEquals(expected, actual);
    }

    public void testGetRegion7() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123あいう１２３";

    	dto.setRegion(expected);
    	String actual= dto.getRegion();

    	assertEquals(expected, actual);
    }

    public void testGetRegion8() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123あいう１２３漢字";

    	dto.setRegion(expected);
    	String actual= dto.getRegion();

    	assertEquals(expected, actual);
    }

    public void testSetRegion() {
    	TourDTO dto= new TourDTO();
    	String expected=null;

    	dto.setRegion(expected);
    	String actual= dto.getRegion();

    	assertEquals(expected,actual);
    }

    public void testSetRegion2() {
    	TourDTO dto= new TourDTO();
    	String expected="";

    	dto.setRegion(expected);
    	String actual= dto.getRegion();

    	assertEquals(expected,actual);
    }

    public void testSetRegion3() {
    	TourDTO dto= new TourDTO();
    	String expected=" ";

    	dto.setRegion(expected);
    	String actual= dto.getRegion();

    	assertEquals(expected,actual);
    }

    public void testSetRegion4() {
    	TourDTO dto= new TourDTO();
    	String expected="　";

    	dto.setRegion(expected);
    	String actual= dto.getRegion();

    	assertEquals(expected,actual);
    }

    public void testSetRegion5() {
    	TourDTO dto= new TourDTO();
    	String expected="abc123";

    	dto.setRegion(expected);
    	String actual= dto.getRegion();

    	assertEquals(expected,actual);
    }

    public void testSetRegion6(){
    	TourDTO dto= new TourDTO();
    	String expected= "あいう１２３";

    	dto.setRegion(expected);
    	String actual=dto.getRegion();

    	assertEquals(expected, actual);
    }

    public void testSetRegion7() {
    	TourDTO dto= new  TourDTO();
    	String expected= "abc123あいう１２３";

    	dto.setRegion(expected);
    	String actual= dto.getRegion();

    	assertEquals(expected,actual);
    }

    public void testSetRegion8() {
    	TourDTO dto= new TourDTO();
    	String expected= "abc１２３あいう漢字";

    	dto.setRegion(expected);
    	String actual=dto.getRegion();

    	assertEquals(expected,actual);
          }
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/





/*●・○・●・○・●・○・●・○*/
/*【string】setPrefectures*/
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/
	public void testGetPrefectures1() {
		TourDTO dto= new TourDTO();
		String expected=null;

		dto.setPrefectures(expected);
		String actual=dto.getPrefectures();

		assertEquals(expected,actual);
	}

	public void testGetPrefectures2() {
		TourDTO dto= new TourDTO();
		String expected="";

		dto.setPrefectures(expected);
		String actual= dto.getPrefectures();

		assertEquals(expected, actual);
	}
    public void testGetPrefectures3() {
    	TourDTO dto=new TourDTO();
    	String expected=" ";

    	dto.setPrefectures(expected);
    	String actual=dto.getPrefectures();

    	assertEquals(expected, actual);
    }
    public void testGetPrefectures4() {
    	TourDTO dto= new TourDTO();
    	String expected ="　";

    	dto.setPrefectures(expected);
    	String actual= dto.getPrefectures();

    	assertEquals(expected, actual);
    }

    public void testGetPrefectures5() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123";

    	dto.setPrefectures(expected);
    	String actual= dto.getPrefectures();

    	assertEquals(expected, actual);
    }

    public void testGetPrefectures6() {
    	TourDTO dto= new TourDTO();
    	String expected ="あいう１２３";

    	dto.setPrefectures(expected);
    	String actual= dto.getPrefectures();

    	assertEquals(expected, actual);
    }

    public void testGetPrefectures7() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123あいう１２３";

    	dto.setPrefectures(expected);
    	String actual= dto.getPrefectures();

    	assertEquals(expected, actual);
    }

    public void testGetPrefectures8() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123あいう１２３漢字";

    	dto.setPrefectures(expected);
    	String actual= dto.getPrefectures();

    	assertEquals(expected, actual);
    }

    public void testSetPrefectures() {
    	TourDTO dto= new TourDTO();
    	String expected=null;

    	dto.setPrefectures(expected);
    	String actual= dto.getPrefectures();

    	assertEquals(expected,actual);
    }

    public void testSetPrefectures2() {
    	TourDTO dto= new TourDTO();
    	String expected="";

    	dto.setPrefectures(expected);
    	String actual= dto.getPrefectures();

    	assertEquals(expected,actual);
    }

    public void testSetPrefectures3() {
    	TourDTO dto= new TourDTO();
    	String expected=" ";

    	dto.setPrefectures(expected);
    	String actual= dto.getPrefectures();

    	assertEquals(expected,actual);
    }

    public void testSetPrefectures4() {
    	TourDTO dto= new TourDTO();
    	String expected="　";

    	dto.setPrefectures(expected);
    	String actual= dto.getPrefectures();

    	assertEquals(expected,actual);
    }

    public void testSetPrefectures5() {
    	TourDTO dto= new TourDTO();
    	String expected="abc123";

    	dto.setPrefectures(expected);
    	String actual= dto.getPrefectures();

    	assertEquals(expected,actual);
    }

    public void testSetPrefectures6(){
    	TourDTO dto= new TourDTO();
    	String expected= "あいう１２３";

    	dto.setPrefectures(expected);
    	String actual=dto.getPrefectures();

    	assertEquals(expected, actual);
    }

    public void testSetPrefectures7() {
    	TourDTO dto= new  TourDTO();
    	String expected= "abc123あいう１２３";

    	dto.setPrefectures(expected);
    	String actual= dto.getPrefectures();

    	assertEquals(expected,actual);
    }

    public void testSetPrefectures8() {
    	TourDTO dto= new TourDTO();
    	String expected= "abc１２３あいう漢字";

    	dto.setPrefectures(expected);
    	String actual=dto.getPrefectures();

    	assertEquals(expected,actual);
          }
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/





/*●・○・●・○・●・○・●・○*/
/*【string】setTheme*/
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/
	public void testGetTheme1() {
		TourDTO dto= new TourDTO();
		String expected=null;

		dto.setTheme(expected);
		String actual=dto.getTheme();

		assertEquals(expected,actual);
	}

	public void testGetTheme2() {
		TourDTO dto= new TourDTO();
		String expected="";

		dto.setTheme(expected);
		String actual= dto.getTheme();

		assertEquals(expected, actual);
	}
    public void testGetTheme3() {
    	TourDTO dto=new TourDTO();
    	String expected=" ";

    	dto.setTheme(expected);
    	String actual=dto.getTheme();

    	assertEquals(expected, actual);
    }
    public void testGetTheme4() {
    	TourDTO dto= new TourDTO();
    	String expected ="　";

    	dto.setTheme(expected);
    	String actual= dto.getTheme();

    	assertEquals(expected, actual);
    }

    public void testGetTheme5() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123";

    	dto.setTheme(expected);
    	String actual= dto.getTheme();

    	assertEquals(expected, actual);
    }

    public void testGetTheme6() {
    	TourDTO dto= new TourDTO();
    	String expected ="あいう１２３";

    	dto.setTheme(expected);
    	String actual= dto.getTheme();

    	assertEquals(expected, actual);
    }

    public void testGetTheme7() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123あいう１２３";

    	dto.setTheme(expected);
    	String actual= dto.getTheme();

    	assertEquals(expected, actual);
    }

    public void testGetTheme8() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123あいう１２３漢字";

    	dto.setTheme(expected);
    	String actual= dto.getTheme();

    	assertEquals(expected, actual);
    }

    public void testSetTheme() {
    	TourDTO dto= new TourDTO();
    	String expected=null;

    	dto.setTheme(expected);
    	String actual= dto.getTheme();

    	assertEquals(expected,actual);
    }

    public void testSetTheme2() {
    	TourDTO dto= new TourDTO();
    	String expected="";

    	dto.setTheme(expected);
    	String actual= dto.getTheme();

    	assertEquals(expected,actual);
    }

    public void testSetTheme3() {
    	TourDTO dto= new TourDTO();
    	String expected=" ";

    	dto.setTheme(expected);
    	String actual= dto.getTheme();

    	assertEquals(expected,actual);
    }

    public void testSetTheme4() {
    	TourDTO dto= new TourDTO();
    	String expected="　";

    	dto.setTheme(expected);
    	String actual= dto.getTheme();

    	assertEquals(expected,actual);
    }

    public void testSetTheme5() {
    	TourDTO dto= new TourDTO();
    	String expected="abc123";

    	dto.setTheme(expected);
    	String actual= dto.getTheme();

    	assertEquals(expected,actual);
    }

    public void testSetTheme6(){
    	TourDTO dto= new TourDTO();
    	String expected= "あいう１２３";

    	dto.setTheme(expected);
    	String actual=dto.getTheme();

    	assertEquals(expected, actual);
    }

    public void testSetTheme7() {
    	TourDTO dto= new  TourDTO();
    	String expected= "abc123あいう１２３";

    	dto.setTheme(expected);
    	String actual= dto.getTheme();

    	assertEquals(expected,actual);
    }

    public void testSetTheme8() {
    	TourDTO dto= new TourDTO();
    	String expected= "abc１２３あいう漢字";

    	dto.setTheme(expected);
    	String actual=dto.getTheme();

    	assertEquals(expected,actual);
          }
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/






/*●・○・●・○・●・○・●・○*/
/*【string】setComment*/
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/
	public void testGetComment1() {
		TourDTO dto= new TourDTO();
		String expected=null;

		dto.setComment(expected);
		String actual=dto.getComment();

		assertEquals(expected,actual);
	}

	public void testGetComment2() {
		TourDTO dto= new TourDTO();
		String expected="";

		dto.setComment(expected);
		String actual= dto.getComment();

		assertEquals(expected, actual);
	}
    public void testGetComment3() {
    	TourDTO dto=new TourDTO();
    	String expected=" ";

    	dto.setComment(expected);
    	String actual=dto.getComment();

    	assertEquals(expected, actual);
    }
    public void testGetComment4() {
    	TourDTO dto= new TourDTO();
    	String expected ="　";

    	dto.setComment(expected);
    	String actual= dto.getComment();

    	assertEquals(expected, actual);
    }

    public void testGetComment5() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123";

    	dto.setComment(expected);
    	String actual= dto.getComment();

    	assertEquals(expected, actual);
    }

    public void testGetComment6() {
    	TourDTO dto= new TourDTO();
    	String expected ="あいう１２３";

    	dto.setComment(expected);
    	String actual= dto.getComment();

    	assertEquals(expected, actual);
    }

    public void testGetComment7() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123あいう１２３";

    	dto.setComment(expected);
    	String actual= dto.getComment();

    	assertEquals(expected, actual);
    }

    public void testGetComment8() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123あいう１２３漢字";

    	dto.setComment(expected);
    	String actual= dto.getComment();

    	assertEquals(expected, actual);
    }

    public void testSetComment() {
    	TourDTO dto= new TourDTO();
    	String expected=null;

    	dto.setComment(expected);
    	String actual= dto.getComment();

    	assertEquals(expected,actual);
    }

    public void testSetComment2() {
    	TourDTO dto= new TourDTO();
    	String expected="";

    	dto.setComment(expected);
    	String actual= dto.getComment();

    	assertEquals(expected,actual);
    }

    public void testSetComment3() {
    	TourDTO dto= new TourDTO();
    	String expected=" ";

    	dto.setComment(expected);
    	String actual= dto.getComment();

    	assertEquals(expected,actual);
    }

    public void testSetComment4() {
    	TourDTO dto= new TourDTO();
    	String expected="　";

    	dto.setComment(expected);
    	String actual= dto.getComment();

    	assertEquals(expected,actual);
    }

    public void testSetComment5() {
    	TourDTO dto= new TourDTO();
    	String expected="abc123";

    	dto.setComment(expected);
    	String actual= dto.getComment();

    	assertEquals(expected,actual);
    }

    public void testSetComment6(){
    	TourDTO dto= new TourDTO();
    	String expected= "あいう１２３";

    	dto.setComment(expected);
    	String actual=dto.getComment();

    	assertEquals(expected, actual);
    }

    public void testSetComment7() {
    	TourDTO dto= new  TourDTO();
    	String expected= "abc123あいう１２３";

    	dto.setComment(expected);
    	String actual= dto.getComment();

    	assertEquals(expected,actual);
    }

    public void testSetComment8() {
    	TourDTO dto= new TourDTO();
    	String expected= "abc１２３あいう漢字";

    	dto.setComment(expected);
    	String actual=dto.getComment();

    	assertEquals(expected,actual);
          }
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/





/*●・○・●・○・●・○・●・○*/
/*【string】setImg*/
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/
	public void testGetImg1() {
		TourDTO dto= new TourDTO();
		String expected=null;

		dto.setImg(expected);
		String actual=dto.getImg();

		assertEquals(expected,actual);
	}

	public void testGetImg2() {
		TourDTO dto= new TourDTO();
		String expected="";

		dto.setImg(expected);
		String actual= dto.getImg();

		assertEquals(expected, actual);
	}
    public void testGetImg3() {
    	TourDTO dto=new TourDTO();
    	String expected=" ";

    	dto.setImg(expected);
    	String actual=dto.getImg();

    	assertEquals(expected, actual);
    }
    public void testGetImg4() {
    	TourDTO dto= new TourDTO();
    	String expected ="　";

    	dto.setImg(expected);
    	String actual= dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testGetImg5() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123";

    	dto.setImg(expected);
    	String actual= dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testGetImg6() {
    	TourDTO dto= new TourDTO();
    	String expected ="あいう１２３";

    	dto.setImg(expected);
    	String actual= dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testGetImg7() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123あいう１２３";

    	dto.setImg(expected);
    	String actual= dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testGetImg8() {
    	TourDTO dto= new TourDTO();
    	String expected ="abc123あいう１２３漢字";

    	dto.setImg(expected);
    	String actual= dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testSetImg() {
    	TourDTO dto= new TourDTO();
    	String expected=null;

    	dto.setImg(expected);
    	String actual= dto.getImg();

    	assertEquals(expected,actual);
    }

    public void testSetImg2() {
    	TourDTO dto= new TourDTO();
    	String expected="";

    	dto.setImg(expected);
    	String actual= dto.getImg();

    	assertEquals(expected,actual);
    }

    public void testSetImg3() {
    	TourDTO dto= new TourDTO();
    	String expected=" ";

    	dto.setImg(expected);
    	String actual= dto.getImg();

    	assertEquals(expected,actual);
    }

    public void testSetImg4() {
    	TourDTO dto= new TourDTO();
    	String expected="　";

    	dto.setImg(expected);
    	String actual= dto.getImg();

    	assertEquals(expected,actual);
    }

    public void testSetImg5() {
    	TourDTO dto= new TourDTO();
    	String expected="abc123";

    	dto.setImg(expected);
    	String actual= dto.getImg();

    	assertEquals(expected,actual);
    }

    public void testSetImg6(){
    	TourDTO dto= new TourDTO();
    	String expected= "あいう１２３";

    	dto.setImg(expected);
    	String actual=dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testSetImg7() {
    	TourDTO dto= new  TourDTO();
    	String expected= "abc123あいう１２３";

    	dto.setImg(expected);
    	String actual= dto.getImg();

    	assertEquals(expected,actual);
    }

    public void testSetImg8() {
    	TourDTO dto= new TourDTO();
    	String expected= "abc１２３あいう漢字";

    	dto.setImg(expected);
    	String actual=dto.getImg();

    	assertEquals(expected,actual);
          }
/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/



    /*●・○・●・○・●・○・●・○*/
    /*【BigDecimal】setPrice*/
    /*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・*/

    public void testGetPrice1(){
    	TourDTO test= new TourDTO();
		BigDecimal expected = BigDecimal.valueOf(0.0);

		test.setPrice(expected);

		assertEquals(expected,test.getPrice());
	}

	@Test
	public void testGetPrice2(){
		TourDTO test= new TourDTO();
		BigDecimal expected = BigDecimal.valueOf(9999999.99);

		test.setPrice(expected);

		assertEquals(expected,test.getPrice());
	}

	@Test
	public void testGetPrice3(){
		TourDTO test= new TourDTO();
		BigDecimal expected = BigDecimal.valueOf(-9999999.99);

		test.setPrice(expected);

		assertEquals(expected,test.getPrice());
	}

	@Test
	public void testGetPrice4(){
		TourDTO test= new TourDTO();
		try{
			BigDecimal PriceMin = BigDecimal.valueOf(10000000.00);
			test.setPrice(PriceMin);

		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testGetPrice5(){
		TourDTO test= new TourDTO();
		try{
			BigDecimal PriceMin = BigDecimal.valueOf(-10000000.00);
			test.setPrice(PriceMin);

		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}
    /*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・*/




}/*  class  -----------------------------*/
