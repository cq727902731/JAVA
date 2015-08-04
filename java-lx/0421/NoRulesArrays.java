class NoRulesArrays{
	public static void main(String[] args){    
	    String[][]rooms = new String[3][];
		rooms[0] = new String[]{"Jane",null};
		rooms[1] = new String[]{null,"Linda","Rose",null};
		rooms[2] = new String[]{"Mike","Jack",null};
		for (int i = 0;i < rooms.length ;i++ ){
			for (int j = 0 ;j < rooms[i].length ;j++ ){
				System.out.print("rooms[" + i + "][" + j + "] = " + rooms[i][j] + "\t"); 	
			}
			System.out.println(); 
		}	
	}		
}