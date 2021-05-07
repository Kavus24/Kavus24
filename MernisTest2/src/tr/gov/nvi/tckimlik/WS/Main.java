package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(
				Long.parseLong("tc numarası"), 
				"AD(BÜYÜK)" ,
				"SOYAD(BÜYÜK)" ,
				1993 // Doğum Yılı
				);
				
				System.out.println("Doğrulama : "  + (result ? "başarılı" : "başarısız" ));
				
		
				kpsPublic.TCKimlikNoDogrula(0, null, null, 0);
				
				
				
	}

}
