function opcc(){
    let escolhida = document.querySelector('input[name="pessoa"]:checked');

    if(escolhida.value == "1"){
        document.getElementById("pf").style.display="block";
        document.getElementById("pj").style.display="none";

    }else{
        document.getElementById("pf").style.display="none";
        document.getElementById("pj").style.display="block";
    }
}