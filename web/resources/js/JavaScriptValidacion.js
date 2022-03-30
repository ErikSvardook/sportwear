        function valida_envia(){

    if (document.fvalida.NombreUsuario.value.length === 0)
    {
            alert("Tiene que escribir su nombre");
            document.fvalida.nombre.focus();
            return 0;
    }



	if (document.fvalida.contraseña.value.length===0){
            alert("Tiene que escribir su contraseña");
            document.fvalida.nombre.focus();
            return 0;
    }
    if (document.fvalida.sexo.value.length===0){
            alert("Tiene que seleccionar su sexo");
            document.fvalida.nombre.focus();
            return 0;
    }
    



     if (document.fvalida.edad.value.length===0){
            alert("Tiene que seleccionar su edad");
            document.fvalida.nombre.focus();
            return 0;
    }


   

    alert("Muchas gracias por enviar el formulario");
    document.fvalida.submit();
}




