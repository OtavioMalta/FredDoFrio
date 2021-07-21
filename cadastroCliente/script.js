function opc(){
    var opcoes = document.getElementsByName("inlineRadioOptions");
    var opcao;
    for(var i = 0; i<opcoes.length; i++ ){
        if(opcoes[i].checked){
            opcao = opcoes[i].value; 
            break;
        }
    }
    if(opcao == "opcao1"){
        document.getElementById("pf").style.display="grid";
        document.getElementById("pj").style.display="none";

    }else{
        document.getElementById("pf").style.display="none";
        document.getElementById("pj").style.display="grid";


    } 
}