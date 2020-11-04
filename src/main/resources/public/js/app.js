var app = (function () {

	
	var numeros = function (error, info){
		if (error != null){
			alert("ocurrio un problema")
			return;	
		}
		$("#resultado").text(info.resultado);
	}
	
	var enviar = function (){
		var strings = $("#captura").val();
		apiclient.capturarDatos(strings, numeros);
	}
	

    return {
		capturarDatos : function(){
			enviar();
		}
    }
})();