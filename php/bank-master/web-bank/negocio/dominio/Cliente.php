
<?php 

class Cliente {

	public $matricula;
	public $nome;
	
	
	public function __construct($nome = null, $matricula = null){
		$this->nome = $nome;
		$this->codigo = $codigo;
	}
		
	public function pegarDados(){
		
		$this->nome = $_GET["nome"];
		$this->matricula = $_GET["matricula"];
	}
	
	public function validarDados(){
	}

}

?>
