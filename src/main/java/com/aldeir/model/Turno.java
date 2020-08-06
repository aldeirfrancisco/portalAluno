package com.aldeir.model;

public enum Turno {
  
		MATUTINO(1,"Matutino"),
		VESPERTINO(2,"Vespertino"),
		NOTUTNO(3,"Noturno");

	    
		private int cod;
	    private String turno;
	    
		private Turno(int cod, String turno) {
			this.cod = cod;
			this.turno = turno;
		}
		
		public int getCod() {
			return cod;
		}
		public String getTurno() {
			return turno;
		}
		
	    
		public static Turno toEnum(Integer cod) {
			
				if(cod == null) {
					return  null;
				}
				for(Turno x : Turno.values()) {
					if(cod.equals(x.cod)) {
						return x;
					}
				}
				throw new IllegalArgumentException("Id invalido" + cod);
		}
	    
}
