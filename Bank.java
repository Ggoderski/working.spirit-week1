public Class Bank{

	public int size;
	public String color;
	public char comfortClass;
	public double prize;
	public boolean avalible;


		


		public int getSize(){
			return size;
		}

		public String getColor(){
			return color;
		}

		public char getComfortClass(){
			return comfortClass;
		}

		public double getPrize(){
			return prize;
		}	 

		public boolean isAvalible(){
			return avalible;
		}


		public void setSize(int size){
			this.size = size;
		}

		public void setColor(String color){
			this.color = color;
		}

		public void setComfortClass(char comfortClass){
			this.comfortClass = comfortClass;
		}

		public void setPrize(double prize){
			this.prize = prize;
		}

		public void setAvalible(boolean avalible){
			this.avalible = avalible;
		}


}