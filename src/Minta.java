import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import org.junit.jupiter.api.RepeatedTest;

import feladat03_JavaKollekciok.InputData;
import feladat03_JavaKollekciok.Versenyzo;
import feladat05.Eloadas;
import orabolt.Ora;

	//	TESZTEK
	@RepeatedTest(30)
	void AkarmiTest() {			
	assertTrue(veletlenSzam>10 && veletlenSzam<20, "Az eredemény tartományon kívüli");
	assertEquals(elvart, valosertek);
	assertThrows(IllegalArgumentException.class, () -> tesztOBj.setakarmi);
	assertDoesNotThrows(() -> valamiobj.valami);
	}

public class Minta {

	public static void main(String[] args) {

	//FAJLKEZELES BEOLVASÁS
		Scanner sc = new Scanner(System.in);
		String szoveg = sc.nextLine();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("pelda.txt"), "UTF-8"));
		
		String valami = br.readLine();
		while (br.ready()) {
			String[] csvSor = br.readLine().split(";");
			lista.add(new Lista(
					csvSor[0],
					Integer.parseInt(csvSor[0])));
		}
		
		br.close();
	
		
	//FAJLKEZELES KIIRAS
	
		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(fajlnev,true),"UTF-8");

		String kiiras;		
		kiiras = rendelesObj.getSzallitoiAzonosito()+elvalaszto+
				rendelesObj.getMegnevezes()+elvalaszto+
				rendelesObj.getMennyiseg()+elvalaszto+
				rendelesObj.getOsszertek()+elvalaszto+
				(rendelesObj.isSurgos()?1:0)+elvalaszto;
		
		out.write(kiiras+"\n");
		out.close();

	
	//VÉLETLENSZÁM	
		Random r = new Random();
		int veletlenSzam = r.nextInt(10);
		
	//KIVÉTEL
		
		if () {
			
		} else {
			throw new IllegalArgumentException("Hibás valami");
		}
		
		
	//MÁSIK OSZTÁLYBÓL 2 VERZIÓ
		public static List<Versenyzo> versenyzok = InputData.VersenyzokAdatai();

		//vagy
		InputData inputObj = new InputData();
		List<Versenyzo> versenyzok = inputObj.VersenyzokAdatai();
		
		
	//MAP ENTRYSET
		
		static Map<String, Integer> munkadijak = new HashMap<String, Integer>();

		private static void mapKilistazas(Map<String, Integer> munkadijak) {

			for (Map.Entry<String,Integer> munka : munkadijak.entrySet()) {
				
				System.out.println(munka.getKey()+" "+munka.getValue()+" Ft");
				
			}
		}

		
	//ADATBÁZIS KAPCSOLAT és BONTÁS
		
		private static Connection kapcsolat;
		
		private static PreparedStatement sqlUtasitas;
		
		
		public static void csatlakozas() throws SQLException {
			
			String connectionURL = "jdbc:mysql://localhost:3306/ingatlan_db?useSSL=false";
			
			try {
				kapcsolat = DriverManager.getConnection(connectionURL,"root","Ruander2023");
			} catch (Exception e) {
				throw new SQLException("A csatlakozás sikertelen!");
			}
			
		}
		
		
		public static void kapcsolatBontas() throws SQLException {
			
			try {
				
				kapcsolat.close();
				
			} catch (Exception e) {
				throw new SQLException("A kapcsolat bontása sikertelen!");
			}
			
		}

		
	//ADATBÁZIS BEOLVASÁS
		
		public static List<Ingatlan> ingatlanokBeolvasasa() throws SQLException {
			
			List<Ingatlan> ingatlanok = new ArrayList<Ingatlan>();
			
			try {
				
				sqlUtasitas = kapcsolat.prepareStatement("SELECT * FROM ingatlan_adatok");
				
				ResultSet res = sqlUtasitas.executeQuery();
				while (res.next()) {
					
					ingatlanok.add(new Ingatlan(
							res.getString("tulajdonos"),
							res.getString("helyrajzi_szam"),
							res.getInt("alapterulet"),
							res.getInt("ertek")));
					
				}
				res.close();
				
			} catch (Exception e) {
				throw new SQLException("Az adatok beolvasása sikertelen! "+e.getMessage());
			}
			
			return ingatlanok;
		}


	// JOPTIONPANE + KILÉPÉS
		
		
		
		JOptionPane.showMessageDialog(frmrabolt, "Megnevezés nem lehet üres", "Figyelmeztetés", JOptionPane.WARNING_MESSAGE);

		@Override
		public void windowClosing(WindowEvent e) { //keretre kattintva jelenik meg az esemény
			
			if (JOptionPane.showOptionDialog(frmrabolt, "Biztos ki akar lépni?", "Kilépés", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
					null, null, e)==(JOptionPane.YES_OPTION)) {
				System.exit(0);
				//frmFoAblak.disable();
			}
		}
	});

	//JLIST FELTÖLTÉS + listModel

	private JList listSzinhaz;
	private DefaultListModel<Eloadas> listModel;


	listSzinhaz = new JList();
	listSzinhaz.setBounds(88, 34, 379, 245);
	frmEloadasok.getContentPane().add(listSzinhaz);
	
	listModel = new DefaultListModel<Eloadas>();
	
	for (Eloadas eloadas : eloadasok) {
		listModel.addElement(eloadas);
	}

	listSzinhaz.setModel(listModel);

		
	//JTABLE FELTÖLTÉS
		
		
	}

}
