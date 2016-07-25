package Common;

//Definindo as dire��es pelos campos ENUM.
public enum Direction {
	NORTH("N"), EAST("E"), WEST("W"), SOUTH("S");
	
	private String initials;
	
	//Construtor
	Direction(String initials){
		this.initials = initials;
	}
	
	//metodo to String <> retornar string 
	public String toString() {
		return this.initials;
	}
	//dire��o a partir da String
	public static Direction fromString(String text) 
	{
		//se texto direferente de vazio
		if (text != null) 
		{
			//Para cada dire��o (b)  nos (:) valores ()
			for (Direction b : Direction.values()) 
			{
				//verifica se string iguais, independente de maiusculo/minisculo
				if (text.equalsIgnoreCase(b.initials)) 
				{
					return b;
				}
			}
		}
		//se dire��o invalida ou vazia, lan�ar texto no metodo
		throw new IllegalArgumentException("Invalid direction value!");
	}
	
}
