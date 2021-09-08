class BigO{
	
	public int even = 0, odd = 0;
	
	//O(1)
	public void CheckEorO(int n) {
		
		if(n % 2 == 0) {
			this.even+=1;
		}
		else {
			this.odd+=1;
		}
	}
	
	public int getEven() {
		return even;
	}
	
	public int getOdd() {
		return odd;
	}
	
	//O(n)
	public void evenAodd(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			CheckEorO(arr[i]);
		}
		System.out.println("");
		System.out.println("Even number = "+getEven());
		System.out.println("Odd number = "+getOdd());
	}
	
	
	// O(n^2)
	public void sortcity(String arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		printArray(arr);
	}
	
	// Insert sort!
	public void sort(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		printArray(arr);
	}
	
	//O(n)
	public void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	//O(n)
	public void printArray(String arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			System.out.println();
		}
	}
	
}

public class main {
	
	public static String[] array = {"Bangkok", "Krabi", "Kanchanaburi", "Kalasin", "KamphaengPhet"
			, "KhonKaen", "Chanthaburi", "Chachoengsao", "ChonBuri", "Chainat", "Chaiyaphum"
			, "Chumphon", "ChiangRai", "ChiangMai", "Trang", "Trat", "Trak", "NakhonNayok", "NakhonPathom"
			, "NakhonPhanom", "NakhonRatchasima", "NakhonSiThammarat", "NakhonSawan", "Nonthaburi"
			, "Narathiwat", "Nan", "BuengKan", "Buriram", "PathumThani", "PrachuapKhiriKhan", "Prachinburi"
			, "Pattani", "PhraNakhonSiAyutthaya", "PhangNga", "Phatthalung", "Phichit", "Phitsanulok", "Phetchaburi"
			, "PhraeProvince", "Phayao", "Phuket", "Mahasarakham", "Mukdahan", "MaeHongSon", "Yala", "Yasothon", "RoiEt"
			, "Ranong", "Rayong", "Ratchaburi", "Lopburi", "Lampang", "Lamphun" , "Loei", "Sisaket", "SakonNakhon"
			, "Songkhla", "Satun", "SamutPrakan", "SamutSongkhram", "SamutSakhon", "SaKaeo", "Saraburi", "Singburi", "Sukhothai"
			, "Suphanburi", "SuratThani", "Surin", "NongKhai", "NongBuaLamPhu", "AngThong", "UdonThani", "UthaiThani"
			, "Uttaradit", "UbonRatchathani", "AmnatCharoen" };
	
	public static int[] num = {11, 12, 22, 25, 34, 64, 90, 92, -1, 30, 21};
	
	public static void main(String[] args) {
		
		BigO big = new BigO();
		
		System.out.println("---Sorting City---");
		big.sortcity(array);
		System.out.println("");
		
		System.out.print("---Even or Odd number---");
		big.evenAodd(num);
		
		System.out.println("");
		System.out.println("---Sorting number---");
		big.sort(num);
		
	}

}
