function opcc(){
    let escolhida = document.querySelector('input[name="pessoa"]:checked');

    if(escolhida.value == "1"){
        document.getElementById("form-pessoa-fisica").style.display="block";
        document.getElementById("form-pessoa-juridica").style.display="none";

    }else{
        document.getElementById("form-pessoa-fisica").style.display="none";
        document.getElementById("form-pessoa-juridica").style.display="block";
    }
}