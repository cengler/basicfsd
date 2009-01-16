package flexFDS
{
	 
  [Bindable]
  [RemoteClass(alias="flexFDS.Libro")]
      
	public class Libro 
	{
	
		private var _nombre:String;
		private var _autor:String;
		
		public function get autor():String
		{
			return _autor;
		}
	
		public function set autor(autor:String):void
		{
			_autor = autor;
		}
	
		public function get nombre():String
		{
			return _nombre;
		}
	
		public function set nombre(nombre:String):void
		{
			_nombre = nombre;
		}
		
		
	}
}